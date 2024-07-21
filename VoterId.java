class VoterId{

   static String fulName;
   static String dob;
   static String gend;
   static String stat;
   static String ceta;
   static String adrs;
   static String cont;

  
   public static boolean createUserVoterid(String fullName, String dateOfBirth, String gender, String state, String category, String address, String country)
   {

    boolean isVoteridApplied = false;
    fulName = fullName;
    dob = dateOfBirth;
    gend = gender;
    stat = state;
    ceta = category;
    adrs = address;
    cont =country;
   
    isVoteridApplied = true;
   return isVoteridApplied;
   }
  
   public static void readUserVoteridDetails(){
	
   System.out.println("Details of user is...");
   System.out.println("The name of user is: " +fulName );
   System.out.println("The date of birth of the user is: "+ dob);
   System.out.println("The gender of user is: " + gend);
   System.out.println("The state of user is: " +stat );
   System.out.println("The cetagary of user is: " + ceta);
   System.out.println("The adress is : " + adrs);
   System.out.println("The country is: " + cont);
	   
   }
      
}
