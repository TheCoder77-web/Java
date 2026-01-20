class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    double[] g1 = {80,100,90};
    double[] g2 = {70,60,65,60,70};

    String[] courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[] courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};
    
    // Create new student objects 
    Student student1 = new Student("Charlie",11,90,g1,courses1);
    Student student2 = new Student("Karl",11,90,g2,courses2);   
    
    // output of course match by student for specific course
    String course = "FSFC3";
    print("Student1 course MRF43: " + student1.checkCourse(course));
    print("Student2 course MRF43: " + student2.checkCourse(course)); 
  }

}