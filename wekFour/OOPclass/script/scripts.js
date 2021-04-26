// function newPerson(name){
// const obj = {};
// obj.name = name;
// obj.greeting = function(){
//     console.log(`Hi, I'm ${obj.name}.`)
// }

// return obj.name
// }

// // let result = newPerson("Erik");

// const Erik = newPerson('Erik')
// Erik.name;
// Erik.greeting
// console.log(Erik);


// function Person(first, last, age, favColor){
//     this.name = {
//         first: first,
//         last: last
//     }
//     this.age = age;
//     this.favColor = favColor;

//     this.bio = function(){
//         console.log(`Hi, I'm ${this.name.first} ${this.name.last}. My favorit color is ${this.favColor}.`)
//     }
//     this.greeting = function(){
//         console.log(`Hi, I'm ${this.name.first}.`)
//     }
// }

// let person1 = new Person('John','Doe', 45, 'green' );
// console.log()

// person1.bio()



// function Car(model, type, motor, year){
//     this.model = model;
//     this.type = type;
//     this.motor = motor;
//     this.year = year;

//     this.started= function(){
//         console.log(`Starting your car`)
//     }

//     this.checkMoter = function(){
//         console.log('car not started')
//     }
//     // console.log(this.model)
// }


// let car1 = new Car('ford','mustang', 'v8', 1999);

// console.log(car1.model)
// console.log(car1.type)
// console.log(car1.motor)
// car1.started()
// car1.checkMoter()

class Rectangle{
    constructor(height, width){
        this.height=height;
        this.width = width;
    }

    // Getter 
    get area(){
        return this.calcArea()
    }

    // Method
    calcArea(){
        return this.height * this.width;
    }

}
const square = new Rectangle(10,10)

console.log(square.calcArea())

