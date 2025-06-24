function Addition(props){
    const {num1,num2} = props;
    const sum = parseFloat(num1) + parseFloat(num2);
    
    return(
        <div>
            <h1>Number 1 : {num1}</h1>
            <h1>Number 2 : {num2}</h1>
            <h1>Sum : {sum}</h1>
        </div>
    )
}

export default Addition;