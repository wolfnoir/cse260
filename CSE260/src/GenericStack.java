public class GenericStack<E> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
	public int getSize() {
		return list.size();
	}
	public E peek() {
		return list.get(getSize() - 1);
	}
	public void push(E o) {
		list.add(o);
	}
	public E pop() {
		E o = list.remove(getSize() - 1);
		return o;
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	@Override // Java annotation: also used at compile time to
	public String toString() { // detect override errors
		return "stack: " + list.toString();
	}
}