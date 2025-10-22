class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("Enter Course Code");
    String cc = Input.readString();
    boolean result = collegeCredit(cc);
    System.out.println(result);
  
    System.out.println("Enter cls Code");
    String clc = Input.readString();
    String counselor = getCounselor(clc);
    System.out.println(counselor);
  
    System.out.println("Enter Filename");
    String fiName = Input.readString();
    String fileType = imageType(fiName);
    System.out.println(fileType);
  }
/*
Problem 1:
Write a function collegeCredit() that accepts a course code and if a course gets college credit return true otherwise return false. If the 6th letter of the course code is "E" or "M" then it is a college credit course.
*/

  boolean collegeCredit(String code){
    if(code.substring(5,6).equals("M") || code.substring(5,6).equals("E")){
      return true;
    }else{
      return false;
    }  
  }

/*
Problem 2:
Write a function getCounselor() that accepts a student's official cls code and returns their guidance counselor based on the either the first or the middle character of the official cls code being:
B-Berrouet
C-Chu
D-Dinn
E-Eyzengart
F-Flores
G-Gibson
*/

  String getCounselor(String cls){
    if(cls.substring(0,1).equals("B") || cls.substring(1,2).equals("B")){
      return "Berrouet";
    }else if(cls.substring(0,1).equals("C") || cls.substring(1,2).equals("C")){
      return "Chu";
    }else if(cls.substring(0,1).equals("D") || cls.substring(1,2).equals("D")){
      return "Dinn";
    }else if(cls.substring(0,1).equals("E") || cls.substring(1,2).equals("E")){
      return "Eyzengart";
    }else if(cls.substring(0,1).equals("F") || cls.substring(1,2).equals("F")){
      return "Flores";
    }else if(cls.substring(0,1).equals("G") || cls.substring(1,2).equals("G")){
      return "Gibson";
    }else{
      return "N/A";
    }
  }

/*  
Problem 3:
Write a function imageType() that accepts an image filename and returns the image type based on the file extension.

JPEG or JPG - Joint Photographic Experts Group
PNG - Portable Network Graphics
GIF - Graphics Interchange Format
PDF - Portable Document Format(not an image type)
*/ 

  String imageType(String file){
    int info = file.indexOf(".");
    if(file.substring(info+1).equals("JPEG") || file.substring(0,info).equals("JPG")){
      return "Joint Photographic Experts Group";
    }else if(file.substring(info+1).equals("PNG")){
      return "Portable Network Graphics";
    }else if(file.substring(info+1).equals("GIF")){
      return "Graphics Interchange Format";
    }else if(file.substring(info+1).equals("PDF")){
      return "Portable Document Format";
    }else{
      return "N/A";
    }
  }
  
}