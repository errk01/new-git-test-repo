import React from 'react'

const Note = (props)=>{

    return (
        <div className="col-sm-6">
        <div className="card card-view">
          <div className="card-body">
          <h5 className="card-title">{props.title}</h5>
            <p>{props.comment}</p>
            <button className="btn btn-info">Edit</button>
            <button className="btn btn-danger">Delete</button>
          </div>
          </div>
      </div>
    )
}

export default Note