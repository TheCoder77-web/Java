let employees, info;

async function init(){
  // JSON data retrieval process  
  let link = "https://caverned-phantom-v6rv96w4gjxqfw7jg-8400.app.github.dev"; //replace with your specific link (Make it public)
  // The URL above must be running in a separate broswer tab. (Alternate use: http://localhost:8500 )
  let route= "/employees";

  info = await fetch(link+route);
  employees = await info.json();

  console.log(employees); // confirm data retrieval

  // call the function (from Problem 1) to generate the cards
  generateCards(employees);
}


// Problem 1: Create a function that builds a card for each employee using the div with a class of 'card'.
// Each card should contain the employee ID, first name, last name, and title.
// Make the main output div with id of 'output' be a flex container using CSS. 
function generateCards(employees){

  let output = document.getElementById("output");
  let build = "";

  for(let i=0; i<employees.length; i++){
    let employee = employees[i];
    build += `<div class="card">
                <h4>Employee ID: ${employee.EmployeeId}</h4>
                <hr>
                <p> ${employee.LastName}, ${employee.FirstName}</p>
                <h5>Title: ${employee.Title}</h5>
              </div>`;
  }
  // Problem 2: Add CSS Styling to style the info cards.
    
    output.innerHTML = build;

}