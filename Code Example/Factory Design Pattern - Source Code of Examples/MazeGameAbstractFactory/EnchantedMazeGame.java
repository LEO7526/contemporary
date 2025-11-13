public class EnchantedMazeGame extends MazeGame {

	{return new EnchantedDoor(r1, r2);}
    public static void main(String args[]) {
	    MazeFactory factory = new EnchantedMazeFactory();
	    EnchantedMazeGame mg = new EnchantedMazeGame();
		Maze maze = mg.createMaze(factory);
		System.out.println(maze);
    }
}