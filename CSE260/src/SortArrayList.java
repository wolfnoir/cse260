//everett yang 111756324
import java.util.ArrayList;
public class SortArrayList {

	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		for(int i = 0; i < list.size() - 1; i++) { //while i is less than list size minus 1
			E currentMin = list.get(i); //sets the currentmin as whatever value position i is
			int min = i; //sets min as i
			for (int j = i + 1; j < list.size(); j++){
				if (list.get(j).compareTo(currentMin) < 0){
					currentMin = list.get(j);
					min = j;
					}
			}
			if(min != 1) {
				/*if min isn't equal to 1, switch the original position of the min with i*/
				list.set(min, list.get(i));
				list.set(i, currentMin);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			a.add((int)(Math.random()*10)); //add random integer numbers to the array
		System.out.println("Unsorted Array: " + a);
		sort(a);
		System.out.println("Sorted Array: " + a);
	}

}
