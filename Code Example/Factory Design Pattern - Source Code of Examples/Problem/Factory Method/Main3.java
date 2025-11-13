import java.util.*;

public class Main3 extends Main2 {
	
	public static void main(String args[]) {
		Main3 m = new Main3();
		m.anOperation1();
		m.anOperation2();
	}
	
	AbstractList createList() {
		System.out.println("Create Vector");
		return new Vector();
	}
}
