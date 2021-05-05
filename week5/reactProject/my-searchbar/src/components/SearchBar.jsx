import React from 'react'

function SearchBar({keyWord, setKeyWord}){
    return (
        <input 
        value={keyWord}
        onChange={(e)=> setKeyWord(e.target.value)}
        />
    )
}

export default SearchBar