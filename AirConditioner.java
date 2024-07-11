class AirConditioner{

	static boolean isConnected 	= false;
	static int     maxSpeed   	= 6;
	static int    currentSpeed = 0;
	static int     minSpeed    = 0;
	 
	public static boolean onOrOff(){
	
	if(!isConnected) isConnected=true;
		
	else  isConnected=false;
	
	return isConnected;
	} 
	
	public static void increaseSpeed(){
		System.out.println("increaseSpeed started");
		if(isConnected ){
			if(currentSpeed<maxSpeed){
				currentSpeed = currentSpeed+1;
				System.out.println("current Speed is "+currentSpeed);
			}
			else{
				System.out.println("max Speed reached");
			}
		}
		else{
			System.out.println("please turn on the AirConditioner");
		}
		System.out.println("increaseSpeed ended");
	return ;	
	}
	
	public static void decreaseSpeed(){
		System.out.println("decreaseSpeed started");
		if(isConnected == true){
			if(currentSpeed>minSpeed){
				 currentSpeed = currentSpeed-1;
				System.out.println("current Speed is "+currentSpeed);
			}
			else{
				System.out.println("min Speed reached");
			}
		}
		else{
			System.out.println("please turn on the AirConditioner");
		}
		System.out.println("decreaseSpeed ended");
	return ;	
	}
}



