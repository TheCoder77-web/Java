class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(eggs());
   
    print(intersect());
  }
  /* Problem 1: Eggs
    After a farmer disastrously breaks and loses count of her eggs, she experiences difficulty recalling her original quantity. When questioned about the incident, she is able to remember that her eggs could not be evenly divided into twos, threes, fours, fives, or sixes without having a single egg left over each time. The only number by which the quantity could be evenly divided into was seven. How many eggs did she have originally?
    Write a function eggs() that returns the quantity of eggs she originally had.
  */

    int eggs(){
      int num = 7;
      while(!(num % 2 == 1 && num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1) ){
        num += 7;
      }
      return num;
    }


    /* Problem 2:
  Write a function intersect() that returns the value of x where two linear equations intersect.  Equations are:  y=x+3  and  y=12-2x.
  (Given: x>0 and x is a whole number)
    */

    double intersect(){
      int x=0;
      while(x+3 != 12-2*x){
        x++;
      }
      return x;
    }
}