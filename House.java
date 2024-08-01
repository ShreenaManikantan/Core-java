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
   
}