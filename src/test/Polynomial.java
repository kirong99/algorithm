package test;

public class Polynomial {
	private int degree = 0;
	private int [] coef;

	public Polynomial sub(Polynomial aPoly) {
		return this.add(aPoly.neg());
	}

	public Polynomial neg() {
		int [] c = new int[this.degree + 1];
		for (int i = 0; i <= this.degree; i++) {
			c[i] = 0 - this.coef[i];
		}
		return new Polynomial(c);
	}

	private int resetCoef(int degree) {
		this.coef = new int[degree + 1];
		for(int i = 0; i <= this.degree; i++) {
			this.coef[i] = 0;
		}
		return degree;
	}
	
	public String toString() {
		String buff = "";
		
		for(int i = 0, temp = this.degree; i < this.degree; i++, temp--) {
			if(i != 0) buff += " + ";
			buff += this.coef[i] +"x^" + temp;
		}
		buff += " + " + this.coef[this.degree] + "x^0";
		return buff + "\n";
	}
	
}
