import java.lang.Math;
public class Fraction {
	public static int sharkie() {
		FractionTester numerator1 = new FractionTester();
		int x1 = FractionTester.sharks(); 
		return x1;
	}

	public static int skarkie2() {
		FractionTester denominator1 = new FractionTester();
		int y1 = FractionTester.sharks1();
		return y1;
	}
	public static int sharkie3() {
		FractionTester numerator2 = new FractionTester();
		int x2 = FractionTester.sharks2();
		return x2;
	}
	
	public static int sharkie4() {
		FractionTester denominator2 = new FractionTester();
		int y2 = FractionTester.sharks3();
		return y2;
	}
	public static int nummult() {
		int n1 = Fraction.sharkie();
		int n2 = Fraction.sharkie3();
		int numtimes = n1 * n2;
		return numtimes;
	}
	public static int denmult() {
		int d1 = Fraction.skarkie2();
		int d2 = Fraction.sharkie4();
		int dentimes = d1 * d2;
		return dentimes;
}
}
			
		

