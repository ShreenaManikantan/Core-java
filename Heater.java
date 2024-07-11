class Heater{

	static boolean isConnected 	= false;
	static int     maxHeat   	= 7;
	static int    currentHeat = 0;
	static int     minHeat    = 0;
	 
	public static boolean onOrOff(){
	
	if(!isConnected) isConnected=true;
		
	else  isConnected=false;
	
	return isConnected;
	} 
	
	public static void increaseHeat(){
		System.out.println("increaseHeat started");
		if(isConnected ){
			if(currentHeat<maxHeat){
				currentHeat = currentHeat+1;
				System.out.println("current Heat is "+ currentHeat);
			}
			else{
				System.out.println("max Heat reached");
			}
		}
		else{
			System.out.println("please turn on the Heater");
		}
		System.out.println("increaseHeat ended");
	return ;	
	}
	
	public static void decreaseHeat(){
		System.out.println("decreaseHeat started");
		if(isConnected){
			if(currentHeat>minHeat){
				 currentHeat = currentHeat-1;
				System.out.println("current Heat is "+currentHeat);
			}
			else{
				System.out.println("min Heat reached");
			}
		}
		else{
			System.out.println("please turn on the Heater");
		}
		System.out.println("decreaseHeat ended");
	return ;	
	}
}



