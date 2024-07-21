class Amazonn{

   static String fstName;
   static String lstName;
   static String dateOfBirth;
   static String mail;
   static String loginPassword;
   static String confirm;
   static long number;
   
   
  public static boolean createUserAccount(String firstName, String lastName, String dob, String email, String password, String confirmPassword, long contactNumber) {
 
   boolean isAccountCreated = false;
   
   fstName = firstName;
   lstName = lastName;
   dateOfBirth = dob;
   mail = email;
   loginPassword = password;
   confirm = confirmPassword;
   number = contactNumber;
   
   isAccountCreated = true;
   return isAccountCreated;
   }
  
   public static void readUserAccountDetails(){
	
   System.out.println("Details of user is...");
   System.out.println("The first name of the user is: "+ fstName);
   System.out.println("The sur name of user is: " + lstName);
   System.out.println("The date of birth of user is: " + dateOfBirth);
   System.out.println("The email Id of user is: " +mail);
   System.out.println("password  is: " +loginPassword);
   System.out.println("confirm Password is: "+confirm);
   System.out.println("user contact number is :"+ number);
	   
   }
   
   
}