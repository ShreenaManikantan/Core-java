class Telivision{

	static boolean isConnected 	= false;
	static int     maxVolume   	= 7;
	static int    currentVolume = 0;
	static int     minVolume    = 0;
	 
	public static boolean onOrOff(){
	
	//ref = Condition? value1: value2;
  isConnected = (isConnected == false)? true : false;
	
	/*if(!isConnected) isConnected=true;
		
	else  isConnected=false;*/
	
	return isConnected;
	} 
	
	public static void increaseVolume(){
		System.out.println("increaseVolume started");
		if(isConnected ){
			if(currentVolume<maxVolume){
				currentVolume = currentVolume++;
				System.out.println("current volume is "+currentVolume);
			}
			else{
				System.out.println("max volume reached");
			}
		}
		else{
			System.out.println("please turn on the Tv");
		}
		System.out.println("increaseVolume ended");
	return ;	
	}
	
	public static void decreaseVolume(){
		System.out.println("decreaseVolume started");
		if(isConnected){
			if(currentVolume>minVolume){
				 currentVolume = currentVolume-- ;
				System.out.println("current volume is "+currentVolume);
			}
			else{
				System.out.println("min volume reached");
			}
		}
		else{
			System.out.println("please turn on the TV");
		}
		System.out.println("decreaseVolume ended");
	return ;	
	}
}



