class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  // define the functions

  String madlib(String adj, String noun, String verb){
    String result = "The " +  adj + "" + noun + "" + verb + ".";
    return result;
  } 

  double areaSq(double side){
    double area = side * side;
    return area;
  }

  double areaC(double r){
    double area2 = Math.PI * Math.pow(r,2);
    return area2;
  }

  void init(){
    // call the functions
    String result = "The " + "loud " + "person " + "runs" + ".";
    System.out.println(result);
    double result1 = areaSq(2.5);
    System.out.println("Area is " + result1);
    double result2 = areaC(5);
    System.out.println("Area is " + result2);
  }

 
  
}