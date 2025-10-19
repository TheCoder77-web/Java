class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // Invoke the functions below
    System.out.println("Enter Email");
    String user = Input.readString();
    String username = getUsername(user);
    System.out.println("User Name: " + username);
  
    System.out.println("Enter 2 Words");
    String Fword = Input.readString();
    String Sword = Input.readString();
    String word = splitReverse(Fword,Sword);
    System.out.println("The Split Reverse is " + word);
  
    System.out.println("Enter your First Name, Last Name, and OSIS Number");
    String Fname = Input.readString();
    String Lname = Input.readString();
    String OSIS = Input.readString();
    String create = createUsername(Fname,Lname,OSIS);
    System.out.println("Your Username: " + create);
  }
  /*
    Problem 1:
    Write a function getUsername() that accepts an email and returns the user name. Example: joexyz@gmail.com ==> joexyz
  */
    
    String getUsername(String email){
      int info = email.indexOf("@");
      return email.substring(0,info);
    }

  /*   
    Problem 2:
    Write a function splitReverse() that accepts a string and returns a new string made up of the second half followed by the first half of the original string.  Example: "Happy Days" ==> " DaysHappy"
  */

    String splitReverse(String fWord, String sWord){
      return sWord.substring(0) + fWord.substring(0);
    }

  /*    
    Problem 3:
    Write a function createUsername() that accepts a first name, last name and OSIS number and returns the first letter of the first name, the full lastname and the last four characters of the OSIS. Example: John Doe 123456789 ==> "JDoe6789"
  */

    String createUsername(String fName, String lName, String osis){
      return fName.substring(0,1) + lName + osis.substring(5,9); 
    }

}