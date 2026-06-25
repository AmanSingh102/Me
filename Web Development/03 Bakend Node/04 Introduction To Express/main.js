const express = require('express');
const app = express();
const port = 3000;

app.use(express.static('public')); //    This line tells Express to serve static files from the 'public' directory. Any files in this directory can be accessed directly via their URL. For example, if there is a file named 'style.css' in the 'public' directory, it can be accessed at http://localhost:3000/style.css.

// app.get(path, handler), app.post, app.put, app.delete, etc. are used to define routes for different HTTP methods. In this case, we are defining a route for the GET method at the root URL ('/'). When a GET request is made to the root URL, the server will respond with 'Hello World!'.
app.get('/', (req, res) => {
    res.send('Hello World!');
});

app.get('/about', (req, res) => {
    res.send('Hello from about!');
});

app.get('/contact', (req, res) => {
    res.send('Hello from contact!');
});

app.get('/blog', (req, res) => {
    res.send('Hello from blog!');
});

app.get('/blog/intro-to-js', (req, res) => {
    res.send('Hello from intro to JS!');
});

app.get('/blog/:slug', (req, res) => {
    // res.send(`Hello ${req.params.slug} from blog!`);
    console.log(req.params); // will output { slug: 'intro-to-js' }
    console.log(req.query); // will output { name: 'John', age: '30' } if the URL is /blog/intro-to-js?name=John&age=30 
    res.send(`Hello ${req.params.slug}`);
});

app.get('/blog/:slug/:second', (req, res) => {
    res.send(`Hello ${req.params.slug} and ${req.params.second} from blog!`);
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});