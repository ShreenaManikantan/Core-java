class ZomatoRunner{

   public static void main(String [] dish){
   
   System.out.println("main started");
   String dishName ="noodles";
   double search =Zomato.search(dishName);
   System.out.println("The price of  this dish is " + search);
   System.out.println("main started");

   }

}