//everett yang 111756324

import java.util.Comparator;

public class SelectionSortWithComparator {
	public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
		for (int i = 0; i < list.length - 1; i++) {
			E min = list[i];
			int minIndex = i;
			for (int j = i+1; j<list.length; j++) {
				if (comparator.compare(min,  list[j]) > 0) {
					min = list[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				list[minIndex] = list[i];
				list[i] = min;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[5];
		a[0] = "Big Bird";
		a[1] = "Elmo";
		a[2] = "Grover";
		a[3] = "Bert";
		a[4] = "Ernie";
		selectionSort(a, new StringComparator());
		for(String s:a){
			System.out.print(s + ", ");
		}
	}
}
