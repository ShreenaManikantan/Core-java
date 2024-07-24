class TeaPointRunner{

  public static void main(String[] teapoint){
 
    boolean teaAdded = TeaPoint.addTeaName("Amruth tea");
	System.out.println("is tea name added" + teaAdded);
	
	 teaAdded = TeaPoint.addTeaName("green tea");
	System.out.println("is tea name added" + teaAdded);
	
	 teaAdded = TeaPoint.addTeaName("ginger tea");
	System.out.println("is tea name added" + teaAdded);
	
	 teaAdded = TeaPoint.addTeaName("masala tea");
	System.out.println("is tea name added" + teaAdded);
	
	teaAdded = TeaPoint.addTeaName("irani tea");
	System.out.println("is tea name added" + teaAdded);
	
	 teaAdded = TeaPoint.addTeaName("chocolate tea");
	System.out.println("is tea name added" + teaAdded);
	
	teaAdded = TeaPoint.addTeaName("clasic tea");
	System.out.println("is tea name added" + teaAdded);
	
	
	TeaPoint.showTeaName();
	
   }

}