class OvenGloves {
   
   public static void main(String [] gloves){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Solimo";
  String color = "blue";
  int price  = 599;  
  String productDimensions = "30L x 18W Centimeters";
  String shape = "Hand";
  String material = "cotten";
  
  System.out.println("The brand of the gloves is " + brand);
  System.out.println("The color of the gloves is " + color);
  System.out.println("The price of the gloves is " + price);
  System.out.println("Product Dimensions is " + productDimensions);
  System.out.println("The shape is " + shape);
  System.out.println("Material used is " + material);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 

