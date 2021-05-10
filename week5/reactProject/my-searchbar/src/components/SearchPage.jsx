import React, { useState, useEffect, Fragment } from "react";
import axios from "axios";
import ListOfPeople from "./ListOfPeople";
import SearchBar from "./SearchBar";

function SearchPage() {
  const [valueInput, setValueInput] = useState("");
  const [defaultList, setDefaultList] = useState();
  const [peopleList, setPeopleList] = useState();

  // Function for the api
  const fetchData = async () => {
    //returning the call to the api. 
    // since we are using axios it promise
    return await axios.get("https://swapi.dev/api/people/")
    // the promise will not resolve till the call is complete. 
    //the .then is the promise that is being filled
    //
    .then((res) => {
      console.log("API data", res.data.results);
      setPeopleList(res.data.results.name);
      setDefaultList(res.data.results);
    });
  };

  const updateInput = async (input) => {
    const filtered = defaultList.filter((person) => {
      return person.name.toLowerCase().includes(input.toLowerCase());
    });
    setValueInput(input);
    setPeopleList(filtered);
  };

  useEffect(() => {
    fetchData();
  }, []);
console.log("people", peopleList)
  return (
    <>
      <h2>StarWars search</h2>
      <SearchBar keyWord={valueInput} setKeyWord={updateInput} />
      <ListOfPeople peopleList={peopleList} />
    </>
  );
}

export default SearchPage;
