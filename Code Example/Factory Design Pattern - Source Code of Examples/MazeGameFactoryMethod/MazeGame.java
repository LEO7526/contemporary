/**
* MazeGame with a factory methods.
*/
public class MazeGame {
    public final static int North = 0;
	public final static int South = 1;
	public final static int West = 2;
	public final static int East = 3;
	// factory methods
	public Maze makeMaze() {return new Maze();}
	public Room makeRoom(int n) {return new Room(n);}
	public Wall makeWall() {return new Wall();}
	public Door makeDoor(Room r1, Room r2)
		{return new Door(r1, r2);}

	public Maze createMaze() {
		Maze maze = makeMaze();
		Room r1 = makeRoom(1);
		Room r2 = makeRoom(2);
		Door door = makeDoor(r1, r2);
		maze.addRoom(r1);
		maze.addRoom(r2);
		r1.setSide(MazeGame.North, makeWall());
		r1.setSide(MazeGame.East, door);
		r1.setSide(MazeGame.South, makeWall());
		r1.setSide(MazeGame.West, makeWall());
		r2.setSide(MazeGame.North, makeWall());
		r2.setSide(MazeGame.East, makeWall());
		r2.setSide(MazeGame.South, makeWall());
		r2.setSide(MazeGame.West, door);
		return maze;
	}

    public static void main(String args[]) {
	    MazeGame mg = new MazeGame();
		Maze maze = mg.createMaze();
		System.out.println(maze);
    }

}