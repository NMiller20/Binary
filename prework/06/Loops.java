
import java.util.Scanner;

public class Loops {
	
	public static double exponentiate(double b, int n) {
		double result = 1;
		while (n > 0) {
			result = result * b;
			n--;
		}
		return result;
	}
	
	public static int factorial(int n) {
		int result = 1;
		int i;
		for (i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static double myexpTerms(double x, int n) {
		
		if (n == 0) {
			return 1;
		}
		else {
			double lastTerm = myexpTerms(x, n-1);
			double currentTerm = lastTerm * x / n;
			return currentTerm; 	
		}	
	}
	public static double myexp(double x, int n) {
		
		if (n == 0) {
			return 1;
		}
		else {
			return myexp(x, n-1) + myexpTerms(x, n);	
		}
	}
	
	public static String check(double x) {
		int powerOfX = 18;
		String line = "x = " + x + "   " + myexp(x, powerOfX - 1) + "   " + Math.exp(x); 
		return line;
	}
	
	public static void main(String[] args){
		// Scanner in = new Scanner(System.in);
		
		// System.out.print("Exercise 3: \nType a base, b: ");
		// double b = in.nextDouble();
		// System.out.print("Type an integer power, n: ");
		// int n = in.nextInt();
		
		// System.out.println("b to the nth power: " + exponentiate(b, n) );
		
		// System.out.print("Exercise 4: \nType an integer, a: ");
		// int a = in.nextInt();
		// System.out.println("a factorial: " + factorial(a) );
		
		// System.out.print("Excercise 5.2: \nType a number, x: ");
		// double x = in.nextDouble();
		// System.out.print("Type an integer, n: ");
		// int n = in.nextInt();
		// System.out.println("Approximation of e to the x using the first n terms of the Maclaurin series: " + myexp(x, n-1) ); // the -1 is to correct for the fact that, in these methods, n represents the power of x, not the number of terms
		
		System.out.println("Exercise 5.3: \n" + check(1.0) ); 
		// The 17 term approximation is the last time that the accuracy of Math.exp(x) exceeds that of my program.
		
		System.out.println("Exercise 5.4: "); 
		int i;
		for (i = -1; i <= 2; i++) {
			System.out.println( check(Math.pow(10, i) ) ); 
		}
		
		System.out.println("Exercise 5.5: "); 
		for (i = -1; i <= 2; i++) {
			System.out.println( check(0 - Math.pow(10, i) ) ); 
		}
		
		System.out.println("For both exercises, it seems like things become really inaccurate as i gets bigger."); 
		
		
		
		
	}
}