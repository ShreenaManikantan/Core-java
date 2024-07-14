class FlightPriceByDestinationNameRunner{

   public static void main(String []flight){
   
   System.out.println("main started");
   
   String destinatioName =" delhi to Gwalior Madhya Pradesh";
   double search =FlightPriceByDestinationName.search(destinatioName);
   System.out.println("The flight price for destination is " + search);
   
   System.out.println("main started");

   }

}