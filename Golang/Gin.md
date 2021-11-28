## HTTP
- 1.0
> 无状态，短连接

- 1.1
> 可以记录状态

- 2.0
> 可以支持长链接 `Connection:keep-alive`

## Cookie
- 作用
> 一定时间内，存储用户的连接信息

- 出身
> http 自带机制。Session不是

- 存储
> 存储在客户端
> 键值对，不安全。直接将数据存储在浏览器上

`SetCookie(name, value string, maxAge int, path, domain string, secure, httpOnly bool)`
- name: cookie的名字
- value: cookie的内容
- maxAge: 最大生命周期，大于0的部分，代表多少秒失效
    1. MaxAge=0 means no 'Max-Age' attribute specified.
	2. MaxAge<0 means delete cookie now, equivalently 'Max-Age: 0'
	3. MaxAge>0 means Max-Age attribute present and given in seconds
- path: 路径
- domain: 域名 IP地址
- secure: 是否设置安全保护
    - true：要进行安全检查
    - false：
- httpOnly: 是否针对HTTP协议

```go
engine.GET("/", func(context *gin.Context) {
	context.SetCookie("testCookieKey",
		"testCookieValue",
		60*60,
		"",
		"",
		false,
		true)
	context.Writer.WriteString("测试Cookie")
})
```

> 获取Cookie `context.Cookie()`

## Session
> 一次会话交流中，产生的数据，不是自带
> 一定时间内，存储用户的连接信息
> 在服务器上，一般为临时Session， 会话结束（浏览器关闭，Session被删除）

![Gin中间件](https://github.com/gin-contrib)

```bash
go get github.com/gin-contrib/sessions
```

```go
db, _ := sql.Open("postgres", "")
// 初始化容器
store, _ := postgres.NewStore(db, []byte("secret"))
// 设置Session的相关参数
store.Options(sessions2.Options{
	Path:     "",
	Domain:   "",
	MaxAge:   0,
	Secure:   false,
	HttpOnly: false,
})
// 初始化Session的中间件
sessMiddleFunc := sessions2.Sessions("cookieKey", store)
// 注册中间件
engine.Use(sessMiddleFunc)
engine.GET("/session", func(context *gin.Context) {
	// 封装传入的请求
	sess := sessions2.Default(context)
	get := sess.Get("sessKey")
	if get != "sessValue" {
		// 传入Key：value
		sess.Set("sessKey", "sessValue")
		// 保存，否则不生效
		sess.Save()
	}
})
```
## 中间件
> 只对设定以后的路由管用

```go
package middleware

import (
	"fmt"
	"github.com/gin-gonic/gin"
	"net/http"
)

func CheckSession() gin.HandlerFunc {
	return func(ctx *gin.Context) {
		fmt.Println("中间件1")
		return
		ctx.Next()
		fmt.Println("回来1")
	}
}

func CheckUserName(ctx *gin.Context) {
	fmt.Println("中间件2")
	ctx.Next()
	fmt.Println("回来2")
}

func MiddleWareFunc(ctx *gin.Context) {
	fmt.Println("中间件3")
	ctx.Abort()
}

func main()  {
	engine := gin.Default()
	engine.Use(CheckSession())
	engine.Use(CheckUserName)
	engine.GET("/", func(ctx *gin.Context) {
		ctx.String(http.StatusOK, "最终结果")
	})
	engine.Run(":8080")
}
```


> 官方案例
- 单个Session
```go
package main

import (
  "github.com/gin-contrib/sessions"
  "github.com/gin-contrib/sessions/cookie"
  "github.com/gin-gonic/gin"
)

func main() {
  r := gin.Default()
  store := cookie.NewStore([]byte("secret"))
  r.Use(sessions.Sessions("mysession", store))

  r.GET("/hello", func(c *gin.Context) {
    session := sessions.Default(c)

    if session.Get("hello") != "world" {
      session.Set("hello", "world")
      session.Save()
    }

    c.JSON(200, gin.H{"hello": session.Get("hello")})
  })
  r.Run(":8000")
}
```

- 多个Session
```go
package main

import (
  "github.com/gin-contrib/sessions"
  "github.com/gin-contrib/sessions/cookie"
  "github.com/gin-gonic/gin"
)

func main() {
  r := gin.Default()
  store := cookie.NewStore([]byte("secret"))
  sessionNames := []string{"a", "b"}
  r.Use(sessions.SessionsMany(sessionNames, store))

  r.GET("/hello", func(c *gin.Context) {
    sessionA := sessions.DefaultMany(c, "a")
    sessionB := sessions.DefaultMany(c, "b")

    if sessionA.Get("hello") != "world!" {
      sessionA.Set("hello", "world!")
      sessionA.Save()
    }

    if sessionB.Get("hello") != "world?" {
      sessionB.Set("hello", "world?")
      sessionB.Save()
    }

    c.JSON(200, gin.H{
      "a": sessionA.Get("hello"),
      "b": sessionB.Get("hello"),
    })
  })
  r.Run(":8000")
}
```


## 获取数据，绑定数据
1. form表单
> postForm() 获取form表单传递的数据

2. ajax
> 数据为json格式
> 针对 Request Payload数据形式，需要使用数据绑定的方式处理 ctx.Bind() 将数据绑定到对象中

```go
var regData struct {
    Mobile string `json:"mobile"`
    Password string `json:"password"`
    SmsCode string `json:"sms_code"`
}
ctx.Bind(&regData)
```
