import React, { useState } from "react";
import "./App.css";
import BasicForm from "./components/BasicForm";
import Counter from "./components/Counter";
import Board from "./components/note/Board";
import FormInput from "./components/note/FormInput";

function App() {
  const [count, setCount] = useState(0);
  const [isToggled, setIsToggled] = useState(false);
  const [numArray, setNumArray] = useState([1,2,3,4,6,7,7])
  // let count = 0
  const handleClick = () => {
    setCount(count + 1);
  };

  const handleToggle = () => {
    setIsToggled(!isToggled);
  };
  return (
    <div className="App">{
// <Counter count={count} isToggled={isToggled} arrayOfNums={numArray}/>
// {/**  <button onClick={()=> setCount(count+1)}>click</button>*/}
// <button onClick={handleClick}>click me</button>
// <button onClick={handleToggle}>toggle</button>
// <div>
// <BasicForm />
//   </div>
}
        <Board />
        <FormInput />
    </div>
  );
}

export default App;
