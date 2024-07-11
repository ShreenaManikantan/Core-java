class WashingMachineRunner{

   //method declaration
   public static void main(String [] lg){
   System.out.println("Switch on washing macahine");
  
   boolean connect = WashingMachine.onOrOff();
   System.out.println("washing machine is " + connect);
   
   connect = WashingMachine.onOrOff();  
   System.out.println("washing machine is " + connect);

  System.out.println("Switch off washing macahine");
   }

}