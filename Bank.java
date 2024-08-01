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
   
}