# QFrame
## 描述

> 主要用来控制一些边框样式

- 凸起
- 凹下
- 阴影
- 线宽

## 继承
> QWidget

## 功能作用
### 创建QFrame对象

(QFrame仰视图)[https://github.com/WHRayLee/ReadBook/blob/main/Qt/QFrame%E6%A0%B7%E5%BC%8F%E5%9B%BE.png]

### 框架形状
#### API
- setFrameShape(QFrame.Shape)
    1. QFrame.NoFrame
    > QFrame什么都没有画
    
    2. QFrame.Box
    > QFrame围绕其内容绘制一个框
    
    3. QFrame.Panel
    > QFrame 绘制一个面板，使内容显得凸起或者凹陷
    
    4. QFrame.HLine
    > QFrame 绘制一条没有框架的水平线（用作分隔符）
    
    5. QFrame.VLine
    > QFrame 绘制一条没有框架的垂直线（用作分隔符）
    
    6. QFrame.StyledPanel
    > 绘制一个矩形米板，其外观处于决定当前的GUI样式
    
    7. QFrame.WinPanel
    > 绘制一个可以像Windows 2000中那样凸起或者凹陷的
    > 指定此形状可以将线宽设置为2像素

- frameShape() -> QFrame.Shape

### 框架阴影
- setFrameShadow(QFrame.Shadow)
    1. QFrame.Plain
    > 框架和内容与周围环境呈现水平

    2. QFrame.Raised
    > 框架和内容出现；使用当前颜色组的浅色和深色绘制

    3. QFrame.Sunken
    > 框架和内容出现凹陷；使用当前颜色组的浅色和深色


- frameShadow() -> QFrame.Shadow
### 框架的几个线宽
- 外线宽度 
    1. setLineWidth(int width)
    2. lineWidth()

- 中线宽度
    1. setMidLineWidth(int width)
    2. midLineWidth()
- 总宽度
    1. frameWidth()

### 框架样式

### 框架矩阵

## 信号