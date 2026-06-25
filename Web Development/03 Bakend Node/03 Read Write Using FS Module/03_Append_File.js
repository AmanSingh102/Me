const fs = require('fs');
// console.log(fs);    

console.log("starting the program");

// esse use karna best hai, ye asynchronous hai, isliye ye non-blocking hai, ye file write karte waqt niche wala console.log print ho jayega
fs.writeFile('C:/Users/Aamann/Desktop/lecture/03 Read Write Using FS Module/readme.txt', 'This file was created by Node.js', () => { 
    console.log("File created successfully");
    fs.readFile('C:/Users/Aamann/Desktop/lecture/03 Read Write Using FS Module/readme.txt', (error, data) => {
        console.log(error, data.toString());
   });
});

fs.appendFile('C:/Users/Aamann/Desktop/lecture/03 Read Write Using FS Module/readme.txt', 'This is the appended text', (error, data) => {
    console.log(data);
});

console.log("end of the program");
