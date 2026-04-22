/* Goal for PART 2: Create a webpage that will display a card for each track(song) in the 'tracks' table from the Chinook database. (See picture "WebPagePicture.PNG").
For Part 1, see "Activity50_DBserver".
*/
let songs;

async function init(){
  // PART 2: Create the webpage. You must: 
  // a) Get the data from your database server and store into a variable.  
  let link = "https://caverned-phantom-v6rv96w4gjxqfw7jg-8500.app.github.dev"; 
  // The URL above must be running in a separate broswer tab. (Alternate use: http://localhost:8500 )
  let route= "/songs";

  info = await fetch(link+route);
  songs = await info.json();
  console.log(songs); // confirm data retrieval

  // Invoke(call) function that creates the cards.
  generateCards(songs);
}

// b) Write a function that accepts an array of JSON that contains song information, generates an info card for each track(song) with song name, album title and composer. Display the cards on a webpage. (see "WebPagePicture.PNG" to determine the types of HTML elements to use).
function generateCards(songs){
  let output = document.getElementById("output");
  let build ="";
  
  for(let i=0; i<songs.length; i++){
    let song = songs[i];
    build += `<div class="card">`;
    build += `<h3>Song Name</h3>`;
    build += `<p>${song.Name}</p>`;
    build += `<div>Album</div>`;
    build += `<h2>${song.Title}</h2>`;
    build += `<div>Composer</div>`;
    build += `<h2>${song.Composer}</h2>`;
    build += `<hr>`;
    build += `</div>`;
  }

  output.innerHTML = build;
// c) Add CSS rules to make the output div a flex container and provide appropriate styling for the card. (see picture "WebPagePicture.PNG").

} 
