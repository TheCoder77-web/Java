class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("Enter Number of Terms");
    double term = Input.readDouble();
    double approx = approxPI(term);
    System.out.println(approx);

    System.out.println("Enter Number of Terms");
    double tm = Input.readDouble();
    double acc = accuratePI(tm);
    System.out.println(acc);
  }
  /* 1:   Write a function approxPI() that accepts a value for a # of terms and approximates the value of PI. (See the general forumula described in the file PI.png)

    Example: if # of terms = 5,
    approxPI = 4(1 - 1/3 + 1/5 - 1/7 + 1/9) = 3.3396825396825403
  */

    double approxPI(double terms){
      double sum = 0;
      for(int i=1; i<=terms; i++){
       sum += Math.pow(-1,i-1) * (1.0/(2*i-1));
     }
     return 4*sum;
    }
  
  /* 2:  In order to get a more accurate approximation of PI (say, to the thousandths place), run your loop pasing multiples of ten from 100 through 100000 for the # of terms).
  */

    double accuratePI(double terms){
      double sum=0;    
      for (int i=0; i<terms; i++){
        sum += Math.pow(-1, i) * 1.0/(2*i + 1);        
    }       
    return (terms + (sum*4));
  }  
  
}