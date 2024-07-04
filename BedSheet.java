class BedSheet{
   
   public static void main(String [] sheet){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "BSB HOME";
  String color = "White & Blue";
  String pattren = "Floral"; 
  String size = "Double";
  int price  = 599;
  String material = "";
  
  System.out.println("The brand of the bedsheet is " + brand);
  System.out.println("The color of the bedsheet is " + color);
  System.out.println("The pattren of the bedsheet is " + pattren);
  System.out.println("size is " + size );
  System.out.println("price is " + price );
  System.out.println("Material used is " + material);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 

