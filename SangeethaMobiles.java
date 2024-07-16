class SangeethaMobiles{

   static double getPrice = 0.0;
   public static double search(String mobileBrand){
  
  if(mobileBrand == "Samsung Galaxy A23 Black 8GB 128GB") return getPrice = 19999.00;
   
   if(mobileBrand == "Samsung Galaxy S23 Plus Black 8GB 256GB") return getPrice = 84999.00;
   
  if(mobileBrand == "Vivo T1 Pro Turbo Black 8GB 128GB") return getPrice = 24999.00;
   
    if(mobileBrand == "Vivo V27 Pro Noble Black 12GB 256GB") return getPrice = 42999.00;
   
    if(mobileBrand == "Realme 11 Pro 5G Black 8GB 256GB") return getPrice = 22999.00;
    
    if(mobileBrand == "Realme 10 Pro 5G Nebula Blue 8GB 128GB") return getPrice = 19999.00;
  
    if(mobileBrand == "Xiaomi 13 Pro Ceramic Black 12GB 256GB") return getPrice = 74999.00;
    
    if(mobileBrand == "Redmi 12C Mint Green 6GB 128GB") return getPrice =8499.00 ;
    
    if(mobileBrand == "Realme X 4GB 64GB with 5G Tablet Glacier Blue") return getPrice = 25999.00;
   
   if(mobileBrand == "Apple iPhone 15 128GB Blue") return getPrice = 69999.00;
   
    if(mobileBrand == "Apple iphone 15 Pro 128GB White Titanium") return getPrice = 134900.00;
    
    if(mobileBrand == "Apple iphone 15 Pro Max 1TB Natural Titanium") return getPrice = 187900.00;
   
    if(mobileBrand == "Nokia C20 Plus Dark Grey 3GB 32GB")return getPrice = 6999.00;
   
    if(mobileBrand == "Nokia C30 White 3GB 32GB")return getPrice = 7999.00;
    
   if(mobileBrand == "Samsung Galaxy M34 Black 8GB 128GB")return getPrice = 18999.00;
   
	else
    System.out.println( mobileBrand + " Not found");
     return 0.0;
   }
    public static double search(String mobileBrand,int quantity){
	quantity = 3;
	if(mobileBrand == "Vivo V27 Pro Noble Black 12GB 256GB") return getPrice = 42999.00 * 3;
   else{
	   return getPrice = 0.0;
   }
 }
}