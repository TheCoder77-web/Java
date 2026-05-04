let songs, info;

async function init(){
  let link = "https://glowing-eureka-v6rv96w4gw9gh6pvw-8500.app.github.dev"; //replace with your Dev URL
  let route= "/songs";

  info = await fetch(link+route);
  songs = await info.json();

  generateCards(songs);
}

function generateCards(songs){  
  let output = document.getElementById("centerpanel");
  let build ="";
  
  for(let i=0; i<songs.length; i++){
    let song = songs[i];
    build += `<div class="card" >`
    build += `<h3> Song Name </h3>`;
    build += `<p> ${song.Name}</p>`;
    build += `<div> Album </div>`;
    build += `<div2> ${song.Title} </div2>`;
    build += `<div> Composer </div>`;
    build += `<div2> ${song.Composer}</div2>`;
    build += `<hr>`;
    build += `</div>`;
  }

  output.innerHTML = build;
}

function filter(){
  let name = document.getElementById("songname").value;
  let newSongs = [];
  
  for(let i=0; i<songs.length;i++){
    let song = songs[i];
    
    if(song.Name == name){
          newSongs.push(song);
       }
  }
  generateCards(newSongs);  
}