
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
	public static void main(String[] args){
		Random generator = new Random(); // creates a random number generator
		int actualValue = generator.nextInt(100) + 1;  // this generator creates a random number, which is (initially) between 0 and 99.
		
		System.out.println("Let's play Guess My Number. I'm thinking of a number between 1 and 100. Can you guess it? \nYour guess: ");
		
		Scanner in = new Scanner(System.in);
		int userGuess = in.nextInt();
		
		System.out.println("Your guess was: " + userGuess);
		System.out.println("The number I was thinking of was: " + actualValue);
		System.out.println("You were off by: " + (actualValue - userGuess) );
		
		
	}
		
}