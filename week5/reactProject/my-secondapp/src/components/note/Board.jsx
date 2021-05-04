import React,{useState} from "react";
import Note from "./Note";

const Board = () => {

const [name, setName] = useState('')
const [comment, setComment] = useState('')

const handleChange = (event) =>{
    setName(event.target.name)
    setComment(event.target.comment)
}

const handleSubmit = (e) =>{
        e.preventDefault()

    
}




  return (
    <div>
    <input />
      <div className="div-board">

        <div className="row">
        <Note 
        name = {name}
        comment = {comment}
        />
        </div>
      </div>
      <div>
        <button className="btn btn-success add-button">Add</button>
      </div>
    </div>
  );
};
export default Board;
