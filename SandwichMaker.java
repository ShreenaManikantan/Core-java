class SandwichMaker{
   
   public static void main(String [] Sandwich ){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "wipro";
  String color = "White";
  String specialFeature = "Lightweight"; 
  String wattage = "750 Watts";
  int price  = 3509;
  String material = "plastic";
  
  System.out.println("The brand of the Sandwich Maker is " + brand);
  System.out.println("The color of the  Sandwich Maker is " + color );
  System.out.println("The Special feature is " + specialFeature);
  System.out.println("pawer rating is " + wattage );
  System.out.println("The price is " + price);
  System.out.println("Material used is " +material );

  System.out.println("fetch product Details ended");
  return;
  
  }


} 