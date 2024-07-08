class AirConditioner{

   static boolean isConnected = false;
   
   public static void turnOn(){
   
   System.out.println("Strat of turnOn");
   if(isConnected == false){
   isConnected = true;
   System.out.println("Air Conditioner is turned on...");
   }
   System.out.println("End of turnOn");
   
   }

   public static void turnOff(){
   System.out.println("Strat of turnOff");
   if(isConnected == true){
   isConnected = false;
   System.out.println("AirConditioner is turned off...");
   }
   System.out.println("End of turnOff");
   
   }

}