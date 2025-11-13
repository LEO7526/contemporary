import java.util.*;

public class Main4 {
	AbstractListFactory lf = new VectorFactory();
	
	public void anOperation1() {
        AbstractList list = lf.createList();
        list.add("123");
		list.add("456");
		System.out.println(list);
    }
	
	public void anOperation2() {
	    AbstractList list = lf.createList();
	    list.add("abc");
		System.out.println(list);
	    list.remove(new String());
    }
	
	public static void main(String args[]) {
		Main4 m = new Main4();
		m.anOperation1();
		m.anOperation2();
	}
}
