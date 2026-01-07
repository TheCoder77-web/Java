class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create new dog objects 
    Dog dog1 = new Dog();
    dog1.name = "Scooby";

    Dog dog2 = new Dog();
    dog2.name = "Clifford";

    Dog dog3 = new Dog();
    dog3.name = "Snoopy";

    // make dogs bark (invoke function)
    dog1.bark();
    dog2.bark();
    dog3.bark();     
  }




  
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) +lower;
  }

}