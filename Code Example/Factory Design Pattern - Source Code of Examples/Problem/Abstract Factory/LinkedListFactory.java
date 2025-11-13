import java.util.*;

public class LinkedListFactory implements AbstractListFactory {
	public AbstractList createList() {
		System.out.println("create linked list");
		return new LinkedList();
	}
}