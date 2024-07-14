class FlightPriceByDestinationName{

   public static double search(String destinatioName){
   double getPrice = 0.0;
   if(destinatioName == " delhi to Gwalior Madhya Pradesh"){
    getPrice =1199.00 ;
    return getPrice;
	}
	if(destinatioName == "delhi to Jaipur Rajasthan"){
    getPrice = 1335.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Bathinda Punjab"){
    getPrice = 1260.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Dehradun Uttarakhand"){
    getPrice = 1543.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Udaipur Rajasthan"){
    getPrice = 2174.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Kanpur Uttar Pradesh"){
    getPrice = 2249.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Lucknow Uttar Pradesh"){
    getPrice = 2300.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Chandigarh Chandigarh"){
    getPrice = 2384.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Pantnagar Uttarakhand"){
    getPrice = 2647.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Amritsar Punjab"){
    getPrice = 2799.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Ayodhya Uttar Pradesh"){
    getPrice = 2819.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Shimla Himachal Pradesh"){
    getPrice = 2849.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Ahmedabad Gujarat"){
    getPrice = 2678.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Prayagraj Uttar Pradesh"){
    getPrice =2693.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Bhopal Madhya Pradesh"){
    getPrice = 3110.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Jabalpur Madhya Pradesh"){
    getPrice = 3269.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Khajuraho Madhya Pradesh"){
    getPrice = 3544.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Belgaum Karnataka"){
    getPrice = 3260.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Vadodara Gujarat"){
    getPrice = 3697.00;
    return getPrice;
	}
	if(destinatioName == "delhi to Indore Madhya Pradesh"){
    getPrice = 3695.00;
    return getPrice;
	}
	else{
    System.out.println(destinatioName + " Not found");
     return 0.0;
    }
   }
 }