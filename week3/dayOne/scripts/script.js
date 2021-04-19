// let teachers = ['Erik', 'Shane','Jill']

//console.log(teachers)

// push adds to the back of the array
// teachers.push("John")

//console.log(teachers)

// pop removes the last item of the array
// let newTeacher = teachers.pop()

//console.log(newTeacher)
//console.log(teachers)

//unshift adds the item to the front of the array
// teachers.unshift('Sam')

//console.log(teachers)

// shift removes the first item from the array
// let teacherArr = teachers.shift()

//console.log(teacherArr)

// console.log(teachers)

// teachers[1] = 'James'

// teachers[0] = 'Sara'

// console.log(teachers)

// let a = [10,'Bob', 9, 8, 15];

// console.log(a.length)

// console.log(a.indexOf(15))

let num = [1, 2, 3, 4, 5];

let a = num.slice(0, 2);

// console.log(a)
// console.log(num)

// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/splice
let b = num.splice(1, 2, "d", "Joe");

// console.log(b)
// console.log(num)

let teachers = ["Erik", "Shane", "Jill"];

// for(let i = 0; i < teachers.length; i++){
//     console.log(teachers[i]);
// }

// teachers.forEach(function(item,index){
//     console.log(item, index)
// })

// teachers.forEach((teacher, idx)=>{
//     console.log(teacher, idx)
// })

// Arrays to strings ********************

// console.log(teachers.toString());
// console.log(teachers.join(' & '));

// let num2 = [4,6,4,8,1,2,3]

// console.log(num2.sort())

// console.log(num2.reverse());

// Objects

// let course = {
//     name:'JavaScript 101',
//     class: true,
//     students:['Jim', 'Katy'],
//     instructor:{
//         name:'Erik',
//         language: 'JavaScript'
//     }
// }

// let course = {
//   name: "JavaScript 101",
//   class: true,
//   students: [
//     {
//       name: "Jill",
//       computer: {
//         OS: "Linux",
//         type: "laptop",
//       },
//     },
//   ],
//   instructor: {
//     name: "Erik",
//     language: "JavaScript",
//   },
// };

// console.log(course['students'][0])
// console.log(course.students[0].computer.OS);
// console.log(course.name = "History")
// console.log(course.level = true)
// console.log(delete course.name)
// console.log(course)

// let book = [
//   {
//        author: "R.L Stine", books: "Scary", quntity: 100, price: "$9.99"
//      },
//   {
//        author: "R.L Stine", books: "Scary", quntity: 100, price: "$9.99" 
//     },
// ];

// let newCourse = {
//     "name" : "Java",
//     active: true
// }

// console.log(newCourse.name)


let course = {
	name: 'JavaScript Applications',
	awesome: true,
	teachers: ['Assaf', 'Shane'],
	students: [
		{
			name: 'Steve',
			computer: {
				OS: 'Linux',
				type: 'laptop'
			}
		},
		{
			name: 'Katy',
			computer: {
				OS: 'OSX',
				type: 'macbook'
			}
		},
		{
			name: 'Chuck',
			computer: {
				OS: 'OSX',
				type: 'macbook'
			}
		}

	],
	preReqs : {
		skills : ['html', 'css', 'git'],
		equipment: {
			laptop: true,
			OSOptions: ['linux', 'osx']
		}
	}
};

// Name of the course ('JavaScript Applications')
console.log(course.name)

// Name of the second teacher ('Shane')
console.log(course.teachers[1])
// Name of the first student ('Steve')
console.log(course.students[0].name)
// Katy's computer type ('macbook')
console.log(course.students[1].computer.type)
// The preReq equipment object
console.log(course.preReqs.equipment)
// The second OS Option from equipment prereqs ('osx')
console.log(course.preReqs.equipment.OSOptions)
// String listing the OSOptions separated by 'or' ('linux or osx')
console.log(course.preReqs.equipment.OSOptions.join(" or "))
// An array of all the students that are using osx
let arr = []
let computerOS = course.students.forEach((val) =>{
    if(val.computer.OS === 'OSX'){
        arr.push(val.name)
    }
}) 
console.log(arr)