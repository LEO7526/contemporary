public class Room extends MapSite {
  private int roomNo;
  private MapSite northSide, southSide, eastSide, westSide;

  public Room(int n) {
    roomNo = n;
  }

  public void enter() {  }
  public void setSide(int side, MapSite site) {
    switch (side) {
      case MazeGame.North:
        northSide = site;
        break;
      case MazeGame.South:
        southSide = site;
        break;
      case MazeGame.West:
        westSide = site;
        break;
      case MazeGame.East:
        eastSide = site;
        break;
    }
  }

  public MapSite getSide(int side) {
    switch (side) {
      case MazeGame.North:
        return northSide;
      case MazeGame.South:
        return southSide;
      case MazeGame.West:
        return westSide;
      case MazeGame.East:
        return eastSide;
      default:
        return null;
    }
  }

  public String toString() {
    return "Room " + roomNo + ": North = " + northSide.toString() + ", South = " + southSide.toString() +
	", East = " + eastSide.toString() + ", West = " + westSide.toString();
  }
}