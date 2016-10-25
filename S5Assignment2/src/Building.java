public class Building {
	private int noOfFloors;	
	private int noOfRooms;	
	private int noOfBathrooms;	
	private String buildingName;			
	Building(Building bd){ 		
	noOfFloors = bd.noOfFloors;		
	noOfRooms = bd.noOfRooms;		
	noOfBathrooms = bd.noOfBathrooms;		
	buildingName = bd.buildingName;
	}
	Building(){		
	noOfFloors = -1;		
	noOfRooms = -1;		
	noOfBathrooms = -1;		
	buildingName = "";	
	}		
	Building(int noOfFloors, int noOfRooms, int noOfBathrooms, String buildingName){		
	this.noOfFloors = noOfFloors;		
	this.noOfRooms = noOfRooms;		
	this.noOfBathrooms = noOfBathrooms;		
	this.buildingName = buildingName;	
	}		
	void showDetails(String bdnm){		
	System.out.println("Following are the details of "+  bdnm +": ");		
	System.out.println("Number of Floors: " + noOfFloors);		
	System.out.println("Number of Rooms: " + noOfRooms);		
	System.out.println("Number of Bathrooms: " + noOfBathrooms);		
	System.out.println("Name of the Building: " + buildingName);			
	}
}
