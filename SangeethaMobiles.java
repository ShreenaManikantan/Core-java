class SangeethaMobiles{

   public static double search(String mobileBrand){
   double getPrice = 0.0;
   if(mobileBrand == "Samsung Galaxy A23 Black 8GB 128GB"){
    getPrice = 19999.00;
    return getPrice;
   }
    if(mobileBrand == "Samsung Galaxy S23 Plus Black 8GB 256GB"){
    getPrice = 84999.00;
    return getPrice;
   } 
   if(mobileBrand == "Vivo T1 Pro Turbo Black 8GB 128GB"){
    getPrice = 24999.00;
    return getPrice;
   }
    if(mobileBrand == "Vivo V27 Pro Noble Black 12GB 256GB"){
    getPrice = 42999.00;
    return getPrice;
   }
    if(mobileBrand == "Realme 11 Pro 5G Black 8GB 256GB"){
    getPrice = 22999.00;
    return getPrice;
   }
    if(mobileBrand == "Realme 10 Pro 5G Nebula Blue 8GB 128GB"){
    getPrice = 19999.00;
    return getPrice;
   }
    if(mobileBrand == "Xiaomi 13 Pro Ceramic Black 12GB 256GB"){
    getPrice = 74999.00;
    return getPrice;
   }
    if(mobileBrand == "Redmi 12C Mint Green 6GB 128GB"){
    getPrice =8499.00 ;
    return getPrice;
   }
    if(mobileBrand == "Realme X 4GB 64GB with 5G Tablet Glacier Blue"){
    getPrice = 25999.00;
    return getPrice;
   }
   if(mobileBrand == "Apple iPhone 15 128GB Blue"){
    getPrice = 69999.00;
    return getPrice;
   }
    if(mobileBrand == "Apple iphone 15 Pro 128GB White Titanium"){
    getPrice = 134900.00;
    return getPrice;
   }
    if(mobileBrand == "Apple iphone 15 Pro Max 1TB Natural Titanium"){
    getPrice = 187900.00;
    return getPrice;
   }
    if(mobileBrand == "Nokia C20 Plus Dark Grey 3GB 32GB"){
    getPrice = 6999.00;
    return getPrice;
   }
    if(mobileBrand == "Nokia C30 White 3GB 32GB"){
    getPrice = 7999.00;
    return getPrice;
   }
   if(mobileBrand == "Samsung Galaxy M34 Black 8GB 128GB"){
    getPrice = 18999.00;
    return getPrice;
   }
	else{
    System.out.println( mobileBrand + " Not found");
     return 0.0;
    }
   }
 }