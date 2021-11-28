# Layout
> 用于布置你的Bootstrap项目的组件和选项，包括包装容器、强大的网格系统、灵活的媒体对象和响应式实用类。

## Containers
> 容器是Bootstrap中最基本的布局元素，在使用我们的默认网格系统时是必须的。
> 可以选择响应式的、固定宽度的容器（意味着它的最大宽度在每个断点上都会改变），也可以选择流体宽度（意味着它一直是100%的宽度）。

> 虽然容器可以嵌套，但大多数布局都不需要嵌套容器。

```html
<div class="container">
  <!-- Content here -->
</div>
```

> 使用.container-fluid来制作全宽的容器，横跨整个视口的宽度。

```html
<div class="container-fluid">
  ...
</div>
```

## Responsive breakpoints
> 由于Bootstrap的开发是以移动为先，我们使用了一些媒体查询来为我们的布局和界面创建合理的断点。这些断点主要是基于最小视口宽度，并允许我们在视口变化时放大元素。

> Bootstrap在我们的布局、网格系统和组件的源Sass文件中主要使用以下媒体查询范围或断点。

```less
// Extra small devices (portrait phones, less than 576px)
// No media query since this is the default in Bootstrap

// Small devices (landscape phones, 576px and up)
@media (min-width: 576px) { ... }

// Medium devices (tablets, 768px and up)
@media (min-width: 768px) { ... }

// Large devices (desktops, 992px and up)
@media (min-width: 992px) { ... }

// Extra large devices (large desktops, 1200px and up)
@media (min-width: 1200px) { ... }
```

> 由于我们用Sass编写源CSS，所以我们所有的媒体查询都可以通过Sass的混合函数来实现

```less
@include media-breakpoint-up(xs) { ... }
@include media-breakpoint-up(sm) { ... }
@include media-breakpoint-up(md) { ... }
@include media-breakpoint-up(lg) { ... }
@include media-breakpoint-up(xl) { ... }

// Example usage:
@include media-breakpoint-up(sm) {
  .some-class {
    display: block;
  }
}
```

> 我们偶尔也会使用另一个方向的媒体查询（给定的屏幕尺寸或更小）。

```less
// Extra small devices (portrait phones, less than 576px)
@media (max-width: 575.98px) { ... }

// Small devices (landscape phones, less than 768px)
@media (max-width: 767.98px) { ... }

// Medium devices (tablets, less than 992px)
@media (max-width: 991.98px) { ... }

// Large devices (desktops, less than 1200px)
@media (max-width: 1199.98px) { ... }

// Extra large devices (large desktops)
// No media query since the extra-large breakpoint has no upper bound on its width
```