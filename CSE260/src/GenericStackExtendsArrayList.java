//everett yang 111756324

import java.util.ArrayList;
import java.util.*;

public class GenericStackExtendsArrayList<E> extends ArrayList {
	private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
	public int getSize() {
		return list.size();
	}
	public E peek() {
		if(this.getSize() > 0)
			return list.get(getSize() - 1);
		else
			return null;
	}
	public void push(E o) {
		list.add(o);
	}
	public E pop() {
		if(this.getSize() > 0) {
			E o = list.remove(getSize() - 1);
			return o;
		}
		else
			return null;
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	@Override // Java annotation: also used at compile time to
	public String toString() { // detect override errors
		return "stack: " + list.toString();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GenericStackExtendsArrayList<String> stack = new GenericStackExtendsArrayList<>(); //make a new generic stack for strings
		System.out.println("Enter five strings: ");
		for(int i = 1; i <=5 ; i++) {
			stack.push(input.next());
		}
		while (!stack.isEmpty()) //returns and empties the string
			System.out.print(stack.pop() + " ");
		System.out.println();
	}
}