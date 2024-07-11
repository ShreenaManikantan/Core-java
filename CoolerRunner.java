class CoolerRunner{
	
	static boolean connect;
	public static void main(String[] LG){
	
	System.out.println("main started");
	
	connect =Cooler.onOrOff();
	System.out.println("is cooler connected :"+connect);
	Cooler.increaseSpeed();
	
		connect = Cooler.onOrOff();
	System.out.println("is Cooler connected :"+connect);
	Cooler.increaseSpeed();
    Cooler.decreaseSpeed();
		connect = Cooler.onOrOff();
			Cooler.increaseSpeed();
			Cooler.increaseSpeed();
			Cooler.increaseSpeed();
			Cooler.increaseSpeed();
			Cooler.increaseSpeed();
			Cooler.increaseSpeed();
			
			Cooler.decreaseSpeed();
			Cooler.decreaseSpeed();
			Cooler.decreaseSpeed();
			Cooler.decreaseSpeed();
			Cooler.decreaseSpeed();
			Cooler.decreaseSpeed();
		    Cooler.decreaseSpeed();
			Cooler.decreaseSpeed();
	System.out.println("is Cooler connected :"+connect);
		connect = Cooler.onOrOff();
	System.out.println("is Cooler connected :"+connect);
	
System.out.println("main ended");	
	}
}