class SwiggyRunner{

   public static void main(String [] food){
   
   System.out.println("main started");
   String foodName ="chiken lollypop";
   double search =Swiggy.search(foodName,3);
   System.out.println("The price of  this dish is " + search);
   System.out.println("main started");

   }

}