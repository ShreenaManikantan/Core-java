class ZomatoRunner{

   public static void main(String [] dish){
   
   System.out.println("main started");
   String dishName ="palak gobi";
   double search =Zomato.search(dishName,6);
   System.out.println("The price of  this dish is " + search);
   System.out.println("main started");

   }

}