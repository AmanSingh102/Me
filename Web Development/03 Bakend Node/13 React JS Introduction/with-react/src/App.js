import { useState } from 'react';
import './App.css'; 
import Navbar from './components/Navbar';
import Footer from './components/footer';

function App() {
  const [count, setCount] = useState(0);

  return (
    <div className="App">
      <Navbar logoText="Mewo Mewo App"/>
      <div className="count">{count}</div>
      <button onClick={() => setCount(count + 1)}>Click me</button>
      <Footer/>  
    </div>
  );
}
 
export default App;
