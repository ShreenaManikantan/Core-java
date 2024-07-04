class StudyLight{
   
   public static void main(String [] light){
   System.out.println("main started");
   fetchProductDetails();
   System.out.println("main ended");
   
   }
  public static void fetchProductDetails(){
  
  System.out.println("fetch  product details started");
  String brand = "philips";
  String color = "multi";
  String weigth = "3 kg"; 
  String warranty = "1 year";
  int price  = 759;
  String style = "Vintage";
  String baseMaterial = "Aluminium";
  
  System.out.println("The brand of the Study Light is " + brand);
  System.out.println("The color of the Study Light is " + color);
  System.out.println("The weigth of the Study Light is " + weigth);
  System.out.println("warranty is " + warranty);
  System.out.println("The price is " + price);
  System.out.println("The style is " + style);
  System.out.println("Material used is " + baseMaterial);

  System.out.println("fetch product Details ended");
  return;
  
  }


} 

