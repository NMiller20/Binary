import java.util.Scanner;

public class Methods{
	
	public static boolean isDivisible( int n, int m) { // Here, n > m
		return n % m == 0;
		}
	
	public static boolean isTriangle( int a, int b, int c ) {
		return (a + b > c) && (a + c > b) && (b + c > a);
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Exercise 2: ");
		
		System.out.println("Give me a number, n: ");
		int n = in.nextInt();
		System.out.println("Give me a smaller number, m: ");
		int m = in.nextInt();
		
		System.out.println( isDivisible(n, m) );
		
		System.out.println("\nExercise 3: \nGive me three numbers: \na:");
		int a = in.nextInt();
		System.out.println("b:");
		int b = in.nextInt();
		System.out.println("c:");
		int c = in.nextInt();
		
		System.out.println( isTriangle(a, b, c) );

		
		
		
	}
	
}