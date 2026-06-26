// CRUD Operations in MongoDB
use("CrudDb");

// console.log(db);
db.createCollection("courses");

// Insert a single document into the "courses" collection
// db.courses.insertOne({
//     name: "Pado Free Course",
//     price: 80,
//     assignments: 12,
//     projects: 7
// })    

// Insert multiple documents into the "courses" collection
// db.courses.insertMany(
// [   
//     {
//     name: "Pado Free Course",
//     price: 80,
//     assignments: 12,
//     projects: 7
//   },
//   {
//     name: "JavaScript Mastery",
//     price: 199,
//     assignments: 20,
//     projects: 10
//   },
//   {
//     name: "React Bootcamp",
//     price: 299,
//     assignments: 18,
//     projects: 8
//   },
//   {
//     name: "Node.js Complete Guide",
//     price: 249,
//     assignments: 15,
//     projects: 9
//   },
//   {
//     name: "Python for Beginners",
//     price: 149,
//     assignments: 14,
//     projects: 6
//   },
//   {
//     name: "MongoDB Essentials",
//     price: 99,
//     assignments: 10,
//     projects: 5
//   },
//   {
//     name: "Full Stack Web Development",
//     price: 499,
//     assignments: 30,
//     projects: 15
//   },
//   {
//     name: "Data Structures & Algorithms",
//     price: 399,
//     assignments: 25,
//     projects: 12
//   },
//   {
//     name: "Express.js Crash Course",
//     price: 179,
//     assignments: 11,
//     projects: 7
//   },
//   {
//     name: "TypeScript Fundamentals",
//     price: 159,
//     assignments: 13,
//     projects: 6
//   }

// ])

// Read documents from the "courses" collection
// let a = db.courses.find({price:0})
// console.log(a);          // returns a cursor object, not the actual documents
// console.log(a.count());      // returns the count of documents matching the query
// console.log(a.toArray());   // returns an array of documents matching the query 

// Read a single document from the "courses" collection
// let b = db.courses.findOne({price:0})
// console.log(b);          // returns the first document matching the query 

// Update a single document in the "courses" collection
// db.courses.updateOne({price: 0},{ $set: {price: 100} })

// Update multiple documents in the "courses" collection
// db.courses.updateMany({price: 100},{ $set: {price: 1000} })

// Delete a single document from the "courses" collection
// db.courses.deleteOne({price: 1000})

// Delete multiple documents from the "courses" collection
// db.courses.deleteMany({price: 200})