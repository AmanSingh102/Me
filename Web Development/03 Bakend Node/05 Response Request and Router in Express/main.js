const express = require('express')
const blog = require('./routes/blog')
const shop = require('./routes/shop')
const app = express()
const port = 3000

app.use('/blog', blog);
app.use('/shop', shop);
app.use(express.static("public"))

app.get('/', (req, res) => {
  console.log('Request received from get')
  res.send('Hello World from get')
})

app.post('/', (req, res) => {
  console.log('Request received from post')
  res.send('Hello World from post')
})

app.get("/index", (req, res) => {
  console.log('Hey its index page')
  res.sendFile('templates/index.html', { root: __dirname })
})

app.get("/api", (req, res) => {
  // res.json({ message: 'Hello World from API' })
  res.json({ a: 1, b: 2, c: 3 })
})



app.listen(3000, () => {
  console.log('Server is running on http://localhost:3000')
})