
// function myDisplay(someThing){
//  document.getElementById("demo").innerHTML = someThing;
// }

// function myCalc(num1, num2, callback) {
//     let sum = num1 + num2
//     callback(sum);
// }

// let result = myCalc(0,3)
// myDisplay(result);

// myCalc(5, 5, myDisplay);

// let array = [1,2,3]

// let sum = array.map((i)=>{
//     return i;
// })


// let numbers = [1,2,3,4,5,6]

// numbers.sort((a, b) => a - b)

// console.log(numbers)



// console.log("one")

// setTimeout(function afterTwo() {
//     console.log("two")
    
// }, 2000)

// console.log("three")

// function myFunction() {
//     let date = new Date();

//     document.getElementById("demo").innerHTML = 
//     date.getHours() + ":"+
//     date.getMinutes() + ":"+
//     date.getSeconds()
// }
// myFunction()

// function myDisplay(someThing){
//  document.getElementById("demo").innerHTML = someThing;
// }


// function getFile(callback) {
//     let req = new XMLHttpRequest()
//     req.open("GET", "myCar")
//     req.onload = function(){
//         if(req.status == 200){
//             callback(this.responseText)
//         }else{
//             callback("Error", req.status)
//         }
//     }
//     req.send();
// }


// getFile(myDisplay)


// function add (num1, num2){
    
// }

// function sub (num1, num2){
    
// }



// document.addEventListener('click',function(sum){
//    return sum;
// })

	
module.exports.submit = handleFile 

import { readFile } from 'fs'

readFile('/Index.html', handleFile)

function handleFile (error, file) {
  if (error) return console.error('Uhoh, there was an error', error)
  // otherwise, continue on and use `file` in your code
}



