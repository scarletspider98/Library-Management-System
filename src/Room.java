public class Room {
 
	public static Room[] rooms = new Room[6];
	public String name;
	public int avail;
	
	public static void init_rooms() {
		for(int i = 0; i < rooms.length; i++) {
			rooms [i] = new Room("Room " + (i + 1), random_num());
		}
	}

	public static int random_num() {
		double random = java.lang.Math.random();
		if(random > 0.5d) {
			//return 1;
			
			System.out.println("Available room");
		}
		//return 0;
		System.out.println("Unavailable room");
		
	}
	
	public Room(String name, int avail){
		this.name = name;
		this.avail = avail;
		
	}
	
	

	public String toString() {
		return this.name + " " + this.avail;
	}
}
