class SocialMedia{
 
   String socialMediaId;
   String socialMediaName;
   long phoneNumber;
   String email;
   
   public SocialMedia(){
   System.out.println("SocialMedia object is created");
  
  }
    public SocialMedia(String socialMediaId,String socialMediaName,long phoneNumber,String email){
    this.socialMediaId= socialMediaId;
	this.socialMediaName = socialMediaName;
	this.phoneNumber = phoneNumber;
	this.email = email;
   }

   public void displayInfo(){
      System.out.println("The socialMedia Id is " + this.socialMediaId);
      System.out.println("The socialMedia Name is " + this.socialMediaName);
      System.out.println("The phone Number is " + this.phoneNumber);
      System.out.println("The email is " + this.email);
   }
}