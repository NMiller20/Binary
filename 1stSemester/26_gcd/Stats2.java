/** 
Ocho
(Nora, Tasmin, Hamim)
APCS
HW 26 -- making while and recursive loops do the same thing
Time spent: 1.5 hours
2021-10-27

DISCOVERIES: 
 - In general, recursive algs don't have a while loop. To make a while loop out of a recusive process, you need to find a way to do things so that 
 you don't end up with several of the same function incomplete in the stack as you're working - things must be able to be done sequentially
 - It helps to write the recursive loop first, 
  then the while condition
  then the base case (what happens after the while statement)
  then finally the body of the while condition
  

UNRESOLVED QUESTIONS:
- 
*/

public class Stats2 {
	public static void main(String[] args){
		System.out.println( gcd(2, 4) ); 
		System.out.println( gcd(18, 87) ); 
		System.out.println( gcd(305, 87) ); 
		
		System.out.println( gcdER(2, 4) ); 
		System.out.println( gcdER(18, 15) ); 
		System.out.println( gcdER(305, 87) );
		
		System.out.println( gcdEW(2, 4) ); 
		System.out.println( gcdEW(18, 15) ); 
		System.out.println( gcdEW(305, 87) );
	}
	
	public static int gcd( int a, int b ) {
		int c;
		int d;
		if (a <= b) {
			c = a; 
			d = b; 
		} else {
			c = b; 
			d = a; 
		}
		int counter = 1; 
		int gcd = 1; 
		while (counter <= c) {
			if (d % counter == 0) {
				if (c % counter == 0) {
					gcd = counter; 
				}
					
			}
			counter++;
		}
		return gcd;
		
		
	}
	
	public static int gcdER( int a, int b ) {
		int c;
		int d;
		if (a <= b) {
			c = a; 
			d = b; 
		} else {
			c = b; 
			d = a; 
		}
		
		if ( d % c == 0) {
			return c; 
		}
		return ( gcdER(d - c, c) ); 
	} 
	
	
	public static int gcdEW (int a, int b) {
		int c; 
		int d;
		if (a <= b) {
			c = a; 
			d = b; 
		} else {
			c = b; 
			d = a; 
		}
		int transD; 
		int transC; 
		while (d % c != 0) {
			transC = c; 
			transD = d; // load on the values
			c = transD % transC; // put them back onto the main variables
			d = transC;	
		}
		return c; 
	}
}
