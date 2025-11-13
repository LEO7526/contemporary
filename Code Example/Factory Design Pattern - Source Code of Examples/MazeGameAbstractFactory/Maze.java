import java.util.*;

public class Maze {
  Vector rooms;

  public Maze() {
    rooms = new Vector();
  }

  public void addRoom(Room room) {
    rooms.add(room);
  }
  
  public String toString() {
    StringBuffer sf = new StringBuffer();
    for (int i = 0; i < rooms.size(); i++) {
	  sf.append(rooms.elementAt(i).toString()+"\n");
	}
	return sf.toString();
  }
}