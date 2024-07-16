class FlightPriceByDestinationName{

   static double getPrice = 0.0;
    public static double search(String destinatioName){
    
	if(destinatioName == " delhi to Gwalior Madhya Pradesh")
    return getPrice =1199.00 ;
    
	if(destinatioName == "delhi to Jaipur Rajasthan")
    return getPrice = 1335.00;
    
	if(destinatioName == "delhi to Bathinda Punjab")
    return getPrice = 1260.00;
    
	if(destinatioName == "delhi to Dehradun Uttarakhand")
    return getPrice = 1543.00;
    
	if(destinatioName == "delhi to Udaipur Rajasthan")
    return getPrice = 2174.00;
    
	if(destinatioName == "delhi to Kanpur Uttar Pradesh")
    return getPrice = 2249.00;
   
	if(destinatioName == "delhi to Lucknow Uttar Pradesh")
    return getPrice = 2300.00;
    
	if(destinatioName == "delhi to Chandigarh Chandigarh")
    return getPrice = 2384.00;
   
	if(destinatioName == "delhi to Pantnagar Uttarakhand")
    return getPrice = 2647.00;

	if(destinatioName == "delhi to Amritsar Punjab")
    return getPrice = 2799.00;
    
	if(destinatioName == "delhi to Ayodhya Uttar Pradesh")
    return getPrice = 2819.00;

	if(destinatioName == "delhi to Shimla Himachal Pradesh")
    return getPrice = 2849.00;

	if(destinatioName == "delhi to Ahmedabad Gujarat")
    return getPrice = 2678.00;

	if(destinatioName == "delhi to Prayagraj Uttar Pradesh")
    return getPrice =2693.00;

	if(destinatioName == "delhi to Bhopal Madhya Pradesh")
    return getPrice = 3110.00;

	if(destinatioName == "delhi to Jabalpur Madhya Pradesh")
    return getPrice = 3269.00;

	if(destinatioName == "delhi to Khajuraho Madhya Pradesh")
    return getPrice = 3544.00;

	if(destinatioName == "delhi to Belgaum Karnataka")
    return getPrice = 3260.00;

	if(destinatioName == "delhi to Vadodara Gujarat")
    return getPrice = 3697.00;

	if(destinatioName == "delhi to Indore Madhya Pradesh")
    return getPrice = 3695.00;

	else
    System.out.println(destinatioName + " Not found");
     return 0.0;
 }
    public static double search(String destinatioName, int quantity){
    quantity =2;
   
   if(destinatioName == "delhi to Khajuraho Madhya Pradesh")  return getPrice = 3260.00*2;
   
else{
	   return getPrice = 0.0;
   } 
  }
 }