# QEditText

## 描述
> 是一个高级的编辑器，支持使用`html`样式标签的富文本格式，支持`HTML4`标签子集，如果不过使用可以使用WebKit
> 可以加载纯文本和富文本，以显示图像，列表和表格

## 继承
- QAbstractScollArea 

## 功能作用
### 占位提示文本
    1. setPlaceholderText(str)
    2. placeholderText() -> str 

### 内容设置
#### 普通文本
    1. setPlainText(str)
    2. insertPlainText(str)
    > 定位在所有文本的最前边
    3. toPlainText() -> str

#### HTML
    1. setHtml(str)
    2. insertHtml(str)
    3. toHtml()
#### 设置文本(自动判定)
    1. setText(str)

#### 追加文本
    1. append(str)

#### 粘贴文本
    
#### 清空
    1. clear()

#### 文本光标
> 通过文本光标，可以操作编辑文本文档对象
- 概念
> 整个文本编辑器，其实就是为了编辑这个文本文档，提供了一个可视化的界面，

    1. document() -> QTextDocument
    2. textCursor() -> QTextCursor

        

### 自动格式化
### 覆盖模式
### 光标设置
### 对齐方式
### 字体格式
### 颜色设置
### 当前的字符格式
### 常用编辑操作
### 滚动
### 只读设置
### tab控制
### 锚点获取