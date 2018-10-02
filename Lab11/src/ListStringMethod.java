//everett yang 111756324

import java.util.*;

public class ListStringMethod {
	static void ListStringMethod (List<String> strings) {
		for(ListIterator<String> iterator = strings.listIterator();
				iterator.hasNext();) {
			iterator.set(iterator.next().trim());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("apple", "banana", "cherry");
		ListStringMethod(list);
		for(String s : list) {
			System.out.printf("\"%s\"%n", s); //regular print doesnt work? ask why
		}
	}

}
