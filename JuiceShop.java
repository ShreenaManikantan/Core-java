class JuiceShop{

   static String juiceNames[]={null,null,null,null,null,null};
   static int index;
   public static boolean addJuiceName(String juiceName){
   
   boolean isJuiceNameAdded = false;
   
   if(index<juiceNames.length){
   if(juiceName!=null){
   juiceNames[index++]=juiceName;
   isJuiceNameAdded=true;
   }
   else
   System.out.println("juice name is invalid");
   }
   else
   System.out.println("sorry.. juiceName is full");
   return isJuiceNameAdded;
   }
   public static void showJuiceName(){
   System.out.println("Main started");
   
   for(String juiceName:juiceNames)
   System.out.println(juiceName);
   System.out.println("Main ended");

   
   }

}