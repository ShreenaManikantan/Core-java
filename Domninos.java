class Domninos{

   public static double search(String foodName){
   double getfoodPrice = 0.0;
   if(foodName == "pepper chicken"){
    getfoodPrice = 180.00;
    return getfoodPrice;
	}
	if(foodName == "garlic chicken"){
    getfoodPrice = 278.00;
    return getfoodPrice;
	}
	if(foodName == "chicken sassage"){
    getfoodPrice = 180.00;
    return getfoodPrice;
	}
	if(foodName == " chicken dominator"){
    getfoodPrice = 260.00;
    return getfoodPrice;
	}
	if(foodName == "special chicken" ){
    getfoodPrice = 269.00;
    return getfoodPrice;
	}
	if(foodName == " chicken tikka"){
    getfoodPrice = 249.00;
    return getfoodPrice;
	}
	if(foodName == "veg pizza "){
    getfoodPrice = 265.00;
    return getfoodPrice;
	}
	if(foodName == "corn pizza"){
    getfoodPrice = 168.00;
    return getfoodPrice;
	}
	if(foodName == "chicken periperi"){
    getfoodPrice = 157.00;
    return getfoodPrice;
	}
	if(foodName == "chicken paradase" ){
    getfoodPrice = 299.00;
    return getfoodPrice;
	}
	if(foodName == "garlic bread"){
    getfoodPrice = 249.00;
    return getfoodPrice;
	}
	if(foodName == "barbecue chicken"){
    getfoodPrice = 563.00;
    return getfoodPrice;
	}
	if(foodName == "panner pizza"){
    getfoodPrice = 367.00;
    return getfoodPrice;
	}
	if(foodName == "tanduri"){
    getfoodPrice = 259.00;
    return getfoodPrice;
	}
	if(foodName == "veg tanduri"){
    getfoodPrice = 355.00;
    return getfoodPrice;
	}
	if(foodName == "cheese"){
    getfoodPrice = 550.00;
    return getfoodPrice;
	}
	if(foodName == "cheese and corn"){
    getfoodPrice = 268.00;
    return getfoodPrice;
	}
	if(foodName == "fresh vegies"){
    getfoodPrice = 187.00;
    return getfoodPrice;
	}
	if(foodName == "pepper egg"){
    getfoodPrice = 367.00;
    return getfoodPrice;
	}
	if(foodName == "egg pizza"){
    getfoodPrice = 247.00;
    return getfoodPrice;
	}
	else{
    System.out.println(foodName + " Not found");
     return 0.0;
    }
   }
 }