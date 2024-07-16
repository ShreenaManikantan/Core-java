class RechargePlansRunner{

   public static void main(String []airtel){
   
   System.out.println("main started");
   String airtelPlanName ="1month unlimited";
   double search =RechargePlans.search(airtelPlanName,2);
   
   search =RechargePlans.search(airtelPlanName,2);
   System.out.println("The price of the airtel Plan is " + search);
   System.out.println("main started");
   
   }

}