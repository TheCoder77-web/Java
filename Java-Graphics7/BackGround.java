import java.awt.*;
import javax.swing.*;

class BackGround{
  int x,y;
  Image img;// Image class of Graphics2D
  
  BackGround(){
    this.img = 	
      new ImageIcon("background.jpg").getImage();
      // uses ImageIcon class of Graphics2D
  }
  
  void drawBk(){
    Game.canvas.drawImage(this.img,//image file
                          0, //x of (0.0)
                          0, //y of (0,0)
                          Game.width, //img width
                          Game.height,//img height
                          null);   
  }
}