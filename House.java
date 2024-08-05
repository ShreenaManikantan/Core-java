class House{
  
   int houseId;
   int noOfRooms;
   int noOfFlors;
   int noOfMembers;
   String houseName;
 
   public House(){
   System.out.println("House object is created");
   
   }
   
   public House(int houseId,int noOfRooms,int noOfFlors,int noOfMembers,String houseName){
	   
    this.houseId = houseId;
	this.noOfRooms = noOfRooms;
	this.noOfFlors = noOfFlors;
	this.noOfMembers = noOfMembers;
	this.houseName =houseName;
   
   }
   
  public void displayInfo(){
   System.out.println("The house id is "+houseId);
   System.out.println("The number of rooms is "+noOfRooms);
   System.out.println("The number of Flors is "+noOfFlors);
   System.out.println("The number of Members is "+noOfMembers);
   System.out.println("The house name is "+houseName);
   }
   
}