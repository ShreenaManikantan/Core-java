class CoffeMaker{
   
   public static void main(String [] coffe){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Agaro";
  String color = "black";
  String filterType = "Reusable"; 
  String productDimensions = "22D x 14.2W x 26.9H Centimeters";
  int price  = 3389;
  String specialFeature = "Portable";
 
  
  System.out.println("The brand of the coffe maker is " + brand);
  System.out.println("The color of the coffe maker is " + color);
  System.out.println("The filter type coffe maker is " + filterType);
  System.out.println("Product dimensionsis " + productDimensions );
  System.out.println("The price is " + price);
  System.out.println("Special Feature is " +specialFeature );

  System.out.println("fetch product Details ended");
  return;
  
  }


} 

