class NandiniParlour{

    static double getProductPrice = 0.0;
   public static double search(String milkProductName){
   
    if(milkProductName=="Nandini Peda")return getProductPrice=120;
   
	if(milkProductName=="mysoor pak")return getProductPrice = 239;
    
	if(milkProductName=="belhaum kunda") return getProductPrice = 265;
    
	if(milkProductName=="rasgulla")return getProductPrice =326 ;
    
	if(milkProductName=="badham milk") return getProductPrice =369 ;
   
	if(milkProductName=="elaichi peda") return getProductPrice =258 ;
    
	if(milkProductName=="gulab jamun")return getProductPrice = 147;
   
	if(milkProductName=="besan ladoo")return getProductPrice = 159;
    
	if(milkProductName=="skimmed milk power")return getProductPrice = 357;
    
	if(milkProductName=="Nandini payasa mix") return getProductPrice = 325;
     
	else
    System.out.println(milkProductName + " Not found");
     return 0.0;
    }
      public static double search(String milkProductName,int quantity){
	  quantity = 3;
      	if(milkProductName == "belhaum kunda") return getProductPrice = 265*3;
		else{
		return getProductPrice = 0.0;
		}
   }
 }