import React, { useState } from 'react';
import './App.css'

function App() {

    const [count, setCount] = useState(0);

    const increase = () => {
        setCount(count + 1);
    };
    const decrease = () => {
        setCount(count - 1);
    };
    const reset = () => {
        setCount(0);
    };
    return (
        <div>
            <h1>Count: {count} </h1>
            <button onClick={increase}>Increase</button>
            <button onClick={decrease}>Decrease</button>
            <button onClick={reset}>Reset</button>
        </div>
    );
}
export default App;