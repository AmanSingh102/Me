const fs = require('fs');
// console.log(fs);    

console.log("starting the program");

// ye file write ho jayegi tab niche wala console.log tabhi print hoga
// ye approach synchronous hai, isliye ye blocking hai, ye tab tak wait karega jab tak file write nahi ho jati  
// approach accha nhi hai 
fs.writeFileSync('readme.txt', 'This file was created by Node.js');

console.log("File created successfully");
