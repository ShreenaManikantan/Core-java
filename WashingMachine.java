class WashingMachine{

    static boolean isSwitchedOn = false;
    
	public static void turnOn(){
	System.out.println("Start of turnOn");
	if(isSwitchedOn == false){
	isSwitchedOn = true;
    System.out.println("washing machine is turned on");
    }
  
    System.out.println("End of turnOff");
 }
    
	public static void turnOff(){
	System.out.println("Start of turnOn");
	if(isSwitchedOn == true){
	isSwitchedOn = false;
    System.out.println("washing machine is turned off");
    }
  
    System.out.println("End of turnOff");
 }

 
}
