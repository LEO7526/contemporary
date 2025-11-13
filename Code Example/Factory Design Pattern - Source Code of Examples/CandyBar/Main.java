public class Main {

  public static void main(String[] arg) {
    CandyBar cb = new KitKat();
    CandyBarBin cbin = new CandyBarBin(cb);
	cbin.restock();
	cbin.restock();
	cbin.restock();
	System.out.println(cbin);
  }

}