class VacuumCleaner{
   
   public static void main(String [] cleaner){
   System.out.println("main started");
   fetchDetails();
   System.out.println("main started");
   
   }
  public static void fetchDetails(){
  
  System.out.println("fetch details started");
  String brand = "GoDryft";
  String color = "Gray";
  String specialFeature = "Portable and Compact";
  String usesForProduct = "Cleaning";
  int price = 1399;
  String capacity = "500 Milliliters";
  String wattage = "40 W";
  
  System.out.println("The brand of vacuum cleaner is " + brand);
  System.out.println("The color of vacuum cleaner is " + color);
  System.out.println("The special feature is " + specialFeature);
  System.out.println("The Product is used for " + usesForProduct);
  System.out.println("The price is " + price);
  System.out.println("The capacity is " + capacity );
  System.out.println("The wattage is " + wattage );

  
  System.out.println("fetch details ended");
  return;
  
  }


} 


