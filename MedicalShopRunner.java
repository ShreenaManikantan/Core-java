class MedicalShopRunner{

  public static void main(String [] medicine){
  
  boolean isMedicineAdded = MedicalShop .addMedicineName("dolo650");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("cetirizine");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("Azithromycin");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("amoxicillin");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("vitamin D");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("Amlodipine");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("ibuprofren");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("albuterol sulfate");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("cyclobenaprine hydrochloride");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("hydrochlorothiazide");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("cephalexin");
  System.out.println("is medicine added "+isMedicineAdded);
 
  MedicalShop.showMedicineList();
  
  boolean medicineUpdated = MedicalShop .updateMedicineName("paracetamol","hydrochlorothiazide");
  System.out.println("is medicine updated "+medicineUpdated);
 
  MedicalShop.showMedicineList();
  
  boolean medicineDeleted = MedicalShop .deleteMedicineName("cyclobenaprine hydrochloride");
  System.out.println("is medicine deleted "+medicineDeleted);
 
  MedicalShop.showMedicineList();
  }

}