import React,{useState, useEffect} from 'react'
import axios from 'axios'
import ListOfPeople from './ListOfPeople'
import SearchBar from './SearchBar'

function SearchPage() {
const [valueInput, setValueInput] = useState('')
const [defaultList, setDefaultList] = useState()
const [peopleList, setPeopleList] = useState()

const fetchData = () =>{
    axios.get('https://swapi.dev/api/people/')
    .then(res=>{
        console.log('API data', res.data.results)
        setPeopleList(res.data.results.name)
        setDefaultList(res.data.results)
    })
}

useEffect(()=>{
    fetchData();
},[])

    return (
        <div>
        <h2>StarWars search</h2> 
        <SearchBar />
        </div>
    )
}

export default SearchPage


