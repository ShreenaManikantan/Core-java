class AirConditionerRunner{
	
	static boolean connect;
	public static void main(String[] samsung){
		
	System.out.println("main started");
	
	connect =AirConditioner.onOrOff();
	System.out.println("is AirConditioner connected :"+connect);
	AirConditioner.increaseSpeed();
	
		connect = AirConditioner.onOrOff();
	System.out.println("is AirConditioner connected :"+connect);
	AirConditioner.increaseSpeed();
    AirConditioner.decreaseSpeed();
		connect = AirConditioner.onOrOff();
			AirConditioner.increaseSpeed();
			AirConditioner.increaseSpeed();
			AirConditioner.increaseSpeed();
			AirConditioner.increaseSpeed();
			AirConditioner.increaseSpeed();
			AirConditioner.increaseSpeed();
		
			
			AirConditioner.decreaseSpeed();
			AirConditioner.decreaseSpeed();
			AirConditioner.decreaseSpeed();
			AirConditioner.decreaseSpeed();
			AirConditioner.decreaseSpeed();
			AirConditioner.decreaseSpeed();
		    AirConditioner.decreaseSpeed();
			AirConditioner.decreaseSpeed();
	System.out.println("is AirConditioner connected :"+connect);
		connect = AirConditioner.onOrOff();
	System.out.println("is AirConditioner connected :"+connect);
	
System.out.println("main ended");	
	}
}