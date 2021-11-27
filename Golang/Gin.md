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
