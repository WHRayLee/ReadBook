# MarkdownToHtml

```bash
github.com/russross/blackfriday
```

```bash
package main

import (
	"github.com/russross/blackfriday/v2"
	"html/template"
	"io/ioutil"
	"log"
	"net/http"
)

type MK struct {
	Content template.HTML
}
func Js(w http.ResponseWriter, r *http.Request) {
	f, err := ioutil.ReadFile("MarkdownToHtml/demo.md")
	if err != nil {
		log.Println(err.Error())
	}

	content := template.HTML(blackfriday.Run(f))
	mk := MK{Content: content}

	t, _ := template.ParseFiles("MarkdownToHtml/demo.html")
	t.Execute(w, mk)
}

func main() {
	mux := http.NewServeMux()


	mux.HandleFunc("/js", Js)

	log.Println("starting server on :8080")
	log.Fatal(http.ListenAndServe(":8080", mux))
}

```