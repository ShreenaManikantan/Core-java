class Flipkart{

  static String itemNames[]= {null,null,null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean addItemName(String itemName){
 
 boolean isItemAdded = false;
 
  if(index<itemNames.length){
  if(itemName!=null){
  itemNames[index++]=itemName;
  isItemAdded=true;
  }
  else
  System.out.println("item Name is invalid");
  }
  else
   System.out.println("sorry...itemName is full");
   
   return isItemAdded;
  }
  
  public static void showItemList(){
  System.out.println("main started");
  
  for(String itemName:itemNames)
  System.out.println(itemName);
  
  System.out.println("main started");
  
  }
}