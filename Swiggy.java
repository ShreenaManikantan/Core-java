class Swiggy{

   static double getPrice = 0.0;
   public static double search(String foodName){

   if(foodName == "chiken fry")
   return getPrice =199.00 ;
    
	if(foodName == "mutton khaima")
   return getPrice = 233.00;
    
	if(foodName == "chiken 65")
   return getPrice = 260.00;
    
	if(foodName == "lemon chiken")
   return getPrice = 543.00;
    
	if(foodName == "kabab" )
   return getPrice = 274.00;
    
	if(foodName == "dragon chiken")
   return getPrice = 549.00;
    
	if(foodName == "egg pepper dry ")
   return getPrice = 300.00;
    
	if(foodName == "chiken pepper masala")
   return getPrice = 384.00;
   
	if(foodName == "chiken biriyani ")
   return getPrice = 647.00;
   
	if(foodName == "mutton biriyani" )
    return getPrice = 399.00;
   
	if(foodName == "chiken tikka" )
    return getPrice = 419.00;
    
	if(foodName == "kaal soup" )
    return getPrice = 2849.00;
    
	if(foodName == "panner pepper dry ")
    return getPrice = 378.00;
    
	if(foodName == "panner tikka masala ")
    return getPrice =393.00;
    
	if(foodName == "panipuri" )
    return getPrice = 210.00;
    
	if(foodName == "gobi manchuri ")
    return getPrice = 369.00;
   
	if(foodName == "gobi 65 ")
    return getPrice = 544.00;
    
	if(foodName == "shawarma" )
    return getPrice = 360.00;
    
	if(foodName == "chiken gravy ")
    return getPrice = 397.00;
    
	if(foodName == "chiken lollypop")
    return getPrice = 395.00;
   
	else
    System.out.println(foodName + " Not found");
     return 0.0;
    }
	 public static double search(String foodName,int quantity){
     quantity = 3;
	 if(foodName == "chiken lollypop") return getPrice = 395.00*3;
	 else{
	 return getPrice = 0.0;
	 }
   }
 }