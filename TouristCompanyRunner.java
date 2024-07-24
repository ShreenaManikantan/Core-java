class TouristCompanyRunner{

  public static void main(String [] place){
  
  boolean isPlaceAdded = TouristCompany.addplaceName("mysoor palace");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("jog falls");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("lalbagh botanical garden");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("cubbon park");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("iskon temple");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("chikkamagaluru");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("nandi hill");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("udupi temple");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("kodagu");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("hampi");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("murdeshwar");
  System.out.println("is place added "+isPlaceAdded);
  
  
  TouristCompany.showTouristplaceList();
  }

}