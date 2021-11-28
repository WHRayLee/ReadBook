# Contents
> 发现Bootstrap中包含的内容，包括我们的预编译和源代码的味道。记住，Bootstrap的JavaScript插件需要jQuery。

## Precompiled Bootstrap
> 这是Bootstrap最基本的形式：预编译的文件，几乎可以在任何网络项目中快速使用。我们提供
- 已编译的CSS和JS（bootstrap.*）
- 已编译和最小化的CSS和JS（bootstrap.min.*）。
- CSS源码图（bootstrap.*.map）可用于某些浏览器的开发工具
- 捆绑的JS文件（bootstrap.bundle.js和最小化的bootstrap.bundle.min.js）
> 包括Popper，但不包括jQuery。
```
bootstrap/
├── css/
│   ├── bootstrap.css
│   ├── bootstrap.css.map
│   ├── bootstrap.min.css
│   ├── bootstrap.min.css.map
│   ├── bootstrap-grid.css
│   ├── bootstrap-grid.css.map
│   ├── bootstrap-grid.min.css
│   ├── bootstrap-grid.min.css.map
│   ├── bootstrap-reboot.css
│   ├── bootstrap-reboot.css.map
│   ├── bootstrap-reboot.min.css
│   └── bootstrap-reboot.min.css.map
└── js/
    ├── bootstrap.bundle.js
    ├── bootstrap.bundle.min.js
    ├── bootstrap.js
    └── bootstrap.min.js
```

## CSS files
<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">CSS files</th>
      <th scope="col">Layout</th>
      <th scope="col">Content</th>
      <th scope="col">Components</th>
      <th scope="col">Utilities</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">
        <div><code class="font-weight-normal text-nowrap">bootstrap.css</code></div>
        <div><code class="font-weight-normal text-nowrap">bootstrap.min.css</code></div>
      </th>
      <td class="text-success">Included</td>
      <td class="text-success">Included</td>
      <td class="text-success">Included</td>
      <td class="text-success">Included</td>
    </tr>
    <tr>
      <th scope="row">
        <div><code class="font-weight-normal text-nowrap">bootstrap-grid.css</code></div>
        <div><code class="font-weight-normal text-nowrap">bootstrap-grid.min.css</code></div>
      </th>
      <td class="bg-light text-muted">Only grid system</td>
      <td class="bg-light text-muted">Not included</td>
      <td class="bg-light text-muted">Not included</td>
      <td class="bg-light text-muted" >Only flex utilities</td>
    </tr>
    <tr>
      <th scope="row">
        <div><code class="font-weight-normal text-nowrap">bootstrap-reboot.css</code></div>
        <div><code class="font-weight-normal text-nowrap">bootstrap-reboot.min.css</code></div>
      </th>
      <td class="bg-light text-muted">Not included</td>
      <td class="bg-light text-muted">Only Reboot </td>
      <td class="bg-light text-muted">Not included</td>
      <td class="bg-light text-muted">Not included</td>
    </tr>
  </tbody>
</table>

## JS files

<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">JS files</th>
      <th scope="col">Popper</th>
      <th scope="col">jQuery</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">
        <div><code class="font-weight-normal text-nowrap">bootstrap.bundle.js</code></div>
        <div><code class="font-weight-normal text-nowrap">bootstrap.bundle.min.js</code></div>
      </th>
      <td class="text-success">Included</td>
      <td class="bg-light text-muted">Not included</td>
    </tr>
    <tr>
      <th scope="row">
        <div><code class="font-weight-normal text-nowrap">bootstrap.js</code></div>
        <div><code class="font-weight-normal text-nowrap">bootstrap.min.js</code></div>
      </th>
      <td class="bg-light text-muted">Not included</td>
      <td class="bg-light text-muted">Not included</td>
    </tr>
  </tbody>
</table>

## Bootstrap source code
> Bootstrap源代码下载包括预编译的CSS和JavaScript资产，以及源码Sass、JavaScript和文档。更具体地说，它包括以下内容和更多

```
bootstrap/
├── dist/
│   ├── css/
│   └── js/
├── docs/
│   └── examples/
├── js/
└── scss/
```

> scss/ 和 js/ 是我们的CSS和JavaScript的源代码。dist/文件夹包括上面预编译下载部分中列出的所有内容。docs/文件夹包括我们文档的源代码，以及Bootstrap使用的例子/。除此之外，任何其他包含的文件都提供了对包、许可证信息和开发的支持。