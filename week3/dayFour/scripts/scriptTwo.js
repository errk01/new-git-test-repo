let listOutput = document.querySelector(".list");

let submit = document.querySelector(".submitBtn");

// Click even for the submit button that adds input value to to-do list
submit.addEventListener("click", (e) => {
  e.preventDefault();
  // grab input value
  let inputVal = document.getElementById("inputItem").value;
  document.getElementById("inputItem").value = "";

  // Create new li
  let newLi = document.createElement("li");
  newLi.appendChild(document.createTextNode(inputVal));
  newLi.innerHTML += '<button onclick="this.parentNode.remove()">x</button>';
  listOutput.appendChild(newLi);
});

// Click event to remove list item
const deleteButtons = document.querySelectorAll(".del"); // will give you an array of buttons
deleteButtons.forEach((button) => {
  button.addEventListener("click", removeMe); // add the event listener to each button
});
function removeMe() {
  this.closest("li").remove(); // this is the button, from there you want to move up in DOM and find the closes <li> to remove
}
