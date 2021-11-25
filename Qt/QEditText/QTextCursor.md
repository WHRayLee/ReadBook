# QTextCursor
## 添加内容
### 插入文本
    1. insertText(str)
    2. insertText(QString text, QTextCharFormat format)
    3. insertHtml(html_str)
### 插入图片
    1. insertImage(QTextImageFormat)
        QTextImageFormat:
            a. setName("")
            b. setWidth()
            c. setHeight()
    2. insertImage(QTextImageFormat, QTextFrameFormat.Position)
    3. insertImage(name_str)
    4. insertImage(QImage, name_str=None)
### 插入句子
    1. insertFragment(QTextDocumentFragment)
        a. fromHtml(html_str)
        b. fromPlainText(str)

### 插入列表
    1. insertList(QTextListFormat)
        > 在当前位置插入一个新块，并使其称为具有给定格式的新创建列表的第一个列表项
    2. insertList(QTextListFromat.Style)
    3. createList(QTextListFormat)
        > 创建并返回具有给定格式的新列表，并使其当前段落的光标位于第一个列表项中
    4. createList(QTextListFormat.Style)

#### QTextListFormat
    1. setIndent(int)
    2. setNumberPrefix(str)
    3. setNumberSuffix(str)
    4. setStyle(QTextListFormat_Style)

#### QTextListFormat.Style
    1. QTextListFormat.ListDisc
    2. QTextListFormat.ListCircle
    3. QTextListFormat.ListSquare
    4. QTextListFormat.ListDecimal
    5. QTextListFormat.ListLowerAlpha
    6. QTextListFormat.ListUpperAlpha
    7. QTextListFormat.ListLowerRoman
    8. QTextListFormat.ListUpperRoman

### 插入表格
    1. insertTable(row, column)
    2. insertTable(row, column, QTextTableFormat)

#### QTextTableFormat
    1. setAlignment(Qt_Alignment, Qt_AlignmentFlag)
    2. setCellPadding(p_float)
    3. setCellSpacing(p_float)
    4. setColumnWithConstraints(Itertable, QTextLength)
### 插入文本块
    1. insertBlock()
    2. insertBlock(QTextBlockFormat)
    3. insertBlock(QTextBlockFormat, QTextCharFormat)

### 插入框架
    1. insertFrame()

## 设置和合并格式
    1. setBlockCharFormat(QTextCharFormat)
        > 设置要格式化的当前块的块格式
    2. setBlockFormat(QTextBlockFormat)
        > 设置当前块格式以进行格式化
    3. setCharFormat(QTextCharFormat)
        > 将光标当前字符格式设置为给定格式
    4. mergeBlockCharFormat(QTextCharFormat)
    5. mergeBlockFormat(QTextBlockFormat)
    6. mergeCharFormat(QTextCharFormat)