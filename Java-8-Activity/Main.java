class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion

  double FtoC(double F){
    double celsius = (F - 32) * 5/9;
    return celsius;
  }

  //3: Sphere volume

  double sphereVolume(double r){
    double sVolume = 4.0/3.0 * Math.PI * Math.pow(r,3);
    return sVolume; 
  }

  //4: Cone volume

  double coneVolume(double r2, double h){
    double cVolume = 1.0/3.0 * Math.PI * Math.pow(r2,2) * h;
    return cVolume; 
  }

  //5: Distance between two coordinate points

  double distance(double x1, double x2, double y1, double y2){
    double d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    return d; 
  }


  void init(){
    //1
    System.out.println("Enter your name ");
    String name = Input.readString();
    print("Welcome "+name);

    //2

    System.out.println("Enter a temperature in Fahrenheit");
    double F = Input.readDouble();
    System.out.println("Temperature in Celsius is " + FtoC(F));

    //3

    System.out.println("Enter radius for Sphere Volume");
    double r = Input.readDouble();
    System.out.println("The Sphere Volume is " + sphereVolume(r));

    //4

    System.out.println("Enter radius and height for Cone Volume");
    double r2 = Input.readDouble();
    double h = Input.readDouble();
    System.out.println("The Cone Volume is " + coneVolume(r2,h));

    //5
    
    System.out.println("Enter x1, x2, y1, and y2 for distance");
    double x1 = Input.readDouble();
    double x2 = Input.readDouble();
    double y1 = Input.readDouble();
    double y2 = Input.readDouble();
    System.out.println("The Distance is " + distance(x1,x2,y1,y2));
  }
 
}