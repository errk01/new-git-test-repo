// function saySomething(numOne, numTwo, numThree){
//     let result = 0;
//     return numOne + numTwo - numThree
// } 

// let result = saySomething(1,5, 10)


// console.log(result)



// creating a function using the keyword "function". Set prams
// function add(a,b){
// let sum = a+b;
// return the result of the function 
    // return sum
    // return a + b;
// }
// call the function with the name of the function
// let result = add(5,5)
// console.log(result)

// arrow function new with ES6
// const add = a => a !== 5 ? true : false



// function add(nums, str){
//     let sum = 0;
// // console.log('sum', sum)
// // console.log('length of the array',nums.length)
//     for(let i = 0; i < nums.length; i++){
//         // console.log('i of for loop', i)
//         sum += nums[i]
//     }
// //  console.log('return sum', sum)
//     return sum + str
// }

// let result  = add(5)

// console.log(result)



// gratuity billing app  

// Create a variable billAmount and store a random number (ie: 100)

// Create a function gratuity()

// gratutity should multiply the value of billAmount by 20% (hint: use 0.2) and return the value

// Create a function totalWithGrat()

// totalWithGrat should take in the amount as an argument, call the gratutity function, add the returned value to the original bill amount, and return the total bill + gratuity

// Append the return value of totalWithGrat to the following phrase: "Your total including gratuity is:" and log it to the console

// Only invoke the totalWithGrat function when logging the result

// Bonus: Find a way to fix the decimal point to only 2 places (ie: 120.00)
// let billDue = 100.59;


// let result = `Your total, including the gratuity is: $${totalWithGrat(billDue).toFixed(2)}`  
// console.log(result)


function gratutity(){

    return billDue * 0.2
}


function totalWithGrat(totalAmount){

    return gratutity() + totalAmount;
}

// cant call a variable function before the creation of the variable.
// diffFunction()

// let diffFunction = function(){
//     console.log("word")
// }



// let calc = {
//     add: function(a,b){
//         return a+b
//     }
// }

// let result = calc.add(2,8)
// console.log(result)


// let array = [
//     ['anonymos', 'arr'],
//     {name: 'anonymos obj'},
//     function(){return 'this function'}
// ]

// console.log(array[0][1])
// console.log(array[1].name)
// console.log(array[2]())



// (function(){
//     let str = "private variables"
  
// }());
// console.log(str)

// scope chain and closures


// let greet = function(){
//     console.log('hello ',city)
// }
// let city = "phx"

// greet()


// nested scope
// function outer(){
//     let x = 'x'
//     function inner(){
//         let y = 'y'
//         console.log(x)
//     }
//     inner()
//     console.log(x)
//     console.log(y)
// }

// outer()

// name conflicts

// const name = 'david';

// let greet = function(){
//        const name = 'Erik'
//     console.log(name)
// }


// console.log(name)
// greet();


// this.


// let teacher = {
//     name: 'Erik',
//     hello: function(){
//         console.log(this.name);
//     }
// }

// teacher.hello();

// function sayName(){
//     console.log(this.name)
// }

// let teacher1 = {
//     name:"asdf",
//     speak: sayName
// }


// let teacher2 = {
//     name:"fa",
//     speak: sayName
// }

// teacher1.speak()
// teacher.speak()

function add(arr){
    let sum = 0;
    for(let idx = 0; idx < arr.length; idx++){
        sum += arr[idx]
    }
    return sum;

}

let result = add([1,2,3,4])

console.log(result)


























