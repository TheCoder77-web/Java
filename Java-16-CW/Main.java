class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String msg = Input.readFile("paragraph.txt");
    print(numOfWords(msg) + " words");   
    print(countVowels(msg) + " vowels");
  }
  
  // For each problem read from the file paragraph.txt .

  /*
  Problem 1:
  Write a function numOfWords() that accepts a string and counts the number of words in the string.
  Example: "To be or not to be"  ==> 6
  */

    int numOfWords(String str){
    int cnt = 1;
    for(int x=0; x<=str.length()-1; x++){
      String sybl = str.substring(x, x+1);
      if(sybl.equals(" "))
        cnt++;
    }
    return cnt;
  }

  /*
  Problem 2:
  Write a function countVowels() that accepts a string and returns the number of vowels contained in the string.
  Example: countVowels("Too be or not to be") ==> 7
  */

    int countVowels(String str){
    int cnt = 0;
    for(int x=0; x<=str.length()-1; x++){
      String cv = str.substring(x, x+1);
      if(cv.equalsIgnoreCase("a") || cv.equalsIgnoreCase("e") || cv.equalsIgnoreCase("i") || cv.equalsIgnoreCase("o") || cv.equalsIgnoreCase("u") )
        cnt++;
    }
    return cnt;
  }
  
}