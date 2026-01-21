class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

	//3: create 3 new item objects
	CartItem item1 = new CartItem("Oranges",4.00,5,true);
  CartItem item2 = new CartItem("Bag of Chips",2.00,1,false);
  CartItem item3 = new CartItem("Frozen Pizza",8.00,1,false);
	
	//4: display name & original price of items that are on sale
	if(item1.onSale){
    print("Product Name: " + item1.itemName);
    print("Product Price: $" + item1.itemPrice);
  }
	if(item2.onSale){
    print("Product Name: " + item2.itemName);
    print("Product Price: $" + item2.itemPrice);
  }

  if(item3.onSale){
    print("Product Name: " + item3.itemName);
    print("Product Price: $" + item3.itemPrice);
  }
	
	//5: subtotal (for all quantities of all items in cart, using discounted prices)
	double sub = item1.getPrice()*item1.quantity + item2.getPrice()*item2.quantity + item3.getPrice()*item3.quantity;
	
	// display subtotal, tax and total
  double tax = sub*8.875/100;
  double total = sub+tax;
  
  print("Subtotal: $" + sub);
  print("Tax: $" + tax);
  print("Total: $" + total);
  }
}