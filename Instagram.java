class Instagram{

   static long num;
   static String mail;
   static String name;
   static String dob;
   static String pass;
   static String confirm;
   
   
  public static boolean createUserAccount(long contactNumber, String email, String userName, String dateOfBirth, String password, String confirmPassword) {
 
   boolean isAccountCreated = false;
   
   num = contactNumber;
   mail = email;
   name = userName;
   dob = dateOfBirth;
   pass = password;
   confirm = confirmPassword;
   
   isAccountCreated = true;
   return isAccountCreated;
   }
  
   public static void readUserAccountDetails(){
	
   System.out.println("Details of user is...");
   System.out.println("The contact number of the user is: "+ num);
   System.out.println("The email id of user is: " + mail);
   System.out.println("The user name is: " + name);
   System.out.println("The date of birth user is: " +dob);
   System.out.println("password is: " +pass);
   System.out.println("confirm Password is: "+confirm);
	   
   }
   
   
}