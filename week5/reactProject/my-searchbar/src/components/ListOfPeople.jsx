import React from 'react'

 function ListOfPeople({peopleList = []}) {
    return (
        <>
           {peopleList.map(data =>{
               if(data){
                   console.log(data.name)
                   return(
                       <div key={data.name}>
                        <h1>{data.name}</h1>
                       </div>
                   )
               }
               return null
           })} 
        </>
    )
}
export default ListOfPeople



