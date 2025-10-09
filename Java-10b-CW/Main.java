class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    // Invoke the functions (test different situations)
    System.out.println("Enter GPA and SAT Scores");
    double gpa = Input.readDouble();
    int sat = Input.readInt();
    String result = collegeApp(gpa,sat);
    System.out.println(result);
  
    System.out.println("Enter Speed in MPH");
    double mph = Input.readDouble();
    String outcome = ecoFuel(mph);
    System.out.println(outcome);
  
    System.out.println("Enter Speed on Speeding Ticket");
    double speed = Input.readDouble();
    double fine = speedFine(speed);
    System.out.println(fine);
  
    System.out.println("Enter Cost of Three Items");
    double obj1 = Input.readDouble();
    double obj2 = Input.readDouble();
    double obj3 = Input.readDouble();
    double discount = discount(obj1,obj2,obj3);
    System.out.println(discount);
  }

  /*
    Problem 1:
    Write a function collegeApp() that accepts a GPA (0 - 4.0) and an SAT 
    score (200 - 1600) and returns "ACCEPTED" if gpa is 3.2 or better or
    if SAT score is 1450 or better; otherwise returns "Not Accepted".
  */
    String collegeApp(double GPA, int SAT){
      if(GPA >= 3.2 || SAT >= 1450){
        return "ACCEPTED";
      }else{
        return "Not Accepted";
      }
    }
   
    
  /*
    Problem 2:
    Write a function ecoFuel() that takes in the speed of a car in MPH and 
    returns a string "Fuel Economy" if the speed is between 40 and 65 MPH inclusive;  
    otherwise it returns "Not Optimal".
  */
    String ecoFuel(double MPH){
      if(MPH >= 40 && MPH <= 65){
        return "Fuel Economy";
      }else{
        return "Not Optimal";
      }
    }

  /*
    Problem 3:
    Write a function speedFine() that accepts the speed on a speeding ticket and          returns a fine of $75 for speeds between 60 and 70 (inlcusive); otherwise return 
    a fine of $75 plus two dollars for every mile over 70.
  */
    double speedFine(double mile){
      if(mile >= 60 && mile <= 70){
        return 75;
      }else{
        return 75 + (mile-70) * 2;
      }
    }

    
  /*
    Problem 4:
    Write a function discount() that takes in the cost of three items and returns         the total amount discounted by 10% if the sum of the items is over $250 and
    if at least one of the items costs $100 or more; 
    otherwise return the total amount with no discount.
  */
    double discount(double item1, double item2,double item3 ){
    double cost = item1+item2+item3;
    
    if(cost >250 && (item1>=100||item2>=100||item3>=100))
      return cost*0.90;
    else
    return cost;
  }
  


}
