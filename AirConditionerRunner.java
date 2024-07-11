class AirConditionerRunner{

   public static void main(String [] Whirlpool){
   
   System.out.println("Main Stated");
   boolean connect = AirConditioner.onOrOff();
   System.out.println("Air Conditioner is "+ connect);
   connect = AirConditioner.onOrOff();
   System.out.println("AirConditioner is " + connect);
   System.out.println("Main Ended");  
   }

}