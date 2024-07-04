class DecorLight{
   
   public static void main(String [] light){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Desidiya";
  String color = "Warm White";
  String usage = "Indoor"; 
  String lightSourceType = "LED";
  int price  = 389;
  String powerSource = "Corded Electric";
 
  
  System.out.println("The brand of the decor light is " + brand);
  System.out.println("The color of the decor light is " + color);
  System.out.println("It is used in " + usage );
  System.out.println("Light Source Type is " + lightSourceType );
  System.out.println("The price is " +price);
  System.out.println("power source is " + powerSource);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 


