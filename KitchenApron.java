class KitchenApron{
   
   public static void main(String [] Apron){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String color = "silver";
  String closureType = "Pull On"; 
  int numberOfPockets = 1;
  int price  = 189;
  String countryOfOrigin = "";
  String material = "Polyester";
  
 
  System.out.println("The color of the apronis " + color);
  System.out.println("The closure Type is " + closureType );
  System.out.println("The number of Pockets is " +numberOfPockets);
  System.out.println("price is " + price);
  System.out.println("The country of origin is " +countryOfOrigin);
  System.out.println("Material used is " + material);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 
