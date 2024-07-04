class Subtraction{

   public static void main(String [] Subt){
   System.out.println("main started");
   // invoking a sbtract method by passing 2 arguments
   subtract(100,45);
   subtract(150,75);
   
   System.out.println("main ended");
   }
    
	//  method declaring 
	public static void subtract(int num1,int num2){
	System.out.println("Subtract method started");
	System.out.println(num1-num2);
	System.out.println("Subtract method ended");
	return;
	}
}