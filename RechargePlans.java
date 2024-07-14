class RechargePlans{

   public static double search(String airtelPlanName){
   double planPrice = 0.0;
   if(airtelPlanName == "365days unlimited"){
    planPrice = 3599.0;
    return planPrice;
   }
   if(airtelPlanName == "1month unlimited"){
    planPrice = 429.0;
	return planPrice;
   }
   if(airtelPlanName == "84days unlimited local STD&Roming"){
	planPrice = 1199.0;
	return planPrice;
	}
	if(airtelPlanName == "84days unlimited"){
	planPrice = 979.0;
	return planPrice;
	}
	if(airtelPlanName == "90days unlimited"){
	planPrice = 929.0;
	return planPrice;
	}
	if(airtelPlanName == "56days unlimited"){
	planPrice = 649.0;
	return planPrice;
	}
	if(airtelPlanName == "28days unlimited local STD&Roming"){
	planPrice =549.0;
	return planPrice;
	}
	if(airtelPlanName == "77days unlimited local STD&Roming"){
	planPrice = 489.0;
	return planPrice;
	}
	if(airtelPlanName == "28days unlimited"){
	planPrice = 409.0;
	return planPrice;
	}
	if(airtelPlanName == " 22days unlimited"){
	planPrice = 329.0;
	return planPrice;
	}
	if(airtelPlanName == "22days unlimited local STD&Roming"){
	planPrice = 359.0 ;
	return planPrice;
	}
	if(airtelPlanName == "15 GB data pack"){
	planPrice = 181.0;
	return planPrice;
	}
	if(airtelPlanName == "56days unlimited local STD&Roming"){
	planPrice = 679.0;
	return planPrice;
	}
	if(airtelPlanName == "talk time"){
	planPrice = 300.0;
	return planPrice;
	}
	if(airtelPlanName == "intrnational roaming for 10 days"){
	planPrice = 899.0;
	return planPrice;
	}
	else{
    System.out.println( airtelPlanName + " Not found");
     return 0.0;
    }
   }
 }