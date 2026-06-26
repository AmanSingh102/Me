const path = require("path");
const fs = require("fs/promises");

let target = "C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files"

// checking availible file extensions
// console.log(path.basename(target))
// console.log(fs.readdirSync(target))

//webp,png,jpeg,jpg -images
//exe
//pdf
//zip rar
//mp3
//docx 
//mp4
//others

//created the directories that we need for sorting our files
// fs.mkdirSync("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\Audio and songs",{recursive:true})
// fs.mkdirSync("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\PDFs and Docs")
// fs.mkdirSync("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\Videos")
// fs.mkdirSync("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\Apps")
// fs.mkdirSync("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\zip and rar")
// fs.mkdirSync("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\Images")
// fs.mkdirSync("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\Others")

async function moveFiles() {
    try {
        const folders = {
            Apps: [".exe", ".msi", ".bat"],
            Images: [".jpg", ".jpeg", ".png", ".gif", ".webp"],
            Videos: [".mp4", ".mkv", ".avi"],
            Documents: [".pdf", ".docx", ".txt", ".csv"],
            Zip: [".zip", ".rar"],
            Songs: [".mp3"]
        };

        const files = await fs.readdir(target)
        let count = 0;

        for (const file of files) {
            const ext = path.extname(file)
            if (folders.Apps.includes(ext)) {
                const oldPath = path.join(target, file) //initializing current/old path
                const newPath = path.join("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\Apps", file)  //initializing destination/new path
                await fs.rename(oldPath, newPath) //moving files
                count++;
                console.log(`${file} moved`); //logging files changes
            }
            else if (folders.Images.includes(ext)) {
                const oldPath = path.join(target, file) //initializing current/old path
                const newPath = path.join("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\Images", file)  //initializing destination/new path
                await fs.rename(oldPath, newPath) //moving files
                count++;
                console.log(`${file} moved`); //logging files changes
            } else if (folders.Zip.includes(ext)) {
                const oldPath = path.join(target, file) //initializing current/old path
                const newPath = path.join("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\zip and rar", file)  //initializing destination/new path
                await fs.rename(oldPath, newPath) //moving files
                count++;
                console.log(`${file} moved`); //logging files changes
            } else if (folders.Songs.includes(ext)) {
                const oldPath = path.join(target, file) //initializing current/old path
                const newPath = path.join("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\Audio and songs", file)  //initializing destination/new path
                await fs.rename(oldPath, newPath) //moving files
                count++;
                console.log(`${file} moved`); //logging files changes
            } else if (folders.Documents.includes(ext)) {
                const oldPath = path.join(target, file) //initializing current/old path
                const newPath = path.join("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\PDFs and Docs", file)  //initializing destination/new path
                await fs.rename(oldPath, newPath) //moving files
                count++;
                console.log(`${file} moved`); //logging files changes
            } else if (folders.Videos.includes(ext)) {
                const oldPath = path.join(target, file) //initializing current/old path
                const newPath = path.join("C:\\Users\\Aamann\\Desktop\\lecture\\08 Exercise Shorts Files By Extensions\\random Files\\Videos", file)  //initializing destination/new path
                await fs.rename(oldPath, newPath) //moving files
                count++;
                console.log(`${file} moved`); //logging files changes
            }
        }
        console.log(`${count} files moved successfully`); //logging total file that moved
    } catch (err) {
        console.log(err);
    }
}

moveFiles()