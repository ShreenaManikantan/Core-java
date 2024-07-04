class DeskOrganizer{

   public static void main(String [] organizer){
   System.out.println("main started");
   getFeature();
   System.out.println("main ended");

   }
    public static void getFeature(){
     
    System.out.println("Get feature method started");
    String brand = "Sharma plastics";
	String color = "clear";
	String finishType = "Polished";
	String material = "Acrylic";
	int numberOfItems = 1;
	String productDimensions = "15.2D x 18.1W x 8H Centimeters";
	String specialFeature = "Compact";
	
	System.out.println("The brand of the organizer is " + brand);
	System.out.println("The color of the organizer is " + color);
	System.out.println("The finish type  is " + finishType);
	System.out.println("The material  is " +material );
	System.out.println("The number of items is " + numberOfItems);
	System.out.println("The product dimensions is " + productDimensions);
	System.out.println("The special feature is " + specialFeature);
    
	System.out.println("Get feature method ended");
return;
	
    }
}










