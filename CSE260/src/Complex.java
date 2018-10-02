//everett yang, SBU ID 111756324
import java.util.*;

public class Complex {
	double a, b;
	
	public Complex(double a, double b) { //instanciate complex numbers
		this.a = a;
		this.b = b;
	}
	
	public Complex() {
		this.a = 0;
		this.b = 0;
	}
	
	public Complex(double a) {
		this.a = a;
		this.b = 0;
	}
	
	public double getRealPart() { //get real part of complex num
		return a;
	}
	
	public double getImaginaryPart() { //get imaginary part of complex num
		return b;
	}
	
	@Override
	public String toString() { //to string
		if(b == 0) 
			return "" + a;
		else
			return "(" + a + " + " + b + "i)";
	}
	
	public static String add(Complex num1, Complex num2) {
		double newReal = num1.getRealPart() + num2.getRealPart();
		double newImaginary = num1.getImaginaryPart() + num2.getImaginaryPart();
		Complex newNumber = new Complex(newReal, newImaginary);
		return newNumber.toString();
	}
	
	public static String subtract(Complex num1, Complex num2) {
		double newReal = num1.getRealPart() - num2.getRealPart();
		double newImaginary = num1.getImaginaryPart() - num2.getImaginaryPart();
		Complex newNumber = new Complex(newReal, newImaginary);
		return newNumber.toString();
	}
	
	public static String multiply(Complex num1, Complex num2) {
		double newReal = (num1.getRealPart()*num2.getRealPart())
				- (num2.getImaginaryPart()*num2.getImaginaryPart());
		double newImaginary = (num1.getImaginaryPart()*num2.getRealPart())
				+ (num1.getRealPart()*num2.getImaginaryPart());
		Complex newNumber = new Complex(newReal, newImaginary);
		return newNumber.toString();
	}
	
	public static String divide(Complex num1, Complex num2) {
		double newReal = (num1.getRealPart()*num1.getRealPart() + num1.getImaginaryPart()*num2.getImaginaryPart())
				/(num2.getRealPart()*2 + num2.getImaginaryPart()*2);
		double newImaginary = (num1.getImaginaryPart()*num2.getRealPart() - num1.getRealPart()*num2.getImaginaryPart())
				/(num2.getRealPart()*2 + num2.getImaginaryPart()*2);
		Complex newNumber = new Complex(newReal, newImaginary);
		return newNumber.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a test program TestComplex.java that prompts the user to enter two complex numbers and 
		displays the result of their addition, subtraction, multiplication, and division.*/
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the real part of the number. ");
		double a = input.nextDouble();
		System.out.println("Please input the imaginary part of the number. ");
		double b = input.nextDouble();
		Complex num1 = new Complex(a, b);
		System.out.println("Complex Number created. Please input the real part of the number. ");
		double c = input.nextDouble();
		System.out.println("Please input the imaginary part of the number. ");
		double d = input.nextDouble();
		Complex num2 = new Complex(c, d);
		System.out.println("Complex number created.\n"
				+ "ADDITION: " + add(num1, num2)
				+"\nSUBTRACTION: " + subtract(num1, num2)
				+"\nMULTIPLICATION: " + multiply(num1, num2)
				+"\nDIVISION: " + divide(num1, num2));
		input.close();
	}

}
