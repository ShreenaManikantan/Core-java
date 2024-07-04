class ToothbrushHolder{
   
   public static void main(String [] holder){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Primelife";
  String color = "multi";
  String weigth = "320 Grams"; 
  String productDimensions= "";
  int price  = 199;
  String countryOfOrigin = "India";
  String material = "Plastic";
  
  System.out.println("The brand of the holder is " + brand);
  System.out.println("The color of the holder is " + color);
  System.out.println("The weigth of the holder is " + weigth);
  System.out.println("The product Dimensions is " +productDimensions);
  System.out.println("The country of origin is " +countryOfOrigin);
  System.out.println("Material uswd is " + material);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 
