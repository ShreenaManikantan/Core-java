class TouristCompanyRunner{

  public static void main(String [] place){
  
  boolean isPlaceAdded = TouristCompany.addPlaceName("mysoor palace");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addPlaceName("jog falls");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addPlaceName("lalbagh botanical garden");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addPlaceName("cubbon park");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addPlaceName("iskon temple");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addPlaceName("chikkamagaluru");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addPlaceName("nandi hill");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addPlaceName("udupi temple");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addPlaceName("kodagu");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addPlaceName("hampi");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addPlaceName("murdeshwar");
  System.out.println("is place added "+isPlaceAdded);
  
  TouristCompany.showTouristplaceList();
  
  boolean isPlaceUpdated = TouristCompany.updatePlaceName("thirthahalli","kodagu");
  System.out.println("is place updated "+isPlaceUpdated);
  
  TouristCompany.showTouristplaceList();
  
  boolean isPlaceDeleted = TouristCompany.deletePlaceName("hampi");
  System.out.println("is place deleted "+isPlaceDeleted);
  
  TouristCompany.showTouristplaceList();
  }

}