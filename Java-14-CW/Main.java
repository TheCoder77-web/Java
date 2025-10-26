class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  // Call the functions with appropriate arguments
    System.out.println("Enter a Start, End, and Incremental Value");
    int s = Input.readInt();
    int e = Input.readInt();
    int i = Input.readInt();
    range(s,e,i);
  
    System.out.println("Enter Investment Amount, Annual Interest Rate, and Number of Years of Investment");
    double ivt = Input.readDouble();
    double intR = Input.readDouble();
    int y = Input.readInt();
    compound(ivt,intR,y);
  }
  
  /*
    1) 
    Write a function range() that accepts a start value, end value and incremental step to display all the integers from the start to end values (inclusive). 
    For example start=1, end=7, step=2 function displays 1 3 5 7
  */

    void range(int start, int end, int inc){
      for(int i=start; i<=end; i+=inc){
        System.out.println(i);
      }
    }

   /* 
    2) Compound Interest
    Write a function compound() that accepts an investment amount, annual interest rate and the # of years of investment. Display how the investment grows per year.
    For example: 
    Investment $1,000, interest rate 5% and term 3 years:
    Year 1: 1070.00
    Year 2: 1144.90
    Year 3: 1225.04
  */

    void compound(double inv, double rate, int year){
      for(int i=0; i<=year; i++){
        double ivtAmt = inv*Math.pow(1+rate,i);
        System.out.println("Year " +  i  + ": " + ivtAmt);
      }
    }
  
}