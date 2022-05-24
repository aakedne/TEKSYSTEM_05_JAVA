// console.log("working")
// let name = "Bob"
// let hasJob = true
// let age = 22;

// create an obj
// let person = {
//     first_name:"Abdi",
//     last_name: "Kedne",
//     isWorking: false,
//     hasJob: true,
//     jobTitle:"Software Dev",
//     // Add function
//     fullName: function(){
//         return this.first_name + " " + this.last_name
//     }
// }
// //declaring obj
// let obj={}// obj with nothing
// //call the functions --functionName()--.
// console.log(person.fullName())

// let names =["sara", "Erik", "Abdi", "Avani", 234, true, 1234.45]

// console.log(names[5])

// attached to one class
// var obj1 = new object();
// var str = new String();
// var num = new Number();
// var bool = new Boolean();
// var arr= new Array();
// var date = new Date();

//math obj are Global
// Math.random();
// Math.floor();

// function person(firstName, lastName, age, hasHair){
//  this.firstName= firstName;
//  this.lastName= lastName;
//  this.age= age;
//  this.hasHairColor= hasHair;
//  this.changeName= function(name){
//      this.lastName= name;
//  }
// }
//slide 23 protypes
//obj
// var newPerson = new person("Kevin","Doe",68,true)
// console.log(newPerson.lastName)
// let nameChange= newPerson.changeName("Jones")
// let result= newPerson
// console.log(result)

// person.prototype.age= 54
// person.prototype.firstName= "Jim"
// console.log(result)

// console.log(nameChange)

// let names =["sara", "Erik", "Abdi", "Avani", 234, true, 1234.45]
// let arr=[
//     {firstName:"me"},
//     {jobTitle:"dev"},
//     {laptop:"MSI"},]

//Could be on the KBA
// slide 38
// pop removes the last item
// let lastItem = names.pop()
// console.log(lastItem)
// shift removes the first item
// let firstItem = names.shift()
// console.log(firstItem)

//push adds an item at the end of the array
// let addItem = names.push("Jane")

//unshift adds to the start of the array
// let addItemStart = names.unshift()

// function revWord(word){
//     return word.split('').reverse().join('');
// }
// console.log(revWord("hello"))

// console.log(names)

// let str='anything'

// console.log(str.split(''))
//    console.log(str.slice(0,3))

//    console.log(names.splice(2,2 "Apple","kiwi"))

// var date = new Date()
// console.log(date.getFullYear())

// class person{
//     constructor(firstName,lastName,age,hasHair) {
//     this.firstName= firstName;
//     this.lastName= lastName;
//     this.age= age;
//     this.hasHair= hasHair;
//     this.changeName= function(name)
//         this.lastName= name;

// }
//     }

let arr = [22, 11, 667, 20, 33];

let newLoop = arr.forEach(function(n)){
    return n
}
console.log(newLoop)

let newArr = [];
// for(let i = 0; i < arr.length; i++){
//     newArr+=arr[i]
//     newArr.push(arr[i])
// loop throught an array use for of
// for(let i of arr){
//     if([i] >= 40)
//     newArr.push(i)

// }
// console.log(newArr)

// function addonemore(){

// const addOne = (a) => {
//   console.log(a + 1);
// };n
// console.log(addOne(2));

let input = prompt("Enter a range from (10-30")
let range = input.split("")
let guessNumber = Math.floor(Math.random()*(Number(range[1] - Number(range[0]))
+Number(range[0])))

let stop = 0;

let userGuess = prompt(`Guess a number between ${range[0]} and ${range[1]}`)

while(stop <10){
    if(guess === userGuess){
        alert("You guessed right: " +userGuess)
        break;
    }
    userGuess = prompt(`Keep guessing a number between ${range[0]} and ${range[1]}}`)
}
if(guessNumber !== userGuess){
    alert(``)
}
