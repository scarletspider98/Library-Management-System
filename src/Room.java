public class Room {
 
	public static Room[] rooms = new Room[6];
	public String name;
	public int avail;
	
	public static void init_rooms() {
		for(int i = 0; i < rooms.length; i++) {
			rooms [i] = new Room("Room " + i, (int)(java.lang.Math.random()*1));
		}
	}

	public Room(String name, int avail){
		this.name = name;
		this.avail = avail;
		
	}
	
	public String toString() {
		return this.name + " " + this.avail;
	}
}
