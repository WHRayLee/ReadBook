
```bash
github.com/boombuler/barcode
github.com/tuotoo/qrcode
```

```go

import (
    qr "github.com/tuotoo/qrcode"
    "github.com/boombuler/barcode"
    "os"
)
func GenerateQRCode(filename string, content string, weight int, height int) {
    qrCode, _ := qr.Encode(content, qr.M, qr.Auto)
    qrCode, _ = barcode.Scale(qrCode, weight, height)
    file, _ := os.Create(filename)
    defer file.Close()
    png.Encode(file, qrCode)
}
```

- github.com/claudiodangelis/qrcp