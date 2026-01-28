class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list = new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();

    // Use the array of students called "students" and the functions from the 'Student' class of the prior lesson to answer the questions listed below:  

    // 1: How many students are passing and how many are failing?
    int count = 0;
    int pass = 0;
    int fail = 0;

    for(int x=0; x<students.length; x++){
      Student student = students[x];
      if(student.gpa<65){
        fail++;
      }
      else{
        pass++;
      }
    }
    print("Students Passing: " + pass);
    print("Students Failing: " + fail);
    // 2: What percentage of students are failing?
    print("Failing %: "+ fail/(double)students.length*100 + " %");
    // 3: How many failing students have "Castro R" as their teacher?
    for(int x=0;x< students.length;x++){
      Student student = students[x];
      if(student.findTeacher("Castro R") && student.gpa<65){
        count++;
      }
    }
    print("Number of Mr.Castro's students failing: "+count);
    // 4: How many failing students are not taking a Music course? (Note: Music courses start with "UL")
    count=0;
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(!student.findCourseStartingWith("UL") && student.gpa<65){
        count++;
      }
    }
    print("Number of failing students not taking Music: "+count);
    // 5: Display the IDs of all students taking music, but failing it (music courses start with "UL").
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.findCourseStartingWith("UL") && student.gpa<65){
        print("Students taking Music but failing: "+student.id);
      }
    }
    // 6: How many freshmen and sophomores have a GPA over 90?
    count=0;
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if((student.gradeLevel==9 ||student.gradeLevel==10)&&student.gpa > 90){
        count++;
      }
    }
    print("Number of Freshmen and Sophomores with GPA over 90: "+count);
    // 7: How many students have both of the following teachers: Banu and Porchetta?
    count=0;
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.findTeacher("Porchetta")&&student.findTeacher("Banu")){
        count++;
      }
    }
    print("Number of students with Banu & Porchetta: "+count);
    // 8: How many freshmen, sophomores, juniors and seniors are there?
    int freshmen = 0;
    int sophomore = 0;
    int junior = 0;
    int senior = 0;

    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.gradeLevel==9){
        freshmen++;
      }
      else if(student.gradeLevel==10){
        sophomore++;
      }
      else if(student.gradeLevel==11){
        junior++;
      }
      else if(student.gradeLevel==12){
        senior++;
      }
    }
    print("Freshmen: "+freshmen);
    print("Sophmores: "+sophomore);
    print("Juniors: "+junior);
    print("Seniors: "+senior);
    // 9: For teacher Porchetta's students, display the number of students by grade level.
    freshmen = 0;
    sophomore = 0;
    junior = 0;
    senior = 0;

      for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.findTeacher("Porchetta")){
        if(student.gradeLevel==9){
         freshmen++;
        }
        else if(student.gradeLevel==10){
          sophomore++;
        }
        else if(student.gradeLevel==11){
          junior++;
        }
        else if(student.gradeLevel==12){
          senior++;
        }
      }
    }
    print("Freshmens in Mr.Porchetta's Class:  "+freshmen);
    print("Sophomores in Mr.Porchetta's Class:  "+sophomore);
    print("Juniors in Mr.Porchetta's Class:  "+junior);
    print("Seniors in Mr.Porchetta's Class:  "+senior);    
    
  }  

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}