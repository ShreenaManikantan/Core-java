class HairDryer{
   
   public static void main(String [] dryer){
   System.out.println("main started");
   fetchDetails();
   System.out.println("main ended");
   
   }
  public static void fetchDetails(){
  
  System.out.println("fetch details started");
  String brand = "philips";
  String color = "white";
  String wattage = "1600 watts";
  String powerSource = "Electric";
  int price = 1599;
  String specialFeature = "Uniquely Designed Thermo Protect Airflow";
  
  System.out.println("The brand of hair dryer is " + brand);
  System.out.println("The color of hair dryer is " + color);
  System.out.println("The wattage is " + wattage);
  System.out.println("The power Source is " + powerSource);
  System.out.println("The price is " + price);
  System.out.println("The special feature is " + specialFeature);

  System.out.println("fetch Details ended");
  return;
  
  }


} 

