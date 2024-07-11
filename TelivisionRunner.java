class TelivisionRunner{
  
  public static void main(String [] samsung){
  
  System.out.println("Start of main");
  
  boolean connect = Telivision.onOrOff();
  System.out.println("Telivision is" + connect);
  connect = Telivision.onOrOff();
  System.out.println("Telivision is" + connect);
  System.out.println("End of main");
  }
  
  }