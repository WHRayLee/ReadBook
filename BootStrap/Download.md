# Download
> 下载Bootstrap以获得编译后的CSS和JavaScript、源代码，或者用你最喜欢的软件包管理器（如npm、RubyGems等）将其纳入。

## Compiled CSS and JS
> 下载适用于Bootstrap v4.0.0的即用型编译代码，可轻松放入你的项目中，其中包括。

- 经过编译和粉碎的CSS包（见CSS文件比较）
- 编译和粉碎的JavaScript插件
- 这不包括文档、源文件或任何可选的JavaScript依赖项（jQuery和Popper.js）

## Source files
> 通过下载我们的源代码Sass、JavaScript和文档文件，用你自己的资产管道编译Bootstrap。这个选项需要一些额外的工具。

- Sass编译器（支持Libsass或Ruby Sass），用于编译你的CSS。
- 用于CSS供应商前缀的自动前缀器
- 如果你需要构建工具，则包括用于开发Bootstrap及其文档的工具，但它们可能不适合你自己的目的。

## BootstrapCDN
> 使用BootstrapCDN跳过下载，向你的项目提供Bootstrap编译的CSS和JS的缓存版本。

```html
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
```

> 如果你使用我们编译的JavaScript，别忘了在它之前包含CDN版本的jQuery和Popper.js

```html
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
```