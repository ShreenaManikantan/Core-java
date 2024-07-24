class MRPStore{

  static String alcoholNames[]= {null,null,null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean addalcoholName(String alcoholName){
 
 boolean isAlcoholNameAdded = false;
 
  if(index<alcoholNames.length){
  if(alcoholName!=null){
  alcoholNames[index++]=alcoholName;
  isAlcoholNameAdded=true;
  }
  else
  System.out.println("alcohol Name is invalid");
  }
  else
   System.out.println("sorry...alcohol Name is full");
   
   return isAlcoholNameAdded;
  }
  
  public static void showAlcoholNameList(){
  System.out.println("main started");
  
  for(String alcoholName:alcoholNames)
  System.out.println(alcoholName);
  
  System.out.println("main started");
  
  }
}