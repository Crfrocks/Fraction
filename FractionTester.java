import java.util.Scanner;
public class FractionTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please state your fraction with a space inbetween");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int den1 = scan.nextInt();
		int den2 = scan.nextInt();
		
	}
	public static int sharks() {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		return num1;
	}
	public static int sharks1() {
		Scanner scanner = new Scanner(System.in);
		int den1 = scanner.nextInt();
		return den1;


}
	public static int sharks2(){
		Scanner scanner = new Scanner(System.in);
		int num2 = scanner.nextInt();
		return num2;
	}
	public static int sharks3() {
		Scanner scanner = new Scanner(System.in);
		int den2 = scanner.nextInt();
		return den2;
	}
	public static void main1(String[] args) {
		System.out.println(Fraction.denmult());
	}
}

