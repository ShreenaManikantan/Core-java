class Bank{

   int bankId ;
   String bankName ;
   String branchName;
   String ifscCode;
   String swiftCode;
   int numberOfWorkers;
   String branchManagerName;
   
   public Bank(){
   
   System.out.println("Bank object is created");
  
  }
    public Bank( int bankId,String bankName,String branchName,String ifscCode,String swiftCode,int numberOfWorkers,String branchManagerName){
    this.bankId= bankId;
    this.bankName = bankName;
    this.branchName = branchName;
    this.ifscCode = ifscCode;
    this.swiftCode= swiftCode;
	this.numberOfWorkers = numberOfWorkers;
	this.branchManagerName = branchManagerName;
   }
     
  public void displayInfo(){
   System.out.println("The bank id is "+bankId);
   System.out.println("The bank Name is "+bankName);
   System.out.println("The branch Name is "+branchName);
   System.out.println("The ifsc Code is "+ifscCode);
   System.out.println("The swift Code is "+swiftCode);
   System.out.println("The number of Workers is "+numberOfWorkers);
   System.out.println("The branch Manager name is "+branchManagerName);
   }
}   
   