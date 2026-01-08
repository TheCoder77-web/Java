class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create 3 dogs
    Dog scoob = new Dog("Breed A", 1,"Scooby");
    Dog cliff = new Dog("Breed B", 2,"Clifford");
    Dog snoop = new Dog("Breed C", 3,"Snoopy");
    Dog wilb = new Dog("Breed D", 4,"Wilbur");
    Dog chi = new Dog("Breed E", 5,"Chick");
    Dog sal = new Dog("Breed F", 6,"Sally");

    // display object property values
    print(scoob.breed);
    print(cliff.age);
    print(snoop.name);
    print(wilb.breed);
    print(chi.age);
    print(sal.name);
    
    // invoke object behaviors(functions)
    cliff.bark();
    snoop.bark();   
  }

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}