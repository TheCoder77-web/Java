class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
   // Invoke functions with appropriate arguments
   System.out.println("Enter GPA");
   double g = Input.readDouble();
   double GPA = gpa(g);
   System.out.println(GPA);
  
   System.out.println("Enter Grade Level and Credits Earned");
   String gradeLvl = Input.readString();
   int cred = Input.readInt();
   boolean result = isGraduating(gradeLvl,cred);
   if(result == true){
    System.out.println("Student Graduating");
   }else{
    System.out.println("Student NOT Graduating");
   }

   System.out.println("Enter Weight In Pounds and Height In Inches");
   double w = Input.readDouble();
   double h = Input.readDouble();
   String outcome = BMI(w,h);
   System.out.println(outcome);
  
   System.out.println("Enter Weight In Pounds");
   double weightInPounds = Input.readDouble();
   double cost = shippingCost(weightInPounds);
   System.out.println("$" + cost);
  
   System.out.println("Enter Light Frequency in THz for Blue and Violet");
   double b = Input.readDouble();
   double v = Input.readDouble();
   boolean ret = blueOrViolet(b,v);
   System.out.println(ret);
  }

/* Challenge 1:
  Write a function "gpa" that takes in the GPA value and returns the following: 
  if GPA is over 90, return GPA weighted by an extra 10%;
  otherwise return the raw GPA.
*/
  
  double gpa(double grade){
    if(grade > 90){
      double result = grade * 1.1;
      return result;
    }else{
      return grade;
    }
  }

  
/* Challenge 2:
    Write a function "isGraduating" that accepts a grade level and number of credits earned. It returns the boolean value TRUE if a student is a Senior and has 44 or more credits; otherwise it returns FALSE. 
  
  In the init() function:
  Display to console "Student Graduating" or "Student NOT Graduating" depending on the value returned by the function.
*/

  boolean isGraduating(int gLvl, int credits){
    if(gLvl == 12 && credits >= 44){
      return true;
    }else{
      return false;
    }
  }

/* Challenge 3:  BMI
  Write a function "BMI" that accepts a weight in pounds and a height in inches. 
  Calculate the BMI (search up the formula) and return the following:
    BMI 18.4 or less:  return Underweight
    BMI over 18.4 to under 25.0:  return Normal
    BMI of 25.0 or more to under 40.0:  return Overweight
    BMI of 40.0 or more:  return  Obese 
*/

  String BMI(double weight, double height){
    double bmi = weight/Math.pow(height,2) * 703;
    if(bmi <= 18.4){
      return "Underweight";
    }else if(bmi > 18.4 && bmi < 25){
      return "Normal";
    }else if(bmi >= 25 && bmi < 40){
      return "Overweight";
    }else if(bmi >= 40){
      return "Obese";
    }else{
      return "N/A";
    }
  }

/* Challenge 4:
  Write a function "shippingCost" that accepts a weight in pounds and returns:
       0.00, if 10 pounds or less,
       5.00, if more than 10 pounds but 15 pounds or less,
       10.00, if more than 15 pounds but 25 pounds or less,
       10.00 plus 2 cents per pound over 25 pounds, if over 25 pounds.
*/

  double shippingCost(double pounds){
    if(pounds <= 10){
      return 0.00;
    }else if(pounds > 10 && pounds <= 15){
      return 5.00;
    }else if(pounds > 15 && pounds <= 25){
      return 10.00;
    }else if(pounds > 25){
      return 10.00 + (pounds - 25)*0.02;
    }else{
      return 0;
    }
  }

/* Challenge 5:
  Write a function "blueOrViolet" that accepts a light frequency in THz and returns true for either blue frequencies (600-670 THz inclusive) or violet frequencies (700-750 THz inclusive), otherwise return false.
*/

  boolean blueOrViolet(double blue, double violet){
    if((blue >= 600 && blue <= 670) || (violet >= 700 && violet <= 750)){
      return true;
    }else{
      return false;
    }
  }
  
} 