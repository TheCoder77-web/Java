public class GameLogic {    
    Meteor meteor;
    BackGround bk;
    int score = 0; 

    public GameLogic(){
        meteor = new Meteor(180, 20, 0, 1);
        bk = new BackGround();
    }

    public void gameLoop() {
        bk.drawBk();
        meteor.move();

        // Check to see if mouse clicks on the meteor
        if(Mouse.leftClick){
          if(meteor.collidedWithMouse()){
            score += 10; // Add points
            meteor.reset(); // Move meteor back to the top
            Mouse.leftClick = false; // Makes sure it doesn't click multiple times
          }
        }
        
        meteor.draw();
        drawText(Game.canvas); // Calls the text
    }

    // New method for drawing text
    void drawText(Graphics text) {
        text.setColor(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, 24)); 
        text.drawString("Score: " + score, 20, 40); 
    }
}