class Telivision{
 
  static boolean isConnected = false;
  
  public static void turnOn(){
  System.out.println("Start of turnOn");
  if(isConnected == false){
  isConnected = true;
  System.out.println("Telivision id turned on...");
  }
  System.out.println("End of turnOn");
  }

  public static void turnOff(){
  System.out.println("Start of turnOff");
  if(isConnected == true){
  isConnected = false;
  System.out.println("Telivision id turned off...");
  }
  System.out.println("End of turnOff");
  }
  
  
}