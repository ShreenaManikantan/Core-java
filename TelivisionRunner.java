class TelivisionRunner{
	
	static boolean connect;
	public static void main(String[] LG){
	
	System.out.println("main started");
	
	connect = Telivision.onOrOff();
	System.out.println("is Tv connected :"+connect);
	Telivision.increaseVolume();
	
		connect = Telivision.onOrOff();
	System.out.println("is Tv connected :"+connect);
		Telivision.increaseVolume();
		Speaker.decreaseVolume();
		connect = Telivision.onOrOff();
			Telivision.increaseVolume();
			Telivision.increaseVolume();
			Telivision.increaseVolume();
			Telivision.increaseVolume();
			Telivision.increaseVolume();
			Telivision.increaseVolume();
			Telivision.increaseVolume();
			
			Telivision.decreaseVolume();
			Telivision.decreaseVolume();
			Telivision.decreaseVolume();
			Telivision.decreaseVolume();
			Telivision.decreaseVolume();
			Telivision.decreaseVolume();
		    Telivision.decreaseVolume();
			Telivision.decreaseVolume();
			Telivision.decreaseVolume();
	System.out.println("is Tv connected :"+connect);
		connect = Telivision.onOrOff();
	System.out.println("is Tv connected :"+connect);
	
System.out.println("main ended");	
	}
}