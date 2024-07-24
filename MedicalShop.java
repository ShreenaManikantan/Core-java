class MedicalShop{

  static String medicineNames[]= {null,null,null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean addMedicineName(String medicineName){
 
 boolean isMedicineAdded = false;
 
  if(index<medicineNames.length){
  if(medicineName!=null){
  medicineNames[index++]=medicineName;
  isMedicineAdded=true;
  }
  else
  System.out.println("medicine Name is invalid");
  }
  else
   System.out.println("sorry...medicine Name is full");
   
   return isMedicineAdded;
  }
  
  public static void showMedicineList(){
  System.out.println("main started");
  
  for(String medicineName:medicineNames)
  System.out.println(medicineName);
  
  System.out.println("main started");
  
  }
}