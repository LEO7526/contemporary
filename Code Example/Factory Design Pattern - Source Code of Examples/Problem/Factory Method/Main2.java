import java.util.*;

public class Main2 {
	
	public void anOperation1() {
        AbstractList list = createList();
        list.add("123");
		list.add("456");
		System.out.println(list);
    }
	
	public void anOperation2() {
	    AbstractList list = createList();
	    list.add("abc");
		System.out.println(list);
	    list.remove(new String());
    }
	
	public static void main(String args[]) {
		Main2 m = new Main2();
		m.anOperation1();
		m.anOperation2();
	}
	
	AbstractList createList() {
		return new LinkedList();
	}
}
