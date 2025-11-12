class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    print(rollDice());

    print(lotto());
  
    print(diceDistribution(10));
    print(diceDistribution(1000));
    print(diceDistribution(10000));
    print(diceDistribution(100000));
    print(diceDistribution(1000000));

    print(additionTutor());

    print(mathQuiz());
  }
  /*
  Challenge 1:
  Write a function rollDice() that rolls a die once and returns a value from 1 to 6.
  Example:
  rollDice() ==> "2"
  */

  String rollDice(){
    int die = (int)(Math.random()*(6-1+1)) + 1;
    return "" + die;  
  }
  
  /*
  Challenge 2:
  Write a function lotto() that returns a string of 5 numbers from 1 to 48.
  Example:
  lotto() ==> "1 23 34 9 18"
  */

  String lotto(){
    int n1 = (int)(Math.random()*(48-1+1)) + 1;
    int n2 = (int)(Math.random()*(48-1+1)) + 1;
    int n3 = (int)(Math.random()*(48-1+1)) + 1;
    int n4 = (int)(Math.random()*(48-1+1)) + 1;
    int n5 = (int)(Math.random()*(48-1+1)) + 1;
    return n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5;
  }
  
  /*
  Challenge 3:
  Write a function diceDistribution() that accepts an integer N and rolls a die N times, keeps a counter of the number of times 1,2,3,4,5,6 was rolled (need a counter for each) and displays the counters for each.
  Test with N values of 100, 1000, 100000, and 1000000.  What do the results look like as the number N gets larger?
  */

  String diceDistribution(int n){
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int n4 = 0;
    int n5 = 0;
    int n6 = 0;
    
    for(int i=0; i<n; i++){
      int roll = (int)(Math.random()*(6-1+1)) + 1;
      if(roll==1){
        n1++;
      }else if(roll==2){
        n2++;
      }else if(roll==3){
        n3++;
      }else if(roll==4){
        n4++;
      }else if(roll==5){
        n5++;
      }else if(roll==6){
        n6++;
      }else{
        return "N/A";
      }
    }
    return n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6;
  }

  /*
  Challenge 4:
  Write a function additionTutor() that generates two random numbers and prompts the user to enter the sum of the two numbers. The random integers should range from -20 to 20 (inclusively). If the answer is correct return "Correct!" otherwise return "Incorrect".
  */

  String additionTutor(){
    int n1 = (int)(Math.random()*(20-(-20)+1)) + (-20);
    int n2 = (int)(Math.random()*(20-(-20)+1)) + (-20);
    print(n1+ " + "+n2+" = ?");
    int sum = Input.readInt();
    if(sum == n1+n2){
      return "Correct!";
    }
    else{
      return "Incorrect.";
    } 
  }

  /*
  Challenge 5:
  Write a function mathQuiz() that generates a random addition, subtraction, multiplication or division problem of two random integers, prompts the user for the answer. It returns "Correct!" if the answer is correct, otherwise returns "Incorrect". The random integers should range from -20 to 20 (inclusively).
  Hint: For the random operations (+,-,*,/) using a random number from 0 to 3 where 0 means +, 1 means -, 2 means * and 3 means /.
  */

  String mathQuiz(){
    String op = "";
    double ans = 0;
    
    int n1 = (int)(Math.random()*(20-(-20)+1)) + (-20);
    int n2 = (int)(Math.random()*(20-(-20)+1)) + (-20);
    int ope = (int)(Math.random()*(3-0+1)) + 0;

    if(ope == 0){
      ans = n1+n2;
      op= " + ";
    }
    else if(ope == 1){
      ans = n1-n2;
      op = " - ";      
    }
    else if(ope == 2){
      ans = n1*n2;
      op= " * ";      
    }
    else if(ope == 3){
      ans = n1/n2;
      op= " / ";      
    }
    
    print(n1+ op + n2+" = ?");
    int answer = Input.readInt();
    if(ans == answer){
      return "Correct!";
    }
    else{
      return "Incorrect.";
    }  
  }
}