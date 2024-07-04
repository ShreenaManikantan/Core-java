class Projector{
   
   public static void main(String [] Projection){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Lifelong";
  String color = "Multi";
  String components	= "Projector Lens Cover"; 
  int price  = 2589;
  String productDimensions = "28.1L x 14.6W x 11.4H Centimeters";
  String material = "plastic";
  
  System.out.println("The brand of the projector is " + brand);
  System.out.println("The color of the projector is " + color);
  System.out.println("The components of the projector is " + components);
  System.out.println("price is " + price);
  System.out.println("The product Dimensions is " +productDimensions);
  System.out.println("Material used is " + material);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 