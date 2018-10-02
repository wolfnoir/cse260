import java.util.Arrays;

//everett yang 111756324

public class GenericStackWithArray<E> {
	
	private int capacity = 100, size;
	private E[] array = (E[])new Object[capacity];
	
	public GenericStackWithArray() {	
	}
	
	public int getSize() {
		return size;
	}
	
	public E peek() {
		if(size == 0) {
			return null;
		}
		else {
			return array[size-1];
		}
	}
	
	public void push(E obj) {
		array[size++] = obj;
		if (size == capacity) {
			capacity = capacity*2;
			E[] temp = (E[])new Object[capacity];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}
	}
	
	public E pop() {
		if (size == 0)
			return null;
		else
			return array[--size];
		}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "stack: " + Arrays.toString(array);
		}
}
