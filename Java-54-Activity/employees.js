let employees, info;

async function init(){
  let link = "https://glowing-eureka-v6rv96w4gw9gh6pvw-8500.app.github.dev"; //replace with your Dev URL
  let route= "/employees";

  info = await fetch(link+route);
  employees = await info.json();

  generateCards(employees);
}

function generateCards(employees){  
  let output = document.getElementById("centerpanel");
  let build ="";
   
  for(let i=0; i<employees.length; i++){
    let employee = employees[i];
    build += `<div class="card" >`
    build += `<h3> Employee ID : ${employee.EmployeeId}</h3>`;
    build += `<div> First Name : ${employee.FirstName}</div>`;
    build += `<div> Last Name : ${employee.LastName}</div>`;
    build += `<p> City : ${employee.City}</p>`;
    build += `<img src="cities/${employee.City}.PNG">`;
    build += `<hr>`;
    build += `</div>`;
  }
  output.innerHTML = build;  
}

function filter(){
  let city = document.getElementById("city").value;
  let newEmployees = []; 
  
  for(let i=0; i<employees.length;i++){
    let employee = employees[i];
    
    if(employee.City == city){
        newEmployees.push(employee);
    }
  }

  generateCards(newEmployees);  
}