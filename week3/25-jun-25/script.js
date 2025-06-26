function changeText() {
    let elements = document.getElementsByClassName("info");

    for (let i = 0; i < elements.length; i++) {
        elements[i].innerHTML = "Hello GEC, INDIA";
    }
}

function newElement() {
    let ele = document.createElement("div");
    ele.innerHTML = " This is newly added element";
    ele.style.backgroundColor = "yellow";
    document.body.appendChild(ele);

}