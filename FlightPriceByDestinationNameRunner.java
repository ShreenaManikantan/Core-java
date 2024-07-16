class FlightPriceByDestinationNameRunner{

   public static void main(String []flight){
   
   System.out.println("main started");
   
   String destinatioName ="delhi to Khajuraho Madhya Pradesh";
   double search =FlightPriceByDestinationName.search(destinatioName,2);
   System.out.println("The flight price for destination is " + search);
   
   System.out.println("main started");

   }	
}