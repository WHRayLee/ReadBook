# QAbstractScollArea
## 描述
> 是滚动区域的低级抽象
## 继承
> QFrame

## 功能作用
### 设置水平和垂直滚动条
    1. setHorizontalScrollBar(QScrollBar *scrollBar)
    2. setVerticalScrollBar(QScrollBar *scrollBar)
    3. horizontalScrollBar
    4. verticalScrollBar

### 滚动条策略
    1. setHorizontalScrollBarPolicy(Qt.ScrollBarPolicy)
    2. setVerticalScrollBarPolicy(Qt.ScrollBarPolicy)
    3. horizontalScrollBarPolicy()
    4. verticalScrollBarPolicy()

    - ScrollBarAsNeeded
    > 当内容太大的时候，不适合，这是默认值
    - ScrollBarAlwaysOff
    > 从不显示滚动条
    - ScrollBarAlwaysOn
    > 始终显示滚动条
### 角落控件
## 信号
### 继承父类