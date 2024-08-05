class DebitCard{
  
  long cardId;
  String cardHolderName;
  int cardNo;
  String expDate;
  int cvv;

  public DebitCard(){
   System.out.println("DebitCard object is created");
   
   }
   
   public DebitCard(long cardId,String cardHolderName,int cardNo,String expDate,int cvv ){
	   
    this.cardId = cardId;
	this.cardHolderName = cardHolderName;
	this.cardNo = cardNo;
	this.expDate = expDate;
	this.cvv =cvv;
   
   }
   public void displayInfo(){
      System.out.println("The card Id is " + this.cardId);
      System.out.println("The card holder Name is " + this.cardHolderName);
	  System.out.println("The card no is " +this.cardNo);
      System.out.println("The expDate  is " + this.expDate);
      System.out.println("The cvv is " + this.cvv);
   } 
  
}