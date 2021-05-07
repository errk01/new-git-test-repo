import React, { useState } from "react";

const BasicForm = () => {
  const [value, setValue] = useState("");
  const [name, setName] = useState("");
  
  const handleChange = (event) => {
    setValue(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    setValue("");
    setName(value);
    console.log("change", value);
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Hello, {name}</h2>
      <label>Name: </label>
      <input type="text" value={value} onChange={handleChange} />

      <input type="submit" />
    </form>
  );
};

export default BasicForm;
