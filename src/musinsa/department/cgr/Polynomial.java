package musinsa.department.cgr;

public class Polynomial {
	private int degree;
	private int [] coef = new int[20];
	
	Polynomial (int[] coef) {
	 this.degree = coef.length - 1; this.coef = coef;
	 }
	Polynomial (int degree) {
	 this.degree = degree;
	 for(int i = 0; i <= degree; i++) this.coef[i] = 0;
	}
	public int getDegree() { return this.degree; }
	public float getCoef(int i) { return this.coef[i]; }
	public void setCoef(int i, int coef) { this.coef[i] = coef; }
	
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
	public Polynomial add(Polynomial aPoly){
		int a=0,b=0,c=0;
		int Ain = 0, Bin = 0, Cin = 0;
		a = this.getDegree();
		b = aPoly.getDegree();
		if(a > b) {
			c = a;
		}else {
			c = b;
		}
		Polynomial C = new Polynomial(c);
		while (Ain <= this.degree && Bin <= aPoly.degree) {
	        if (a > b) {                    
	            C.coef[Cin++] = this.coef[Ain++];            
	            a--;                                
	        }    
	        else if (a == b) {                    
	            C.coef[Cin++] = this.coef[Ain++] + aPoly.coef[Bin++];    
	            a--;   b--;
	        }
	        else {                                        
	            C.coef[Cin++] = aPoly.coef[Bin++];
	            b--;
	        }
	}
		return C;

	}
	}
