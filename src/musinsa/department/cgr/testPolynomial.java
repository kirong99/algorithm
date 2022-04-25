package musinsa.department.cgr;

public class testPolynomial {
	public static void main(String args[]) {
		int [] a = new int[] {3, 7 , 10 , 4, -5 ,0};
		int [] b = new int[] {1, 1, 1, 1};
			Polynomial A = new Polynomial(a);
			Polynomial B = new Polynomial(b);
			Polynomial C = A.add(B);
			
			
			Polynomial f1 = new Polynomial(a);
			Polynomial f2 = new Polynomial(b);
			Polynomial f3 = new Polynomial(2);
			
			System.out.printf("f1(x) = " + f1);
			System.out.printf("f2(x) = " + f2);
			f2 = f2.neg();
			System.out.printf("f2(x) = " + f2);
			System.out.printf("f3(x) = " + f3);

			System.out.printf("f1(x) + f2(x)  = " + f1.add(f2));
			System.out.printf("f2(x) - f1(x)  = " + f2.sub(f1));
			System.out.printf("f2(x) + -f1(x) = " + f2.add(f1.neg()));
	}

}
