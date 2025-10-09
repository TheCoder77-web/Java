class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    System.out.println("Enter the Number of Tickets to Purchased");
    int numTickets = Input.readInt();
    String total = groupSavings(numTickets);
    System.out.println(total);  

    System.out.println("Enter Total Amount Spent and Number of Cans Purchased");
    double totalAmt = Input.readDouble();
    int numCans = Input.readInt();
    String savings = groceryDiscount(totalAmt,numCans);
    System.out.println(savings);
  }

  /*
    Problem 1:      
    Write a function groupSavings() that takes the number of tickets you want 
    to purchase. Return the total cost by applying the following prices:
    1 to 8 tickets  : each ticket costs $11.00
    9 to 16 tickets : each ticket costs $10.50
    over 16 tickts  : each ticket costs $8.50
  */
    String groupSavings(int tickets){
      if(tickets >= 1 && tickets <= 8){
        return "$11.00";
      }else if(tickets >= 9 && tickets <= 16){
        return "$10.50";
      }else if(tickets > 16){
        return "$8.50";
      }else{
        return "$0";
      }
    }
  
  /*
    Problem 2:
    Write a function groceryDiscount() that takes the total amount spent at 
    a grocery store and the number of cans purchased. Based on the total amount 
    and the number of cans purchased, you get a savings on your total bill.
    
    Return the amount saved:
      Spend $100 to $200 and purchase at least 3 cans: $10 savings
      Spend over $200 and purchase more than 4 cans: $25 savings
      Otherwise: No discount.
    */
    String groceryDiscount(double spent, int cans){
      if(spent >= 100 && spent <= 200 && cans >= 3){
        return "$10 Savings";
      }else if(spent > 200 && cans > 4){
        return "$25 Savings";
      }else{
        return "No Savings";
      }
    }

}