class FanRunner{
	
	static boolean connect;
	public static void main(String[] BAJAJ){
		
	System.out.println("main started");
	
	connect =Fan.onOrOff();
	System.out.println("is Fan connected :"+connect);
	Fan.increaseSpeed();
	
		connect = Fan.onOrOff();
	System.out.println("is Fan connected :"+connect);
	Fan.increaseSpeed();
    Fan.decreaseSpeed();
		connect = Fan.onOrOff();
			Fan.increaseSpeed();
			Fan.increaseSpeed();
			Fan.increaseSpeed();
			Fan.increaseSpeed();
			Fan.increaseSpeed();
			
			Fan.decreaseSpeed();
			Fan.decreaseSpeed();
			Fan.decreaseSpeed();
			Fan.decreaseSpeed();
			Fan.decreaseSpeed();
			Fan.decreaseSpeed();
		    
	System.out.println("is Fan connected :"+connect);
		connect = Fan.onOrOff();
	System.out.println("is Fan connected :"+connect);
	
System.out.println("main ended");	
	}
}