class SwiggyRunner{

   public static void main(String [] food){
   
   System.out.println("main started");
   String foodName ="chiken 65";
   double search =Swiggy.search(foodName);
   System.out.println("The price of  this dish is " + search);
   System.out.println("main started");

   }

}