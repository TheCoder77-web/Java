class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  /*
    Problem 1: 
    a) Create an array of the names of your friends.
    b) Print the 2nd name
    c) Print the size of the array
    d) Print the 2nd last name using the array size.
    e) Use the fn showArray[] provided below to display the array of friend names.
  */
    
    String[] friends = {"Jonathan", "Roselyn", "Minahal", "Siyam", "Moises", "Adrian", "Aditya", "Leo", "Abiud", "Brayden"};
    System.out.println(friends[1]);
    System.out.println(friends.length);
    System.out.println(friends[friends.length-2]);
    showArray(friends);

    double[] tempC = {-17.2, 10, 41, 67};
    double[] tempF = convertTempCtoF(tempC);
    for(int x=0; x <= tempF.length-1; x++){      
      System.out.println(tempF[x]);
    }
  }
  /*
  Problem 2:
  Write a function convertTempCtoF() that accepts an array of Celsius temperature values, converts each value to Fahrenheit scale, and returns a new array with the converted temperatures. (Use the celsiusToFahrenheit function provided)
  NOTE: To test this function, create an array tempC in celsius which you will pass to test your new function.
  */
    double[] convertTempCtoF(double[] cTemp){
      double[] fTemp = new double[cTemp.length];
      for(int x=0; x<=cTemp.length-1; x++){
        fTemp[x] = celsiusToFahrenheit(cTemp[x]);
      }
      return fTemp;
    }  
  
  // Function to print all the elements of an array (use a 'for' loop to traverse the array)
  void showArray(String[] a){    
    for(int x=0; x <= a.length-1; x++){      
      printt(a[x] +", "); // print(a[x]);
    }
  }
  // fn to convert temp from degC to degF
  double celsiusToFahrenheit(double c){
        return c*9/5+32;
  }
  
}