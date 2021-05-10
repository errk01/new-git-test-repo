import React, { Component } from 'react'

class ParentList extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {date: new Date()};
    //   }

    state={
        message:'',
        list: [],
        isToggle: true, 
    }    

    handleChange = () =>{
       this.setState(st =>({
            isToggle: !st.isToggle
       }))
    }
    
    render() {
        return (
            <div>
                <input value={this.state.message} onChange={this.handleChange}/>
            </div>
        )
    }
}

export default ParentList
