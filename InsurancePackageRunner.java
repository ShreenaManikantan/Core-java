class InsurancePackageRunner{

   public static void main(String []insurance){
   
   System.out.println("main started");
   
   String insuranceName ="hdfc life insurance";
   double search =InsurancePackage.search(insuranceName);
   System.out.println("The price of the insurance is" + search);
   
   System.out.println("main started");

   }

}