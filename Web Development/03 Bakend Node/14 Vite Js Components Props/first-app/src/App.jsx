import Navbar from "./components/Navbar" 
import Footer from "./components/Footer"
import Card from "./components/card"

function App() {
  

  return (
    <>
      <Navbar/>
      <div className="cards">
          <Card title="Card 1" description="Description for Card 1" />
          <Card title="Card 2" description="Description for Card 2" />
          <Card title="Card 3" description="Description for Card 3" />
          <Card title="Card 4" description="Description for Card 4" />
      </div>
      <Footer/>
    </>
  )
}

export default App
