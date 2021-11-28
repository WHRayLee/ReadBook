# Grid system
> 使用我们强大的移动优先的Flexbox网格来构建各种形状和尺寸的布局，这要归功于一个十二列系统、五个默认的响应层、Sass变量和混合元素以及几十个预定义的类。

```html
<div class="container">
  <div class="row">
    <div class="col-sm">
      One of three columns
    </div>
    <div class="col-sm">
      One of three columns
    </div>
    <div class="col-sm">
      One of three columns
    </div>
  </div>
</div>
```

> 上面的例子使用我们预定义的网格类在小型、中型、大型和超大型设备上创建了三个等宽的列。这些列在页面中与 `.container`中

- 容器提供了一种手段，可以将你的网站内容居中和水平排列。使用`.container`来获得响应的像素宽度，或者使用`.container-fluid`来获得宽度：在所有视口和设备尺寸下都是100%。

- 行是列的包装器。每一列都有水平填充物（称为沟槽），用于控制它们之间的空间。这种填充物在行上被负的边距抵消了。这样，你的列中的所有内容在视觉上都是在左边对齐的。

- 在网格布局中，内容必须放在列中，而且只有列可以成为行的直接子女。

- 多亏了flexbox，没有指定宽度的网格列会自动布局为等宽的列。例如，四个`.col-sm`的实例将自动从小断点开始，每个都是25%的宽度。

- 列类表明你想在每行可能的12列中使用的列数。因此，如果你想有三个等宽的横列，你可以使用`.col-4`。

- 列的宽度是按百分比设置的，所以它们总是流动的，并且是相对于它们的父元素的尺寸。

- 列有水平填充物，以创建单个列之间的沟槽，然而，你可以用`.row`上的`.no-gutters`来移除行的边距和列的填充物。

- 为了使网格具有响应性，有五个网格断点，每个响应性断点都有一个：`all breakpoints (extra small)`, `small`, `medium`, `large`, and `extra large`.。

- 网格断点是基于最小宽度的媒体查询，这意味着它们适用于那个断点和上面的所有断点（例如，.col-sm-4适用于小型、中型、大型和超大的设备，但不适用于第一个xs断点）。

- 你可以使用预定义的网格类（如.col-4）或Sass混合类来实现更多的语义标记。

- 要注意围绕flexbox的限制和错误，比如不能使用一些HTML元素作为flex容器。



## Auto-layout columns
> 利用特定于断点的列类，以便在没有像.col-sm-6这样明确的编号类的情况下轻松确定列的大小。

## Equal-width
> 例如，这里有两个网格布局，适用于每个设备和视口，从xs到xl。为你需要的每个断点添加任意数量的无单位类，每一列都将是相同的宽度

```html
<div class="container">
  <div class="row">
    <div class="col">
      1 of 2
    </div>
    <div class="col">
      2 of 2
    </div>
  </div>
  <div class="row">
    <div class="col">
      1 of 3
    </div>
    <div class="col">
      2 of 3
    </div>
    <div class="col">
      3 of 3
    </div>
  </div>
</div>
```

## Setting one column width
> Flexbox网格列的自动布局也意味着你可以设置一列的宽度，并让同级列围绕它自动调整大小。

```html
<div class="container">
  <div class="row">
    <div class="col">
      1 of 3
    </div>
    <div class="col-6">
      2 of 3 (wider)
    </div>
    <div class="col">
      3 of 3
    </div>
  </div>
  <div class="row">
    <div class="col">
      1 of 3
    </div>
    <div class="col-5">
      2 of 3 (wider)
    </div>
    <div class="col">
      3 of 3
    </div>
  </div>
</div>
```

## Variable width content
> 使用col-{breakpoint}-auto类，根据其内容的自然宽度确定列的大小

```html
<div class="container">
  <div class="row justify-content-md-center">
    <div class="col col-lg-2">
      1 of 3
    </div>
    <div class="col-md-auto">
      Variable width content
    </div>
    <div class="col col-lg-2">
      3 of 3
    </div>
  </div>
  <div class="row">
    <div class="col">
      1 of 3
    </div>
    <div class="col-md-auto">
      Variable width content
    </div>
    <div class="col col-lg-2">
      3 of 3
    </div>
  </div>
</div>
```

## Equal-width multi-row
> Create equal-width columns that span multiple rows by inserting a `.w-100` where you want the columns to break to a new line. 
> 意思是说列宽被指定，当超过指定的长度之后就自动换行

```html
<div class="row">
  <div class="col">col</div>
  <div class="col">col</div>
  <div class="w-100"></div>
  <div class="col">col</div>
  <div class="col">col</div>
</div>
```

## All breakpoints
> 对于从最小的设备到最大的设备都一样的网格，使用.col和.col-*类。当你需要一个特别大小的列时，指定一个编号的类；否则，请随意坚持使用.col

```html
<div class="row">
  <div class="col">col</div>
  <div class="col">col</div>
  <div class="col">col</div>
  <div class="col">col</div>
</div>
<div class="row">
  <div class="col-8">col-8</div>
  <div class="col-4">col-4</div>
</div>
```

## Stacked to horizontal
> 使用一组.col-sm-*类，你可以创建一个基本的网格系统，在小断点（sm）处开始时是堆叠的，然后变为水平。

```html
<div class="row">
  <div class="col-sm-8">col-sm-8</div>
  <div class="col-sm-4">col-sm-4</div>
</div>
<div class="row">
  <div class="col-sm">col-sm</div>
  <div class="col-sm">col-sm</div>
  <div class="col-sm">col-sm</div>
</div>
```

## Mix and match
> 不想让你的列简单地堆积在一些网格层中？根据需要为每层使用不同的类的组合。

```html
<!-- Stack the columns on mobile by making one full-width and the other half-width -->
<div class="row">
  <div class="col-12 col-md-8">.col-12 .col-md-8</div>
  <div class="col-6 col-md-4">.col-6 .col-md-4</div>
</div>

<!-- Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop -->
<div class="row">
  <div class="col-6 col-md-4">.col-6 .col-md-4</div>
  <div class="col-6 col-md-4">.col-6 .col-md-4</div>
  <div class="col-6 col-md-4">.col-6 .col-md-4</div>
</div>

<!-- Columns are always 50% wide, on mobile and desktop -->
<div class="row">
  <div class="col-6">.col-6</div>
  <div class="col-6">.col-6</div>
</div>
```

## Alignment
> 使用flexbox对齐工具来垂直和水平地对齐列。

```html
<div class="container">
  <div class="row align-items-start">
    <div class="col">
      One of three columns
    </div>
    <div class="col">
      One of three columns
    </div>
    <div class="col">
      One of three columns
    </div>
  </div>
  <div class="row align-items-center">
    <div class="col">
      One of three columns
    </div>
    <div class="col">
      One of three columns
    </div>
    <div class="col">
      One of three columns
    </div>
  </div>
  <div class="row align-items-end">
    <div class="col">
      One of three columns
    </div>
    <div class="col">
      One of three columns
    </div>
    <div class="col">
      One of three columns
    </div>
  </div>
</div>
```