class Helmet{
   
   public static void main(String [] protect){
   System.out.println("main started");
   fetchDetails();
   System.out.println("main ended");
   
   }
   
  public static void fetchDetails(){
  
  System.out.println("fetch details started");
  String brand = "Steelbird";
  String color = "Glossy Black";
  String vehicleServiceType = "Bike";
  String itemWeight = "0.9 Kilograms";
  int price = 1146;
  String material = "Thermoplastic shell";
  
  System.out.println("The brand of helmet is " + brand);
  System.out.println("The color of helmet is " + color);
  System.out.println("The vehicle service type " + vehicleServiceType );
  System.out.println("The item weight is " + itemWeight);
  System.out.println("The price is " + price);
  System.out.println("The material is " + material);

  System.out.println("fetch Details ended");
  return;
  
  }


} 