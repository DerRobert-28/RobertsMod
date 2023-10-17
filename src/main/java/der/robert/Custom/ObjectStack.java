package der.robert.Custom;
//
//	JAVA
//
import java.util.LinkedList;


public final class ObjectStack {

	private LinkedList<Object> stack = new LinkedList();

	public void push(Object obj) {
		this.stack.addLast(obj);
	}

	public void push(Object obj1, Object obj2) {
		this.stack.addLast(obj1);
		this.stack.addLast(obj2);
	}

	public void push(Object obj1, Object obj2, Object obj3) {
		this.stack.addLast(obj1);
		this.stack.addLast(obj2);
		this.stack.addLast(obj3);
	}

	public Object peek() {
		return this.stack.getLast();
	}

	public Object pop() {
		return this.stack.removeLast();
	}

}
