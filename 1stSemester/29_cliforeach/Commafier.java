/** 
Ocho
(Nora, Tasmin, Hamim)
APCS
HW 25 -- while and recursive loops
Time spent: 0.8 hours
2021-10-27

DISCOVERIES: 
 

UNRESOLVED QUESTIONS:
- Am I allowed to name my directories something more helpful, provided that they have the same numbers as everyone else's?




*/


public class Commafier {
	
	public static int findLen(int num) {
		if (0 <= num && num <= 99 ) {
			return 1; 
		} else {
			return 1 + findLen(num/10); 
		}
	}
	
    public static String commafyR(int num){
    	int powOfTen = Math.round(Math.round( Math.pow(10.0, findLen(num)/1.0) ));
		if (0 <= num && num <= 9 ) { // num is a digit
			return "" + num + ""; 
		} else if ( commafyR(num % powOfTen).length()%3 == 0 ) { // checking if we need a comma - we need a comma when the number, without 
			
			return ( num / powOfTen + "," + num % powOfTen); 
		} else {
			return ( num / powOfTen + "," + num % powOfTen); 
		} 
		//return powOfTen;
	}
	
	public static void main(String[] args) {
		System.out.println(commafyR(24) );
		System.out.println(findLen(240987) );	
		System.out.println(commafyR(240987) );	
		
	}
    
} 