class Dog{
  // class properties (variables)
  String breed;
  int age;
  String name;

  // add the constructor
  Dog(String breed, int age, String name){
    this.breed = breed;
    this.age = age;
    this.name = name;
  }

  // class behaviors (functions) 
  void bark(){
    System.out.println(this.name + " says Woof!");
  }
}