public class EnchantedMazeFactory extends MazeFactory {
	public Room makeRoom(int n) {return new EnchantedRoom(n);}
	public Wall makeWall() {return new EnchantedWall();}
	public Door makeDoor(Room r1, Room r2)
	{return new EnchantedDoor(r1, r2);}
}