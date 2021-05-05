import React from "react";

function SearchBar(props) {
  return <input 
    value={props.keyWord} 
    onChange={(e) => props.setKeyWord(e.target.value)} 
  />;
}

export default SearchBar;
