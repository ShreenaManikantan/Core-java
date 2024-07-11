class HeaterRunner{
	
	static boolean connect;
	public static void main(String[] LG){
	
	System.out.println("main started");
	
	connect = Heater.onOrOff();
	System.out.println("is heater connected :"+connect);
	Heater.increaseHeat();
	
		connect = Heater.onOrOff();
	System.out.println("is Heater connected :"+connect);
		Heater.increaseHeat();
		Heater.decreaseHeat();
		connect = Heater.onOrOff();
			Heater.increaseHeat();
			Heater.increaseHeat();
			Heater.increaseHeat();
			Heater.increaseHeat();
			Heater.increaseHeat();
			Heater.increaseHeat();
			Heater.increaseHeat();
			
			Heater.decreaseHeat();
			Heater.decreaseHeat();
			Heater.decreaseHeat();
			Heater.decreaseHeat();
			Heater.decreaseHeat();
			Heater.decreaseHeat();
		    Heater.decreaseHeat();
			Heater.decreaseHeat();
			Heater.decreaseHeat();
	System.out.println("is Heater connected :"+connect);
		connect = Heater.onOrOff();
	System.out.println("is Heater connected :"+connect);
	
System.out.println("main ended");	
	}
}