class DrivingLicence{

   static String applName;
   static String fathName;
   static String dob;
   static String gend;
   static String stat;
   static String ceta;
   static String adrs;
   static String cont;
   static String cap;
   
   public static boolean createUserLicence(String applicantName, String fatherName, String dateOfBirth, String gender, String state, String category, String address, String country, String captcha) {

   boolean isLicenceApplied = false;
    applName = applicantName;
    fathName = fatherName;
    dob = dateOfBirth;
    gend = gender;
    stat = state;
    ceta = category;
    adrs = address;
    cont =country;
    cap = captcha;
   
    isLicenceApplied = true;
   return isLicenceApplied;
   }
  
   public static void readUserLicenceDetails(){
	
   System.out.println("Details of user is...");
   System.out.println("The name of user is: " +applName );
   System.out.println("The father name of user  is: " + fathName);
   System.out.println("The date of birth of the user is: "+ dob );
   System.out.println("The gender of user is: " + gend);
   System.out.println("The state of user is: " +stat );
   System.out.println("The cetagary of user is: " + ceta);
   System.out.println("The adress is : " + adrs);
   System.out.println("The country is: " + cont);
   System.out.println("captcha is: " +cap);
	   
   }
   
   
}
   
   
