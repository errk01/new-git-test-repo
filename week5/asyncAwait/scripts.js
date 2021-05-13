
const output = document.getElementsByClassName("output")
const btn = document.getElementsByClassName("btn")


 btn.addEventListener("click" , (e)=>{
e.preventDevault();
const input = document.getElementsByClassName("userInput").value
document.getElementsByClassName("userInput").value = ""

let newLi = document.createElement("li");
  newLi.appendChild(document.createTextNode(input));
  // newLi.innerHTML += '<button onclick="this.parentNode.remove()">x</button>';
  listOutput.appendChild(newLi);
 })

const asyncFunction = async (city) => {
  let result;
  //https://geocode.xyz/seattle?json=1
  await fetch(`https://geocode.xyz/${city}?json=1`)
  // Call back for the response
    .then((response) => response.json())
    .then((data) => {
      console.log(data);
      return (result = data);
    });
  let latt = result.latt;
  let longt = result.longt;
  let cityName = result.standard.city;
  console.log(`city: ${cityName}, latitude:${latt}, longitude: ${longt}`);
};



const result = asyncFunction(input);
console.log(result);







