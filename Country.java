class Country{

   String countryName;
   String countryId;
   int noOfStates;
   String primeMinister;
   String population;
   
   public Country(){
   
   System.out.println("Country object is created");
  
  }
  public Country(String countryName,String countryId,int noOfStates,String primeMinister,String population){
  this.countryName = countryName;
  this.countryId = countryId;
  this.noOfStates = noOfStates;
  this.primeMinister =  primeMinister;
  this.population = population;
  
  }
  public void displayInfo(){
   System.out.println("The country Name is "+countryName);
   System.out.println("The country Id is "+countryId);
   System.out.println("The no of States is "+noOfStates);
   System.out.println("The prime Minister is "+primeMinister);
   System.out.println("The population is "+population);
   }
  
}