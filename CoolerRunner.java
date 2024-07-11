class CoolerRunner{

   public static void main(String [] LG){
   
   System.out.println("Main Stated");
   
   boolean connect = Cooler.onOrOff();
   System.out.println("Cooler is " + connect);
   connect= Cooler.onOrOff();
   System.out.println("Cooler is " +connect);

   
   System.out.println("Main Ended");  
   }

}