# Captcha

```bash
go get github.com/dchest/captcha
```

> 写回图片的设置
```go
package controller

import (
	"github.com/dchest/captcha"
	"github.com/gin-gonic/gin"
	"net/http"
)

type CaptchaInfo struct {
	CaptchaId string
	ImageUrl string
}

func GetCaptcha(ctx *gin.Context) {
	defaultLen := captcha.DefaultLen
	id := captcha.NewLen(defaultLen)
	captchaInfo := &CaptchaInfo{}
	captchaInfo.CaptchaId = id
	captchaInfo.ImageUrl = "/captcha/" + captchaInfo.CaptchaId + ".png"
	ctx.JSON(http.StatusOK, captchaInfo)

	return
}
```


```go
package controller

import (
	"fmt"
	"github.com/dchest/captcha"
	"github.com/gin-gonic/gin"
	"net/http"
	"path"
)

func GetCaptchaImage(ctx *gin.Context) {
	captchaId := ctx.Param("captchaId")
	if captchaId == "" {
		ctx.String(http.StatusBadRequest, "参数错误")
		return
	}
	_, file := path.Split(ctx.Request.URL.Path)
	ext := path.Ext(file)
	id := file[:len(file) - len(ext)]
	if ext == "" || id == "" {
		ctx.String(http.StatusNotFound, "资源不存在")
	}
	lang := ctx.Request.FormValue("lang")
	ctx.Writer.Header().Set("Cache-Control", "no-cache, no-store, must-revalidate")
	ctx.Writer.Header().Set("Pragma", "no-cache")
	ctx.Writer.Header().Set("Expires", "0")
	switch ext {
	case ".png":
		ctx.Writer.Header().Set("Content-Type", "image/png")
		captcha.WriteImage(ctx.Writer, id, captcha.StdWidth, captcha.StdHeight)
	case ".wav":
		ctx.Writer.Header().Set("Content-Type", "audio/x-wav")
		captcha.WriteAudio(ctx.Writer, id, lang)
	default:
		fmt.Println(captcha.ErrNotFound)
	}
}

```


```go
package controller

import (
	"github.com/dchest/captcha"
	"github.com/gin-gonic/gin"
	"net/http"
)

func GetCaptchaCheckStatus(ctx *gin.Context) {
	captchaId := ctx.Request.FormValue("captchaId")
	value := ctx.Request.FormValue("value")
	verifyString := captcha.VerifyString(captchaId, value)
	if verifyString {
		ctx.JSON(http.StatusOK, "验证成功")
		return
	}
	ctx.JSON(http.StatusOK, "验证失败")
}
```