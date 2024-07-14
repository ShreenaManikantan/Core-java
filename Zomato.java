class Zomato{

   public static double search(String dishName){
   double getfoodPrice = 0.0;
   if(dishName == "noodles"){
    getfoodPrice = 80.00;
    return getfoodPrice;
	}
	if(dishName == "bel puri"){
    getfoodPrice = 78.00;
    return getfoodPrice;
	}
	if(dishName == "vadapav"){
    getfoodPrice = 80.00;
    return getfoodPrice;
	}
	if(dishName == "sev puri"){
    getfoodPrice = 60.00;
    return getfoodPrice;
	}
	if(dishName == "pizza" ){
    getfoodPrice = 269.00;
    return getfoodPrice;
	}
	if(dishName == "nippat masala"){
    getfoodPrice = 49.00;
    return getfoodPrice;
	}
	if(dishName == "masala pappad"){
    getfoodPrice = 65.00;
    return getfoodPrice;
	}
	if(dishName == "maggi"){
    getfoodPrice = 68.00;
    return getfoodPrice;
	}
	if(dishName == "burgger"){
    getfoodPrice = 57.00;
    return getfoodPrice;
	}
	if(dishName == "egg roll" ){
    getfoodPrice = 99.00;
    return getfoodPrice;
	}
	if(dishName == "puff"){
    getfoodPrice = 49.00;
    return getfoodPrice;
	}
	if(dishName == "cream roll"){
    getfoodPrice = 63.00;
    return getfoodPrice;
	}
	if(dishName == "black forest cake"){
    getfoodPrice = 67.00;
    return getfoodPrice;
	}
	if(dishName == "honey cake"){
    getfoodPrice = 59.00;
    return getfoodPrice;
	}
	if(dishName == "chikken role"){
    getfoodPrice = 55.00;
    return getfoodPrice;
	}
	if(dishName == "sandwich"){
    getfoodPrice = 50.00;
    return getfoodPrice;
	}
	if(dishName == "mushroom manchuriyan"){
    getfoodPrice = 68.00;
    return getfoodPrice;
	}
	if(dishName == "palak gobi"){
    getfoodPrice = 87.00;
    return getfoodPrice;
	}
	if(dishName == "palak pannir"){
    getfoodPrice = 67.00;
    return getfoodPrice;
	}
	if(dishName == "dahi puri"){
    getfoodPrice = 47.00;
    return getfoodPrice;
	}
	else{
    System.out.println(dishName + " Not found");
     return 0.0;
    }
   }
 }