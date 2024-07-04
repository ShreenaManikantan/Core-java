class ExtensionCords{
   
   public static void main(String [] extension ){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "GM";
  String color = "Multicolor";
  int totalPowerOutlets= 3; 
  String voltage = "240 Volts";
  int price  = 989;
  String specialFeature = "Compact,Led Indicator";
 
  
  System.out.println("The brand of the cords is " + brand);
  System.out.println("The color of the cords is " + color);
  System.out.println("The Total Power Outlet is " +totalPowerOutlets);
  System.out.println("Voltage is " + voltage );
  System.out.println("The price is " +price);
  System.out.println("Special Feature " + specialFeature);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 

