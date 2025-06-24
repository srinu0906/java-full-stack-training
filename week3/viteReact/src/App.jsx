import './App.css';
import Addition from './components/Addition';

function App() {
  // return (
  //   <div className=''>
  //       <h1>Welcome to react with vite</h1>
  //       <p>This is basic program</p>
  //   </div>
  // )

  const number1 = 15,number2 =20;
  return(
    <div>
      <h1> Add two numbers using props</h1>
      <Addition num1={number1} num2 = {number2}/>
      <Addition num1={10} num2 = {20}/>
    </div>
  )
}

export default App;