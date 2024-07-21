class BankAccount{

   static String fstName;
   static String lstName;
   static String dateOfBirth;
   static int age;
   static String adrs;
   static String fatName;
   static long num;
   
   
  public static boolean createUserAccount(String firstName, String lastName, String dob, int ageOfUser, String adress, String fatherName, long contactNumber) {
 
   boolean isAccountCreated = false;
   
   fstName = firstName;
   lstName = lastName;
   dateOfBirth = dob;
   age = ageOfUser;
   adrs = adress;
   fatName = fatherName;
   num = contactNumber;
   
   isAccountCreated = true;
   return isAccountCreated;
   }
  
   public static void readUserAccountDetails(){
	
   System.out.println("Details of user is...");
   System.out.println("The first name of the user is: "+ fstName);
   System.out.println("The sur name of user is: " + lstName);
   System.out.println("The date of birth of user is: " + dateOfBirth);
   System.out.println("The age of user is: " +age);
   System.out.println("adress of user: " +adrs);
   System.out.println("fatherNameof user is: "+fatName);
   System.out.println("user contact number is :"+ num);
	   
   }
   
   
}