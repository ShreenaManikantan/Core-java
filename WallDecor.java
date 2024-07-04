class WallDecor{
   
   public static void main(String [] decor ){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Wallstick";
  String color = "Multi";
  String theme = "Cartoon Character	"; 
  String dimensions  = "49 x 4 x 4 Centimeters";
  int price  = 1389;
 int numberOfPieces = 1;
  String material = " thick paper";
  
  System.out.println("The brand of the wall decor is " + brand);
  System.out.println("The color of the wall decor is " + color);
  System.out.println("The theme of the Wall decor is " + theme);
  System.out.println("The dimensions of the Wall decor is " + dimensions);
  System.out.println("price is " + price);
  System.out.println("The number of Pieces is " +numberOfPieces);
  System.out.println("Material used is " + material);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 
