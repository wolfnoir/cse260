//everett yang 111756324
public class ComplexMatrix extends GenericMatrix {
	
	@Override
	protected Object add(Object o1, Object o2) { //i don't know how to do this
		// TODO Auto-generated method stub
		return add(o1, o2);
	}

	@Override
	protected Object multiply(Object o1, Object o2) { //i don't know how to do this either
		// TODO Auto-generated method stub
		return multiply(o1, o2);
	}

	@Override
	protected Number zero() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) { //making two complex matrices and testing out addition/multiplication
		// TODO Auto-generated method stub
		Complex[][] m1 = new Complex[3][3];
		Complex[][] m2 = new Complex[3][3];
		for (int i = 0; i < m1.length; i++)
			for (int j = 0; j < m1[0].length; j++){
				m1[i][j] = new Complex(i, j + 3);
				m2[i][j] = new Complex(i, j + 5);
				}
		ComplexMatrix complexMatrix = new ComplexMatrix();
		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, complexMatrix.addMatrix(m1, m2), '+');
		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult(m1, m2, complexMatrix.multiplyMatrix(m1, m2), '*');
	}

}
