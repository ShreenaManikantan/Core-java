class Kettle{
   
   public static void main(String [] heater){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "Judge";
  String color = "grey";
  String weigth = "780 grms"; 
  String warranty = "2 years";
  int price  = 2099;
  String finishType = "Mirror";
  String productDimensions = "20L x 15W x 15H Centimeters";
  
  System.out.println("The brand of the Kettle is " + brand);
  System.out.println("The color of the Kettle is " + color);
  System.out.println("The weigth of the watch is " + weigth);
  System.out.println("warranty is " + warranty);
  System.out.println("The price is  " +price);
  System.out.println("product dimention is " + productDimensions);

  System.out.println("fetch product Details ended");
  return;
  
  }


}