class WashingMachineRunner{
	
	static boolean connect;
	public static void main(String[] LG){
	
	System.out.println("main started");
	
	connect = WashingMachine.onOrOff();
	System.out.println("is Washing Machine connected :"+connect);
	WashingMachine.increaseSpeed();
	
		connect = WashingMachine.onOrOff();
	System.out.println("is Washing Machine connected :"+connect);
	WashingMachine.increaseSpeed();
    WashingMachine.decreaseSpeed();
		connect = WashingMachine.onOrOff();
			WashingMachine.increaseSpeed();
			WashingMachine.increaseSpeed();
			WashingMachine.increaseSpeed();
			WashingMachine.increaseSpeed();
			WashingMachine.increaseSpeed();
			WashingMachine.increaseSpeed();
			WashingMachine.increaseSpeed();
			
			WashingMachine.decreaseSpeed();
			WashingMachine.decreaseSpeed();
			WashingMachine.decreaseSpeed();
			WashingMachine.decreaseSpeed();
			WashingMachine.decreaseSpeed();
			WashingMachine.decreaseSpeed();
		    WashingMachine.decreaseSpeed();
			WashingMachine.decreaseSpeed();
			WashingMachine.decreaseSpeed();
	System.out.println("is Washing Machine connected :"+connect);
		connect = WashingMachine.onOrOff();
	System.out.println("is Washing Machine connected :"+connect);
	
System.out.println("main ended");	
	}
}