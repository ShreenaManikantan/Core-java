class InsurancePackage{

   public static double search(String insuranceName){
   double insurancePrice ;
   if(insuranceName == "hdfc life insurance"){
    insurancePrice = 8000.69;
    return insurancePrice;
 
  // return 8000.69;
   }
   if(insuranceName == "max life"){
    insurancePrice = 7000.67;
	return insurancePrice;
	// return 7000.67;
   }
   if(insuranceName == "ICICI Prudential Life Insurance"){
    // return 9000.78;
	insurancePrice = 9000.67;
	return insurancePrice;
	
   }
   if(insuranceName =="Kotak Mahindra Life Insurance"){
      //return 8987.23;
	  insurancePrice = 8987.23;
	  return insurancePrice;
   }
   if(insuranceName =="SBI Life Insurance "){
	 //return 1000.23;
	 insurancePrice = 1000.23;
	 return insurancePrice;
	 
   }
   if(insuranceName == "Reliance Nippon Life Insurance"){
	 //return 7500.23;
    insurancePrice = 7500.23;
     return insurancePrice;	
   }
   if(insuranceName == "Future Generali India Life Insurance"){
	 //return 8603.12;
	 insurancePrice = 8603.12;
     return insurancePrice;	
   }
   if(insuranceName == "Pramerica Life Insurance "){
	 //return 98620.4;
	 insurancePrice = 98620.4;
     return insurancePrice;	
   }
   if(insuranceName == "IndiaFirst Life Insurance"){
      //return 78912.23;
	  insurancePrice = 78912.23;
     return insurancePrice;	
   }
   if(insuranceName == "IDBI Federal Life Insurance " ){
	   //return 7956.26;
	   insurancePrice = 7956.26;
     return insurancePrice;	
   }
   if(insuranceName == "indiaFirst Life Insurance"){
	   //return 9635.232;
	   insurancePrice = 9635.232;
     return insurancePrice;	
   }
   if(insuranceName == "Pramerica Life Insurance"){
	   //return 9658.23;
	   insurancePrice = 9658.23;
     return insurancePrice;	
   }
   if(insuranceName == "Aegon Life Insurance "){
	  // return 1123.236;
	  insurancePrice = 1123.236;
     return insurancePrice;	
   }
   if(insuranceName == "canara life insurance "){
	  // return 9537.3;
	  insurancePrice = 9537.3;
     return insurancePrice;	
   }
   if(insuranceName == "Canara HSBC Oriental Bank of Commerce Life Insurance "){
   //return 6931.025;
     insurancePrice =6931.025 ;
     return insurancePrice;	
   }
   else{
   System.out.println( insuranceName + " Not found");
     return 0.0;
    }
  }
}