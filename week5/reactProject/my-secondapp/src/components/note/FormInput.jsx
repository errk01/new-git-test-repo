import React, { useState } from "react";
import Note from "./Note";

const FormInput = () => {
  const [title, setTitle] = useState("");
  const [comment, setComment] = useState("");
  const [value, setValue] = useState("");
  const [planet, setPlanet] = useState("");

  const handleChange = (event) => {
    setTitle(event.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    setValue("");
    setTitle(value);
    setComment(value);
  };

  return (
    <div>
    <Note title={title} comment={comment} planet = {planet}/>
    <form onSubmit={handleSubmit}>
    
      <label>Title</label>
      <input type="text" value={title} onChange={handleChange} />

      <label>Planet</label>
      <input type="text" value={planet} onChange={handleChange} />

      <label>Bio</label>
      <input type="text" value={comment} onChange={handleChange} />

      <input type="submit" />
      
    </form>
    </div>
  );
};

export default FormInput