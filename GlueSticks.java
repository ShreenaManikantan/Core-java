class GlueSticks {
   
   public static void main(String [] glue ){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Agaro";
  String color = "White";
  String weigth = "200grms"; 
  String style = "electronic";
  int price  = 1389;
  String powerSource = "Corded Electric";
  
  System.out.println("The brand of the is glue sticks " + brand);
  System.out.println("The color of the glue sticks is " + color);
  System.out.println("The weigth of the glue sticks is " + weigth);
  System.out.println("style is " + style);
  System.out.println("The price is " +price);
  System.out.println("power source is " + powerSource);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 
