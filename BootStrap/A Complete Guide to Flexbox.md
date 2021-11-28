# A complete Guide to Flex
> 父元素（flex container）和子元素（flex items）

## Background
> The main idea behind the flex layout is to give the container the ability to alter its items’ width/height (and order) to best fill the available space (mostly to accommodate to all kind of display devices and screen sizes). A flex container expands items to fill available free space or shrinks them to prevent overflow.

> 弹性布局背后的主要想法是让容器有能力改变其项目的宽度/高度（和顺序），以最好地填充可用空间（主要是为了适应各种显示设备和屏幕尺寸）。一个灵活的容器可以扩展项目以填充可用的自由空间，也可以收缩项目以防止溢出。

> the flexbox layout is direction-agnostic as opposed to the regular layouts (block which is vertically-based and inline which is horizontally-based).

> 与常规布局（基于垂直方向的block和基于水平方向的inline）相比，flexbox布局是不分方向的。

## Basics and terminology
> Since flexbox is a whole module and not a single property, it involves a lot of things including its whole set of properties. Some of them are meant to be set on the container (parent element, known as “flex container”) whereas the others are meant to be set on the children (said “flex items”)

![Flex](https://github.com/WHRayLee/ReadBook/blob/main/BootStrap/00-basic-terminology.svg)

- 横向是 main,依据于排列的方向，确认哪一条轴是main
- 纵向是 cross

1. main axis – The main axis of a flex container is the primary axis along which flex items are laid out. Beware, it is not necessarily horizontal; it depends on the flex-direction property (see below).

2. main-start | main-end – The flex items are placed within the container starting from main-start and going to main-end.

3. main size – A flex item’s width or height, whichever is in the main dimension, is the item’s main size. The flex item’s main size property is either the ‘width’ or ‘height’ property, whichever is in the main dimension.

4. cross axis – The axis perpendicular to the main axis is called the cross axis. Its direction depends on the main axis direction.

5. cross-start | cross-end – Flex lines are filled with items and placed into the container starting on the cross-start side of the flex container and going toward the cross-end side.

6. cross size – The width or height of a flex item, whichever is in the cross dimension, is the item’s cross size. The cross size property is whichever of ‘width’ or ‘height’ that is in the cross dimension.

## Flexbox properties
### Container
#### display
> This defines a flex container; inline or block depending on the given value. It enables a flex context for all its direct children

```css
.container {
  display: flex; /* or inline-flex */
}
```

#### flex-direction
> Flexbox is (aside from optional wrapping) a single-direction layout concept. Think of flex items as primarily laying out either in horizontal rows or vertical columns.

```css
.container {
  flex-direction: row | row-reverse | column | column-reverse;
}
```

- row (default): left to right in ltr; right to left in rtl
- row-reverse: right to left in ltr; left to right in rtl
- column: same as row but top to bottom
- column-reverse: same as row-reverse but bottom to top

#### flex-wrap
> By default, flex items will all try to fit onto one line. You can change that and allow the items to wrap as needed with this property.

```css
.container {
  flex-wrap: nowrap | wrap | wrap-reverse;
}
```
- nowrap (default): all flex items will be on one line
- wrap: flex items will wrap onto multiple lines, from top to bottom
- wrap-reverse: flex items will wrap onto multiple lines from bottom to top.

#### flex-flow
> This is a shorthand for the flex-direction and flex-wrap properties, which together define the flex container’s main and cross axes. The default value is row nowrap.

```css
.container {
  flex-flow: column wrap;
}
```

#### justify-content
```css
.container {
  justify-content: flex-start | flex-end | center | space-between | space-around | space-evenly | start | end | left | right ... + safe | unsafe;
}
```

- flex-start (default): items are packed toward the start of the flex-direction.

- flex-end: items are packed toward the end of the flex-direction.

- start: items are packed toward the start of the writing-mode direction.

- end: items are packed toward the end of the writing-mode direction.

- left: items are packed toward left edge of the container, unless that doesn’t make sense with the flex-direction, then it behaves like start.

- right: items are packed toward right edge of the container, unless that doesn’t make sense with the flex-direction, then it behaves like end.

- center: items are centered along the line

- space-between: items are evenly distributed in the line; first item is on the start line, last item on the end line

- space-around: items are evenly distributed in the line with equal space around them. Note that visually the spaces aren’t equal, since all the items have equal space on both sides. The first item will have one unit of space against the container edge, but two units of space between the next item because that next item has its own spacing that applies.

- space-evenly: items are distributed so that the spacing between any two items (and the space to the edges) is equal.