class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("Enter a Word, a Letter, and Replacement Letter");
    String s = Input.readString();
    String f = Input.readString();
    String r = Input.readString();
    String swap = swapCharacter(s,f,r);
    System.out.println(swap);
  
    System.out.println("Enter a Word to Encrypt");
    String st = Input.readString();
    String en2 = encryption2(st);
    System.out.println(en2);
  
    System.out.println("Enter Another Word to Encrypt");
    String stg = Input.readString();
    String en3 = encryption3(stg);
    System.out.println(en3);
  }

  // reverse function for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }

  /*
  Problem 1:
  Write a function swapCharacter() that accepts a string to modify, a string(one character) to find, and a string(one character) to replace. The function returns a string with the 'find' strings replaced by the 'replace' string.
  Example: swapCharacter("the seen","e","%")  ==> "th% s%%n"
  */

    String swapCharacter(String str, String find, String replace){
      String build = "";
      for(int x=0; x<=str.length()-1; x++){
        if(str.substring(x,x+1).equals(find)){
          build += replace;
        }else{
          build += str.substring(x,x+1);
        }
      }
      return build;
    }

  /*
  Problem 2:
  Write a function encryption2() that accepts a string and returns the string where the orginal string is split in half and each letter from each half is used to create a new string.
  Example:
  encryption2("abcdefgh") ==> "aebfcgdh"
    process:  "abcdefgh" -> "abcd" "efgh"  -> "aebfcgdh"

  encryption2("abcdefghi")==> "aebfcgdhi"
   process:  "abcdefghi" -> "abcd" "efghi"  -> "aebfcgdhi"
  */

    String encryption2(String str){
    String build="";
    int length = str.length();
    String first = str.substring(0,length/2);
    String second = str.substring(length/2);

    for(int x=0; x<=first.length()-1; x++){
        build += first.substring(x, x+1) + second.substring(x, x+1);
      if(length%2 == 1){
        build += second.substring(second.length()-1);
      }
    }
    return build;
  }

  /*
  Problem 3:
  Write a function encryption3() that accepts a string and returns the string that rearranges the characters of the original string in the order: 1st,last,2nd,last-1,3rd,last-2,...   and so on.
  Example:
  encryption3("abcdef")==> "afbecd"
  encryption3("abcde")==> "aebdc"
  */
  
  String encryption3(String str){
    String build = "";
    int length = str.length();
    String first = str.substring(0,length/2);
    String second = str.substring(length/2);
    String secRvr = reverse(second);

    for(int x=0; x<=first.length()-1;x++){
      build += first.substring(x,x+1) + secRvr.substring(x,x+1);
      if(length%2==1){
        build += secRvr.substring(secRvr.length()-1);
      }
    }
    return build;
  }
  
}