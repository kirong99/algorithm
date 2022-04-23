package musinsa.department.cgr;

public class Polynomial {
	private int degree;
	private int [] coef;
	
	Polynomial (int degree, int[] coef) {
	 this.degree = degree; this.coef = coef;
	 }
	Polynomial (int degree) {
	 this.degree = degree;
	 for(int i = 0; i <= degree; i++) this.coef[i] = 0;
	}
	public int getDegree() { return this.degree; }
	public float getCoef(int i) { return this.coef[i]; }
	public void setCoef(int i, int coef) { this.coef[i] = coef; }
	public String toString() {
		String myResult="";
		int temp = this.degree;
		for(int i = 0; i<=this.degree; i++) {
			myResult = myResult + String.format("%3.0fx^%d",this.coef[i],temp--);
		}
		return myResult;
	}
	public Polynomial addPoly(Polynomial aPoly){
		int a=0,b=0,c=0;
		int Ain = 0, Bin = 0, Cin = 0;
		a = A.getDegree();
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
