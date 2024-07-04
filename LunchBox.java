class LunchBox{
   
   public static void main(String [] box){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Attro";
  String color = "Pastel Violet";
  String capacity = "980ml"; 
  String specialFeature = "Airtight";
  int price  = 752;
  String material = "Stainless Steel";
  
  System.out.println("The brand of the lunch box is " + brand);
  System.out.println("The color of the lunch box is " + color);
  System.out.println("The capacity of the lunch box is " + capacity);
  System.out.println("special Featureis " + specialFeature);
  System.out.println("The price is " +price);
  System.out.println("Material uswd is " + material);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 

