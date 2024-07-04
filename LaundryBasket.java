class LaundryBasket{
   
   public static void main(String [] basket){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Solimo";
  String color = "Beige";
  String weigth = "900grms"; 
  String style = "Contemporary";
  int price  = 499;
  String material = "plastic";
  
  System.out.println("The brand of the basket is " + brand);
  System.out.println("The color of the basket is " + color);
  System.out.println("The weigth of the basket is " + weigth);
  System.out.println("Style is " + style);
  System.out.println("The price is " +price);
  System.out.println("Material used is " + material);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 
