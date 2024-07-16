class RechargePlans{

   static double planPrice = 0.0;
   public static double search(String airtelPlanName){
  
   if(airtelPlanName == "365days unlimited") return planPrice = 3599.0;
   
   if(airtelPlanName == "1month unlimited")return planPrice = 429.0;
	
   if(airtelPlanName == "84days unlimited local STD&Roming")return planPrice = 1199.0;
	
	if(airtelPlanName == "84days unlimited") return planPrice = 979.0;
	
	if(airtelPlanName == "90days unlimited") return planPrice = 929.0;
	
	if(airtelPlanName == "56days unlimited")return planPrice = 649.0;
	
	if(airtelPlanName == "28days unlimited local STD&Roming")return planPrice =549.0;
	
	if(airtelPlanName == "77days unlimited local STD&Roming")return planPrice = 489.0;
	
	if(airtelPlanName == "28days unlimited")return planPrice = 409.0;
	
	if(airtelPlanName == " 22days unlimited")return planPrice = 329.0;
	 
	if(airtelPlanName == "22days unlimited local STD&Roming")return planPrice = 359.0 ;

	if(airtelPlanName == "15 GB data pack")return planPrice = 181.0;
	
	if(airtelPlanName == "56days unlimited local STD&Roming")return planPrice = 679.0;
	
	if(airtelPlanName == "talk time")return planPrice = 300.0;
	
	if(airtelPlanName == "intrnational roaming for 10 days")return planPrice = 899.0;
  
	else
    System.out.println( "Not found:"+ airtelPlanName);
     return 0.0;
    
   }
    public static double search(String airtelPlanName,int quantity){
	
	 quantity = 2;
	if(airtelPlanName == "1month unlimited") return planPrice = 429.0 * 2;
     else{
		 return planPrice = 0.0;
	}
}
}