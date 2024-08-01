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
   
  
}