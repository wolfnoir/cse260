//everett yang 111756324
import java.util.ArrayList;
public class LargestInArrayList {
	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E max = list.get(0); //gets 0, compares to the next number, if bigger, replaces it, so on and so forth
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i).compareTo(max) > 0) {
				max = list.get(i);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			a.add((int)(Math.random()*10)); //add random integer numbers to the array
		System.out.println(a);
		System.out.println(max(a));
	}

}
