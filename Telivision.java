class Telivision{
 
  static boolean isConnected = false;
  static  int maxVolume  = 7;
  static int currentVolume;
                //signature of method
  public static boolean onOrOff(){
  System.out.println("Start of turnOn");
  if(isConnected == false){
  isConnected = true;
  }
   else if(isConnected == true){
  isConnected = false;

  }
  System.out.println("End of turnOn");
  return isConnected;
  }
  
//inmcreaseVolume
   public static void increaseVolume




}

