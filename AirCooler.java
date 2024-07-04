class AirCooler{
   
   public static void main(String [] cooler){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Bajaj";
  String color = "White";
  String controlsType = "Remote"; 
  String mountingType = "Freestanding";
  int price  = 1289;
  String specialFeature = "Adjustable";
  String capacity = "54 litres";
  
  System.out.println("The brand of the air cooler is " + brand);
  System.out.println("The color of the air cooler is " + color);
  System.out.println("The controls 	type is " + controlsType);
  System.out.println("Mounting type" + mountingType);
  System.out.println("The price " +price);
  System.out.println("Special Feature is " + specialFeature);
  System.out.println("Capacity is " + capacity);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 


