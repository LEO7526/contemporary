public class EnchantedRoom extends Room {
  public EnchantedRoom(int roomNo) {
    super(roomNo);
  }
  
  public String toString() {
    return "Enchanted " + super.toString(); 
  }
}