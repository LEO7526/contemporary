import java.util.*;

public class Main {
	
	public void anOperation1() {
        AbstractList list = new LinkedList();
        list.add("123");
		list.add("456");
		System.out.println(list);
    }
	
	public void anOperation2() {
	    AbstractList list = new LinkedList();
	    list.add("abc");
		System.out.println(list);
	    list.remove(new String());
    }
	
	public static void main(String args[]) {
		Main m = new Main();
		m.anOperation1();
		m.anOperation2();
	}
}
