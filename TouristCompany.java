class TouristCompany{

  static String placeNames[]= {null,null,null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean addplaceName(String placeName){
 
 boolean isTouristplaceAdded = false;
 
  if(index<placeNames.length){
  if(placeName!=null){
  placeNames[index++]=placeName;
  isTouristplaceAdded=true;
  }
  else
  System.out.println("place Name is invalid");
  }
  else
   System.out.println("sorry...placeName is full");
   
   return isTouristplaceAdded;
  }
  
  public static void showTouristplaceList(){
  System.out.println("main started");
  
  for(String placeName:placeNames)
  System.out.println(placeName);
  
  System.out.println("main started");
  
  }
}