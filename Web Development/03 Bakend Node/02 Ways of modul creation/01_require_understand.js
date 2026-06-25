const { createServer } = require('node:http');
// reqiure ka use model import karne ke liye kiya jata hai.
// yaha http module ka use kiya gaya hai. http module ka use server create karne ke liye kiya jata hai.
// ye commanjs module hai. nodejs me module ko import karne ke liye require ka use kiya jata hai.
// commanjs default module system hai. nodejs me module ko import karne ke liye require ka use kiya jata hai.
// ye type ka tumhe package.json me define karna padega. "type": "commonjs" ya "type": "module".
// module me esko const { createServer } = require('node:http'); tumhe esse ka hoga 
// --> import http from 'node:http';  ye es6 module hai. nodejs me module ko import karne ke liye import ka use kiya jata hai.

const hostname = '127.0.0.1';
const port = 3000;

const server = createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/html');
  res.end('<h1>Maa ki ladle Mewooo</h1>');
});

server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});