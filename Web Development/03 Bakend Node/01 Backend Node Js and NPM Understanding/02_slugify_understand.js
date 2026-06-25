// YE URL KO SAHI BANANE KE LIYE USE HOTA HAI ( YA URL NAME ) BLOG WEBSITE MEIN USE HOTA HAI YE PACKAGE
var slugify = require('slugify')

let a = slugify('some string') // some-string
console.log(a)

// if you prefer something other than '-' as separator
const b =slugify('some string', '_')  // some_string
console.log(b)

// OUTPUT ----------------------------------------------------------------------
// [Running] node "c:\Users\Aamann\Desktop\lecture\Backend Node Js and NPM Understanding\slugify_understand.js"
// some-string
// some_string