class Juicer{
   
   public static void main(String [] juice){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "philips";
  String color = "Black and transparent";
  String specialFeature = "Portable"; 
  String productDimention = "17.1D x 16.7W x 19.5H Centimeters";
  int price  = 1089;
  String finishType  = "Brushed";

  
  System.out.println("The brand of the juicer is " + brand);
  System.out.println("The color of the juicer is " + color);
  System.out.println("The special Feature  is " + specialFeature );
  System.out.println("Product dimention is " + productDimention );
  System.out.println("The price is " + price);
  System.out.println("Finish  Type is" + finishType );

  System.out.println("fetch product Details ended");
  return;
  
  }


} 


