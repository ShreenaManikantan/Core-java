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

}