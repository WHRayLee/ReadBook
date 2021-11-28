## BootStrap

> 想在你的项目中快速添加Bootstrap？使用BootstrapCDN，由MaxCDN的人免费提供。使用软件包管理器或需要下载源文件

### CSS
```html
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
```

### JS
>我们的许多组件需要使用JavaScript来运作。具体来说，它们需要jQuery、Popper.js和我们自己的JavaScript插件。将下面的`<script>`放在你的网页末尾，就在最后的`</body>`标签之前，以启用它们。
```
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
```

- 撤消的警报
- 用于切换状态和复选框/收音机功能的按钮
- 用于所有滑动行为、控制和指标的旋转木马
- 折叠用于切换内容的可见性
- 用于显示和定位的下拉列表（也需要Popper.js）。
- 用于显示、定位和滚动行为的模版
- 导航条，用于扩展我们的折叠插件以实现响应式行为
- 用于显示和定位的工具提示和弹出窗口（也需要Popper.js）。
- Scrollspy用于滚动行为和导航更新

## 案例

```html
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
    <h1>Hello, world!</h1>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
```

> Bootstrap采用了一些重要的全局样式和设置，你在使用它时需要注意，所有这些几乎都是针对跨浏览器样式的标准化。让我们深入了解一下。

### HTML5 doctype
> Bootstrap要求使用HTML5 doctype。没有它，你会看到一些不完整的造型，但包括它应该不会引起任何相当大的麻烦。

```html
<!doctype html>
<html lang="en">
  ...
</html>
```

### Responsive meta tag
> Bootstrap是移动优先开发的，在这个策略中，我们首先为移动设备优化代码，然后根据需要使用CSS媒体查询放大组件。为了确保所有设备的正确渲染和触摸缩放，在你的`<head>`中添加响应式视口元标签。

```html
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
```

### Box-sizing
> 为了在CSS中更直接地确定尺寸，我们将全局的box-sizing值从content-box切换到border-box。这可以确保填充不会影响元素的最终计算宽度，但这可能会给一些第三方软件带来问题，如谷歌地图和谷歌自定义搜索引擎。

> 在极少数情况下，你需要覆盖它，请使用类似以下的方法。

```css
.selector-for-some-widget {
  box-sizing: content-box;
}
```

> 通过上述片段，嵌套的元素--包括通过::before和::after生成的内容--将全部继承该.selector-for-some-widget的指定箱型尺寸。

### Reboot
> 为了改善跨浏览器的渲染，我们使用Reboot来纠正跨浏览器和设备的不一致，同时为常见的HTML元素提供稍有意见的重置。