class RefrigeratorRunner{

   public static void main(String [] godrej){
   
   System.out.println("Main started");
   
   boolean connect = Refrigerator.onOrOff();
  System.out.println("Refrigerator is " + connect);
   connect = Refrigerator.onOrOff();
  System.out.println("Refrigerator is " + connect);
   
   System.out.println("Main ended");   
   
   }


}