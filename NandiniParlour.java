class NandiniParlour{

   public static double search(String milkProductName){
   double getProductPrice = 0.0;
    if(milkProductName=="Nandini Peda"){
    getProductPrice=120;
    return getProductPrice;
	}
	if(milkProductName=="mysoor pak"){
    getProductPrice = 239;
    return getProductPrice;
	}
	if(milkProductName=="belhaum kunda"){
    getProductPrice = 265;
    return getProductPrice;
	}
	if(milkProductName=="rasgulla"){
    getProductPrice =326 ;
    return getProductPrice;
	}
	if(milkProductName=="badham milk"){
    getProductPrice =369 ;
    return getProductPrice;
	}
	if(milkProductName=="elaichi peda"){
    getProductPrice =258 ;
    return getProductPrice;
	}
	if(milkProductName=="gulab jamun"){
    getProductPrice = 147;
    return getProductPrice;
	}
	if(milkProductName=="besan ladoo"){
    getProductPrice = 159;
    return getProductPrice;
	}
	if(milkProductName=="skimmed milk power"){
    getProductPrice = 357;
    return getProductPrice;
	}
	if(milkProductName=="Nandini payasa mix"){
    getProductPrice = 325;
    return getProductPrice;
	}
	else{
    System.out.println(milkProductName + " Not found");
     return 0.0;
    }
   }
 }