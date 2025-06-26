import React,{useState,useEffect} from 'react';
 
function Update(){
 
    const [count,setCount] = useState(0);
 
    useEffect(()=>{
 
        document.title = 'Clicked ${count} times';
    },[count]);
       
    return(
        <div>
            <h1>Count: {count} </h1>
            <button onClick={()=>setCount(count+1)}>Click Me</button>
        </div>
    );
} export default Update;