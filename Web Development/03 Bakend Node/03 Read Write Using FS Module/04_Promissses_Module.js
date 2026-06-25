import fs from 'fs/promises';

console.log("starting the program");

// let a = await fs.writeFile('C:/Users/Aamann/Desktop/lecture/03 Read Write Using FS Module/promiss_file.txt', 'This file was created by Node.js');
let b = await fs.readFile('C:/Users/Aamann/Desktop/lecture/03 Read Write Using FS Module/promiss_file.txt');
console.log(b.toString());

let c = await fs.appendFile('C:/Users/Aamann/Desktop/lecture/03 Read Write Using FS Module/promiss_file.txt', '\n\nThis is the appended text');
console.log(b.toString(), c);

console.log("end of the program");