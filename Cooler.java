class Cooler{

   static boolean isSwitchedOn = false;
   
   public static void turnOn(){
   
   System.out.println("Strat of turnOn");
   if(isSwitchedOn == false){
   isSwitchedOn = true;
   System.out.println("Cooler is turned on...");
   }
   System.out.println("End of turnOn");
   
   }

   public static void turnOff(){
   System.out.println("Strat of turnOff");
   if(isSwitchedOn == true){
   isSwitchedOn = false;
   System.out.println("Cooler is turned off...");
   }
   System.out.println("End of turnOff");
   
   }

}