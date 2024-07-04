class DoorMat{
   
   public static void main(String [] mat){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Onlymat";
  String color = "yellow";
  String weigth = "1 kg"; 
  String usage = "Outdoor";
  int price  = 289;
  String size = "30Cm X 60Cm";
  String material = "Coir";
  
  System.out.println("The brand of the mat is " + brand);
  System.out.println("The color of the mat is " + color);
  System.out.println("The weigth of the mat is " + weigth);
  System.out.println("The usage of the mat is " + usage);
  System.out.println("Price  is " + price);
  System.out.println("The size is " +size);
  System.out.println("Material used is " + material);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 


