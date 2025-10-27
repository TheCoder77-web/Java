class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  // This is a single line comment in Java
  // Multi-line comments are enclosed within  /*  and  */
  
  /* 
  Init function which runs when 
  the program begins is invoked(called) from within the Main function.
  */
  void init(){
    // print Welcome
    System.out.println("Welcome");

    // print Hello with the quotes displayed
    System.out.println("\"Hello\"");
    
    // print \Java Code\ as shown
    System.out.println("\\Java Code\\");
    
    // print the name Joe tabbed once
    System.out.println("\tJoe");

    // print the name Mary tabbed twice
    System.out.println("\t\tMary");
    
    // print one, two and three on separate lines using a single line of code
    System.out.println("one \ntwo \nthree");
 
  }
  
}