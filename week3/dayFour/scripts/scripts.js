// let input = document.getElementsByTagName('input')
// let inError = document.getElementsByClassName('error')

// console.log("inputs", input.length)
// console.log("error",inError.length)

// let firstButton = document.querySelector("button");
// let inError = document.querySelectorAll('input.error')

// console.log(firstButton)
// console.log("error",inError)

// let links = document.querySelectorAll('a')

// let linkCount = links.length;
// let firstLink = links[1];

// console.log(firstLink)

// links.forEach(function(link){
//     console.log(link)
// })

// let listItems = document.querySelector('ul').children;
// console.log(listItems.length); //2

// let selectedItem = document.querySelector('li.selected');
// let first = selectedItem.previousElementSibling;
// let last = selectedItem.nextElementSibling;
// let list = selectedItem.parentElement;
// let header = selectedItem.parentElement.parentElement;
// let section = selectedItem.parentElement.parentElement.nextElementSibling;

// console.log(first)
// console.log(last)

// let item = document.querySelector.bind(document) // just grabs a single item
// let allItems = document.querySelectorAll.bind(document) // grabs all the selected items

// console.log(item('header'))
// console.log(allItems('section'))
// console.log(item('.current').nextElementSibling)
// console.log(item('.current').previousElementSibling.children[0])
// console.log(item('h2.highlight').parentElement.parentElement)

// let selectAll = Array.from(allItems('section h2'))
//             .map((headline)=>{
//                 return headline.parentElement
//             })

//             console.log(selectAll)

let div = document.querySelector('div')
let a = document.querySelector('a')

console.log(a.href)

a.name = "new link"
a.innerHTML = "updated text"
 a.target ="_blank"

 let del = document.querySelector('.first').remove()

 console.log(del)
console.log(a.innerHTML)
console.log(div.innerHTML)

let newLi = document.createElement('li')
newLi.innerHTML = 'item 4'

let list = document.querySelector('ul')
list.appendChild(newLi)

let list = document.querySelector("#list");

list.children[1].innerHTML = "Fair Trade Coffee";

list.children[3].remove();

let newItem = document.createElement("li");

newItem.innerHTML = "Cheese Whiz";
list.appendChild(newItem);

list.innerHTML = "";
["protein powder", "muscle milk", "power bars"].forEach(
  (val) => {
    let li = document.createElement("li")
    li.innerHTML = val
    list.appendChild(li)
  }
);


let newClass = list.children[1].className = "important"

console.log(newClass)

console.log(list)



let el = document.getElementById('myEl')

el.addEventListener('click', function(event){
    alert("clicked")
})

el.addEventListener('mouseover', function(event){
    el.innerHTML = 'over';
})


document.querySelector('.outer').addEventListener('click', function(e){
    
    console.log(e.target, e.currentTarget);
})
