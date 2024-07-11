class Fan{

	static boolean isConnected 	= false;
	static int     maxSpeed   	= 5;
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
			System.out.println("please turn on the fan");
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
			System.out.println("please turn on the Fan");
		}
		System.out.println("decreaseSpeed ended");
	return ;	
	}
}



