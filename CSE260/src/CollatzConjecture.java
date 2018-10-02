//everett yang, 111756324

import java.util.*;

/*• If the number is even, divide it by two.
• If the number is odd, triple it and add one.
The Collatz conjecture is: the above process will eventually reach the number 1, regardless of which
positive integer is chosen initially. In this problem, you must implement the method
public static int howManyCollatzIterations(int n)
which returns the number of iterations that were performed before reaching 1.
Sample runs of the program are given below.
howManyCollatzIterations(10)
Number of iterations returned by the method is: 6
Sequence: 10 5 16 8 4 2 1

howManyCollatzIterations(100)
Number of iterations returned by the method is: 25
Sequence: 100 50 25 76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1

howManyCollatzIterations(53)
Number of iterations returned by the method is: 11
Sequence: 53 160 80 40 20 10 5 16 8 4 2 1*/

public class CollatzConjecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Sequence: ");
		System.out.println("\nNumber of iterations returned by the method is: " + howManyCollatzIterations(53));
	}
	
	public static int howManyCollatzIterations(int n) {
		System.out.print(n + " ");
		if(n == 1) {
			return 0;
		}
		else {
			if(n%2 == 0) { //if the number is even
				return 1 + howManyCollatzIterations(n/2);
			}
			else {
				return 1 + howManyCollatzIterations(n*3 + 1);
			}
		}
	}

}
