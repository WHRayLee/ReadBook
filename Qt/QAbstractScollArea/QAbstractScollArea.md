# QAbstractScollArea
## 描述
> 是滚动区域的低级抽象
## 继承
> QFrame

```go
package main

import (
	"github.com/therecipe/qt/core"
	"github.com/therecipe/qt/gui"
	"github.com/therecipe/qt/widgets"
	"os"
)

func main() {
	application := widgets.NewQApplication(len(os.Args), os.Args)
	widget := widgets.NewQWidget(nil, 1)
	widget.Resize2(500, 500)
	//
	textEdit := widgets.NewQTextEdit(widget)
	textEdit.Resize2(50, 50)
	textEdit.SetVerticalScrollBarPolicy(core.Qt__ScrollBarAsNeeded)
	textEdit.SetHorizontalScrollBarPolicy(core.Qt__ScrollBarAlwaysOn)
	icon5 := gui.NewQIcon5("QT/QtDemo10/ok.png")
	button := widgets.NewQPushButton(widget)
	button.SetIcon(icon5)
	textEdit.SetCornerWidget(button)
	//
	widget.Show()
	os.Exit(application.Exec())
}

```

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
    1. setCornerWidget(QWidget *widget)
    2. cornerWidget()
## 信号
> 继承父类