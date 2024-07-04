class Mirror{
   
   public static void main(String [] beauty){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Furnish Craft";
  String shape = "circle";
  String mountingType = "Wall Mount"; 
  String productDimensions = "81.3L x 81.3W Centimeters";
  int price  = 789;
  String specialFeature = "Unbreakable";
  String material = "Mild steel";
  
  System.out.println("The brand of the mirror is " + brand);
  System.out.println("The shape of the mirror is " + shape);
  System.out.println("The mounting type is " + mountingType);
  System.out.println("Product dimensionsis " + productDimensions);
  System.out.println("The price is " + price);
  System.out.println("Special feature is " + specialFeature);
  System.out.println("Material is " + material);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 


