class Zomato{
  
  static double getfoodPrice = 0.0;
   public static double search(String dishName){
   if(dishName == "noodles")
    return getfoodPrice = 80.00;
    
	if(dishName == "bel puri")
   return getfoodPrice = 78.00;
    
	if(dishName == "vadapav")
   return getfoodPrice = 80.00;
    
	if(dishName == "sev puri")
   return getfoodPrice = 60.00;
    
	if(dishName == "pizza" )
   return getfoodPrice = 269.00;
   
	if(dishName == "nippat masala")
   return getfoodPrice = 49.00;
    
	if(dishName == "masala pappad")
   return getfoodPrice = 65.00;
    
	if(dishName == "maggi")
   return getfoodPrice = 68.00;
    
	if(dishName == "burgger")
   return getfoodPrice = 57.00;
   
	if(dishName == "egg roll" )
   return getfoodPrice = 99.00;
    
	if(dishName == "puff")
   return getfoodPrice = 49.00;
    
	if(dishName == "cream roll")
   return getfoodPrice = 63.00;
    
	if(dishName == "black forest cake")
   return getfoodPrice = 67.00;
    
	if(dishName == "honey cake")
   return getfoodPrice = 59.00;
   
	if(dishName == "chikken role")
   return getfoodPrice = 55.00;
    
	if(dishName == "sandwich")
   return getfoodPrice = 50.00;
   
	if(dishName == "mushroom manchuriyan")
   return getfoodPrice = 68.00;
   
	if(dishName == "palak gobi")
   return getfoodPrice = 87.00;
    
	if(dishName == "palak pannir")
   return getfoodPrice = 67.00;
   
	if(dishName == "dahi puri")
   return getfoodPrice = 47.00;
    
	else
    System.out.println(dishName + " Not found");
     return 0.0;
    }
     public static double search(String dishName,int quantity){
     quantity=6;
     if(dishName == "palak gobi")return getfoodPrice = 87.00*6;
	 else{
	   return getfoodPrice = 0.0;
	 }
  }
 }