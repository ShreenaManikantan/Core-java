class LoanApplicationRunner{

    public static void main(String[]loan){
		
		
		boolean isLoanApplied=LoanApplication.createLoanAccount(null,"Personal","shalini","State Bank of India","5.5","5 years");
		if(isLoanApplied == true)
		LoanApplication.readLoanAccount();
		
	}
}