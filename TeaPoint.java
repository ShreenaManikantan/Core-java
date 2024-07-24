class TeaPoint{

   static String teaNames[]={null,null,null,null,null,null};
   static int index;
  
  public static boolean addTeaName(String teaName)
  {
  boolean isTeaNameadded=false;
  if(index< teaNames.length){
  if(teaName !=null){
  teaNames[index++]=teaName;
  isTeaNameadded =true;
  
  }
  else
  System.out.println("Tea name is invalid");
  }
  else
  System.out.println("sorry ... teaName is full..");

    return isTeaNameadded;
  }

  public static void showTeaName(){
  
  System.out.println("main started");
  
  for(String teaName:teaNames)
  System.out.println(teaName);
   System.out.println("main ended"); 
  }
  
}