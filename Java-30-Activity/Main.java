class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // create objects
    Car bmw = new Car("BMW","552B","Blue",2012,48399);
    Car tesla = new Car("Tesla","445D","White",2018,40599);
    
    // display brand, model and value of each car
    print("Brand: " + bmw.brand );
    print("Model: " + bmw.model );
    print("Value: $" + bmw.value );
    print("\n");
    print("Brand: " + tesla.brand );
    print("Model: " + tesla.model );
    print("Value: $" + tesla.value );    

	//Make BMW honk
	print("\nUsing car functions(behavior):");
	bmw.honk();   

    // Display brand and model of any car with value over 30,000
    print("\nCars with value exceeding $30,000:");
	
    if (bmw.value > 30000){
      print("Brand: " + bmw.brand );
      print("Model: " + bmw.model );
    } 
    if (tesla.value > 30000){
      print("Brand: " + tesla.brand );
      print("Model: " + tesla.model );
    } 
	// Make BMW honk
	print("\nUsing car functions(behavior):");	

    
  }

}