const express = require('express');
const app = express();
const port = 3000;
const fs = require('fs');
const birds = require('./routes/birds');

// app.use(express.static('public'));

app.use('/birds', birds);

// middlleware 1
app.use((req, res, next) => {
    console.log('m1');
    console.log(req.headers);
    req.aman = " I am Badmos Boy";
    fs.appendFileSync('log.txt', `$date: ${Date.now()} is a ${req.method} request for ${req.url}\n`);
    console.log(`$date: ${Date.now()} is a ${req.method} request for ${req.url}`);
    // res.send('hacked by middleware 1');  // esko hata dene se request aage badhegi
    next();  // esko hatta dene se request aatak jayegi
});

// middlleware 2
app.use((req, res, next) => {
    console.log('m2');
    next();
});

app.get('/', (req, res) => {
    res.send('Hello World! My World is Express.js');
});

app.get('/index', (req, res) => {
    res.send('Hello World from index page! My World is Express.js');
});

app.get('/about', (req, res) => {
    res.send('Hello World from about page! My World is Express.js' + req.aman);
});

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`);
});