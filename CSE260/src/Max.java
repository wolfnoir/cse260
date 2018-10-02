import java.util.ArrayList;

//everett yang 111756324
public class Max {
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for(int i = 1; i < list.length; i++) {
			E element = list[i];
			if(element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer list[] = new Integer[10];
		for (int i = 0; i < 10; i++) {
			list[i] = ((int)(Math.random()*10)); //add random integer numbers to the array
			System.out.print(list[i] + " ");
		}
		System.out.println();
		System.out.println(max(list));
	}

}
