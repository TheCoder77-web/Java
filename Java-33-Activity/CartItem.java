class CartItem{
  // variables
  String itemName;
  double itemPrice;
  int quantity;
  boolean onSale;

  //1: Constructor
  CartItem(String itemName,double itemPrice,int quantity,boolean onSale){
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.quantity = quantity;
    this.onSale = onSale;
  }
  
  
  //2: fn getPrice() to get discounted price (if applicable)
  double getPrice(){
    if(this.onSale == true){
      return this.itemPrice*0.90;
    }else{
      return this.itemPrice;
    }
  }
}