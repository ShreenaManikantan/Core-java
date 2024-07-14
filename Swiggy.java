class Swiggy{

   public static double search(String foodName){
   double getPrice = 0.0;
   if(foodName == "chiken fry"){
    getPrice =199.00 ;
    return getPrice;
	}
	if(foodName == "mutton khaima"){
    getPrice = 233.00;
    return getPrice;
	}
	if(foodName == "chiken 65"){
    getPrice = 260.00;
    return getPrice;
	}
	if(foodName == "lemon chiken"){
    getPrice = 543.00;
    return getPrice;
	}
	if(foodName == "kabab" ){
    getPrice = 274.00;
    return getPrice;
	}
	if(foodName == "dragon chiken"){
    getPrice = 549.00;
    return getPrice;
	}
	if(foodName == "egg pepper dry "){
    getPrice = 300.00;
    return getPrice;
	}
	if(foodName == "chiken pepper masala"){
    getPrice = 384.00;
    return getPrice;
	}
	if(foodName == "chiken biriyani "){
    getPrice = 647.00;
    return getPrice;
	}
	if(foodName == "mutton biriyani" ){
    getPrice = 399.00;
    return getPrice;
	}
	if(foodName == "chiken tikka" ){
    getPrice = 419.00;
    return getPrice;
	}
	if(foodName == "kaal soup" ){
    getPrice = 2849.00;
    return getPrice;
	}
	if(foodName == "panner pepper dry "){
    getPrice = 378.00;
    return getPrice;
	}
	if(foodName == "panner tikka masala "){
    getPrice =393.00;
    return getPrice;
	}
	if(foodName == "panipuri" ){
    getPrice = 210.00;
    return getPrice;
	}
	if(foodName == "gobi manchuri "){
    getPrice = 369.00;
    return getPrice;
	}
	if(foodName == "gobi 65 "){
    getPrice = 544.00;
    return getPrice;
	}
	if(foodName == "shawarma" ){
    getPrice = 360.00;
    return getPrice;
	}
	if(foodName == "chiken gravy "){
    getPrice = 397.00;
    return getPrice;
	}
	if(foodName == "chiken lollypop"){
    getPrice = 395.00;
    return getPrice;
	}
	else{
    System.out.println(foodName + " Not found");
     return 0.0;
    }
   }
 }