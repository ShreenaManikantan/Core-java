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
   
 
}