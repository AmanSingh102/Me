import React from 'react'
import './Card.css'

const Card = (props) => {
  return (
    <div className='card' style={{overflow: "hidden"}}>
        <img src="https://littleinventors.in/wp-content/uploads/2024/10/math-and-coding-1280x595.jpg" alt="Card Image" width={333}
        style={{border: "5px solid black"}} />
      <h1>{props.title}</h1>
      <p>{props.description}</p>
    </div>
  )
}

export default Card
