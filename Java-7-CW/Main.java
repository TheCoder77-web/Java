class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
  // For each problem below, prompt the user for the input values for each variable in the formula.
    
  /*
    Problem 1: Translate the formula from eq1.png.
  */

  double z = Math.pow(2,2*4+1);
  System.out.println("z = " + z);
    
  /*
    Problem 2: Translate the formula from eq2.png.
  */

  double y = (2*3)/Math.sin(Math.toRadians(3*4));
  System.out.println("y = " + y);
    
    /*
    Problem 3: Translate the formula from eq3.png.
  */

  double b = Math.abs(Math.pow(2,2) + 1);
  System.out.println("b = " + b);

  }

  
}