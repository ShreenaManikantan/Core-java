class Fan{

   static boolean isConnected = false;
   
   public static boolean turnOn(){
   
   System.out.println("Strat of turnOn");
   if(isConnected == false){
   isConnected = true;
   
   }
   if(isConnected == true){
   isConnected = false;
   }
   System.out.println("End of turnOn");
   return isConnected;
   }
}