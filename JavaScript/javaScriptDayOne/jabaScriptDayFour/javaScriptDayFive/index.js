// forloop
// let arr = [1,2,3]

// for(let i = 0; i < arr.length; i++){
//     console.log(arr[i])
// }

// forEach is a function, and it takes a pram called callBackFunction

// arr.forEach(function(idx){
//     console.log(idx)
// })

// arr.forEach((idx)=>{
//     console.log(idx)
// })


// let newMap = arr.map(function(val){
// return val*2
// })

// let newMap = arr.map((val)=>{
//     return val*2
//     })
// console.log(arr)
// console.log(newMap)

let filterArray = ['spray','can','limit','apple','eye','me']

// let result = filterArray.filter(function(word){
//    return  word.length >=4
// })

// let result = filterArray.filter((word)=> word.length >=4)

// let result = filterArray.map(idx =>{
//     return idx
// }).filter(val=>{
//     return val.length >= 4
// })

// function add(){

// }

// es6
const add =(a,b)=>{
    let c = '8'
    let cn = Number(c)
return Number(a) + Number(b)
//     return a+b+Number(c)
//     return a+b+parseInt(c)
//  return a+b+(+c)
//  return a+b+cn
}


let sum = add(5,5)

// console.log(sum);

// eval('String')
// console.log(eval('5+5'))

// let arrTwo = [2,5, NaN, 12,'30']
// const nanNumber = (n) =>{
//     for(let i = 0; i < arrTwo.length; i++){
//     if(isNaN(n[i])){
//         return NaN
//     }
// }
//     return n

// }

// let result = nanNumber(arrTwo)
// console.log(typeof '5')
// console.log(result)



// console.log(arr.indexOf(NaN))


let arrThree = [1,2,3,5,7,8,9,0,3]

let spArr = []

// returns a new array
// console.log(arrThree.slice(5))
// does not return a new array
let a = arrThree.splice(5)

let fe = a.forEach(idx=>{
    spArr.push(idx)
})

console.log(spArr)

// let newResult = 
// console.log(newResult[0])
// will be the og 2
// pring from 1-7 
// console.log(arrThree)


let arr = [1,2,3]

for(let i = 0; i < arr.length; i++){
    try{
        console.log(eval('sfdggdryt'))
    }catch{
        console.log("Error on line 5")
    }
}