public class Door extends MapSite {
  private boolean _isOpen;
  private Room r1, r2;

  public Door(Room r1, Room r2) {
	this.r1 = r1;
	this.r2 = r2;
  }

  public void enter() { }
  public boolean isOpen() { return _isOpen; }

  public String toString() { return "Door"; }
}