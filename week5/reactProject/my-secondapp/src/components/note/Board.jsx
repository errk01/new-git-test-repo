import React, { useState } from "react";
import Note from "./Note";

const Board = () => {
  const [name, setName] = useState("");
  const [comment, setComment] = useState("");
  const [value, setValue] = useState("");

  return (
    <div>
      <div className="div-board">
        <div className="row">
          
        </div>
      </div>
      <div>
        <button className="btn btn-success add-button">Add</button>
      </div>
    </div>
  );
};
export default Board;
