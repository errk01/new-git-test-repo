import React,{useState} from 'react'
import './App.css';
import Home from './components/Home'
function App() {
const [count, setCount]= useState('hello')

// const myUpdate = ()=>{
//   setCount('update')
// }


  return (
    <div className="App">
      <h2>{count} working</h2>
      <Home message={count}/>
    </div>
  );
}

export default App;
