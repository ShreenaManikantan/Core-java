class Heater{

   static boolean isConnected = false;
   
   //method declaration
   public static boolean onOrOff(){
   System.out.println("Strat of onOrOff");
   if(isConnected == false){
   isConnected = true;
  }
   else if(isConnected == true){
   isConnected = false;
  }
   System.out.println("End of onOrOff");
   return isConnected;
   }

}