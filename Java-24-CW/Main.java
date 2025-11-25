class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    
  }
  /*
  Problem 1:
  Write a fn toUpper() that accepts a string and converts all lower case letters to upper case and returns the result.
  */


  /*
  Problem 2:
  Write a fn pswdGenerator() that generates and returns a 9-character password.
*/


  

  //fn to generate random integer
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  } 

 
}