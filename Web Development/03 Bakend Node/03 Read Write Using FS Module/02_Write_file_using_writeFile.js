const fs = require('fs');
// console.log(fs);    

console.log("starting the program");

// esse use karna best hai, ye asynchronous hai, isliye ye non-blocking hai, ye file write karte waqt niche wala console.log print ho jayega
fs.writeFile('readme.txt', 'This file was created by Node.js', () => { 
    console.log("File created successfully");
    fs.readFile('readme.txt', (error, data) => {
        console.log(error, data.toString())
   })
})

console.log("end of the program");
