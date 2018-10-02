//everett yang 111756324
public class BinarySearch {
	
	public static<E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (high - low) / 2 + low;
			if (list[mid].compareTo(key) == 0) //if the key is the position of the middle
				return mid;
			if (list[mid].compareTo(key) < 0) //if key is higher
				low = mid + 1;
			else //if key is lower
				high = mid - 1;
			}
		return -1;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intList = new Integer[10];
		for(int i = 0; i < intList.length; i++) {
			intList[i] = i;
		}
		
		System.out.println(binarySearch(intList, 2));
		System.out.println(binarySearch(intList, -4));
		System.out.println(binarySearch(intList, 8));
		System.out.println(binarySearch(intList, 304928));
	}

}
