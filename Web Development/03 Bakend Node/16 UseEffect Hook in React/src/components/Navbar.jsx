import React, { useEffect } from 'react'

const Navbar = ({ color }) => {

  // Case 1: Run on every render
  useEffect(() => {
    alert("Hey i will run on every render")
  })

  // Case 2: Run only on first render
  useEffect(() => {
    alert("Hey welcome to my page, this is the first render")
  }, [])

  // Case 3: Run only when certain values change
  useEffect(() => {
    alert("Hey I am running because color was changed")
  }, [color])

  // Example of cleanup function
  // ye tab chalta hai jab ye "<Navbar color={"navy " + "blue" + color}/>" hatta diya jaye samjhe
  useEffect(() => {
    alert("Hye welcome to my page. this the first render of ")

    return () => {
      alert("Components are unmount")
    }
  }, [])

  return (
    <div>
      I am navbar of {color} color hehe..
    </div>
  )
}

export default Navbar