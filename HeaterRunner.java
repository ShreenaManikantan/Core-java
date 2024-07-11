class HeaterRunner{

   public static void main(String [] Bajaj){
   
   System.out.println("Main Stated");
   
   // invoking a method
      boolean connect = Heater.onOrOff();
      System.out.println("Heater is " + connect);
	  connect = Heater.onOrOff();
      System.out.println("Heater is "+ connect);
   
   System.out.println("Main Ended");  
   }

}