/** 
Ocho
(Nora, Tasmin, Hamim)
APCS
HW 29 - foreach loops; more for loop practice; feeding args directly into arg in the main method. 
Time spent: 2.1 hours
2021-11-3

DISCOVERIES: 
- Reminder to self: to convert an int to a String, just add an empty string to it. 
- Taking advantage of the main method is WAYYYYY easier than using a Scanner. 

UNRESOLVED QUESTIONS:
- Why can't java accept a main method that takes an array of ints as an argument? Why is it useful to design java that way? 
- (Working hypothesis; You can put anything and everything in a String[], so using only String[]s for the main method reduces the number of errors for the user)




*/


public class Commafier2 {
	
	public static String commafyR(int num){
		String strNum = "" + num + ""; 
		if (strNum.length() > 3 ) { // insert a comma before the last three digits
			return ( commafyR( num/1000 ) + "," + strNum.substring(strNum.length()-3, strNum.length()) ); 	
		} else {
			return strNum; 
		}
	}
	
	
	public static String fCommafy(int num) {
		String strNum = "" + num + ""; 
		/* String commafied = strNum.substring(0, strNum.length()%3 );
		strNum = strNum.substring(strNum.length()%3, strNum.length() ); // take off everything before the first comma
		for (int i = 1; i < length(); i++){
			commafied += "," + strNum(3*(i-1), 3*i); 
		} */
		if (strNum.length() <= 3 ) {
		return strNum; }
		else {
			String commafied = strNum.substring(strNum.length()-3, strNum.length()); 
			for (int i = 3; i < strNum.length(); i+=3 ){
				commafied = strNum.substring(Math.max(0, strNum.length()-i-3), strNum.length()-i) + "," + commafied;
			}
			return commafied; 
		}
		
	}
	public static void main(String[] args) {
		/* System.out.println(commafyR(24) );
		System.out.println(commafyR(240987) );
		System.out.println(commafyR(24095687) );
		System.out.println(commafyR(0) );		
		System.out.println(fCommafy(24) );
		System.out.println(fCommafy(240987) );
		System.out.println(fCommafy(24095687) );
		System.out.println(fCommafy(0) ); */
		
		for (String s : args) {
			System.out.println(commafyR(Integer.parseInt(s))); // using the method from the wrapper class of int to convert the int into a string
			System.out.println(fCommafy(Integer.parseInt(s)));
		}
		
	}
    
} 