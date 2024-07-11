class WashingMachine{

   static boolean isConnected = false;
    
	public static boolean onOrOff(){
	System.out.println("Start of onOrOff");
	
	if(!isConnected )
		isConnected = true;
    else if(isConnected)
		isConnected = false;
    
    System.out.println("End of onOrOff");
	return isConnected;
 }
}

    