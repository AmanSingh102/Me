import path from "path";

let mypath = "C:/Users/Aamann/Desktop/lecture/03 Read Write Using FS Module/promiss_file.txt";

console.log(path.extname(mypath)); // .txt

console.log(path.dirname(mypath)); // C:/Users/Aamann/Desktop/lecture/03 Read Write Using FS Module

console.log(path.basename(mypath)); // promiss_file.txt

console.log(path.join("C:/", "programs\\promiss_file.txt")); // C:/programs/promiss_file.txt