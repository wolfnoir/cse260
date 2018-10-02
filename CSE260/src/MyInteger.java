//everett yang, SBU ID 111756324
public class MyInteger {
/*1. (MyInteger.java class) Implement a public class named MyInteger. The class contains:
- A static method parseInt(String) that converts a string to an int value. Implement the method
without using Integer.parseInt(x).*/
	protected int value;
	
	public MyInteger(int n) {
		this.value = n;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		if(value%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOdd() {
		if(value%2!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isPrime() {
		if(value <= 1) {
			return false;
		}
		else if(value <= 3) {
			return true;
		}
		else if(value%2 == 0 || value%3 == 0) {
			return false;
		}
		int i = 5;
		while(i*i <= value) {
			if(value%i == 0 || value%(i+2) == 0) {
				return false;
			}
			i = i+6;
		}
		return true;
	}
	
	public static boolean isEven(int n) {
		if(n%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isOdd(int n) {
		if(n%2!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		else if(n <= 3) {
			return true;
		}
		else if(n%2 == 0 || n%3 == 0) {
			return false;
		}
		int i = 5;
		while(i*i <= n) {
			if(n%i == 0 || n%(i+2) == 0) {
				return false;
			}
			i = i+6;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger n) {
		return n.isEven();
	}
	
	public static boolean isOdd(MyInteger n) {
		return n.isOdd();
	}
	
	public static boolean isPrime(MyInteger n) {
		return n.isPrime();
	}
	
	public boolean equals(int n) {
		if(value == n)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger n) {
		if(value == n.getValue())
			return true;
		else
			return false;
	}
	
	public static int parseInt(String s) {
		int number = 0;      
	    number = number* 10 + s.charAt(0)-'0';
	    for (int i = 1; i < s.length(); i++) {
	        number = number*10 + s.charAt(i)-'0';           
	    }
	    return number;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger n = new MyInteger(20);
		System.out.println("Is Even?: " + n.isEven());
		System.out.println("Is Prime?: " + n.isPrime());
		System.out.println("Is 17 Prime?: " + isPrime(17));
		System.out.println("Is n Prime?: " + isPrime(n));
		System.out.println("Does n equal 20?: " + n.equals(20));
		System.out.println(parseInt("420"));
	}

}
