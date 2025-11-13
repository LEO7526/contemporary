import java.util.*;

public class VectorFactory implements AbstractListFactory {
	public AbstractList createList() {
		System.out.println("create vector");
		return new Vector();
	}
}