package musinsa.department.cgr;

public class testPolynomial {
	public static void main(String args[]) {
		int [] a = new int[] {4,3,5,0};
		int [] b = new int[] {3,1,0,1,2};
			Polynomial A = new Polynomial(3,a);
			Polynomial B = new Polynomial(4,b);
			Polynomial C = A.addPoly(B);
			
			
		System.out.printf("A(x)=" + A + "\n");
		System.out.printf("B(x)=" + B);
		System.out.printf("\nC(x)=" + C);
	}

}
