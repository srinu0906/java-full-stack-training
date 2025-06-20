
 
function calculate(){
   
    let name = document.getElementById("name").value;
    let s1 = parseFloat(document.getElementById("sub1").value);
     let s2 = parseFloat(document.getElementById("sub2").value);
      let s3 = parseFloat(document.getElementById("sub3").value);
 
      let total = s1+s2+s3;
      let avg = total / 3;
      let grade;
 
      if (avg >= 75) grade = "A";
      else if(avg >=60) grade = "B";
      else if(avg >=45) grade = "C";
      else grade = "Fail";
 
    document.getElementById("result").innerHTML=
     "<p>" + name +  ", Total:" + total + "</p>"+
     "<p>Average:" +avg.toFixed(2) + "</p>"+
     "<p>Grade: "+ grade + "</p>";
     
}
 