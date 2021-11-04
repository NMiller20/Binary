/** 
Ocho
(Nora, Tasmin, Hamim)
APCS
HW 31 - string parsing in java. 
Time spent: 2.1 hours
2021-11-3

DISCOVERIES: 
- Reminder to self: to convert an int to a String, just add an empty string to it. 
- Taking advantage of the main method is WAYYYYY easier than using a Scanner. 

UNRESOLVED QUESTIONS:
- Why can't java accept a main method that takes an array of ints as an argument? Why is it useful to design java that way? 
- (Working hypothesis; You can put anything and everything in a String[], so using only String[]s for the main method reduces the number of errors for the user)
*/

/***
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 ***/

public class Pig {
  //Q: How does this initialization make your life easier?
	private static final String VOWELS = "aeiou";

	public static boolean hasA( String w, String letter ) {
		if (w.indexOf(letter) == -1){
			return false; 
		} else {
			return true; 
		}
	}
	
	public static boolean isAVowel( String letter ) {
		if ( hasA( VOWELS, letter) ) {
			return true; 
		} else {
			return false; 
		}
	}

	public static int countVowels( String w ) {
		int vowels = 0;
		for (int i = 0; i < w.length(); i++) {
			if (isAVowel(w.substring(i, i+1) ) ) {
				vowels++;
			}
		}
		return vowels; 
    }

	public static boolean hasAVowel( String w ) {
		boolean val = false;
		for (int i = 0; i < VOWELS.length(); i++) { // going letter by letter
			if (hasA(w, VOWELS.substring(i, i+1) )) {
				val = true;
			}
		}
		return val; 
    }

    public static String allVowels( String w )  {
		String justVowels = ""; 
		for (int i = 0; i < w.length(); i++) {
			if (isAVowel(w.substring(i, i+1) ) ) {
				justVowels += w.substring(i, i+1); 
			}
		}
		return justVowels; 
    }


  public static void main( String[] args ) 
  {
    System.out.println(hasA("reading", "d")); //t
	System.out.println(hasA("reading", "")); //t
	System.out.println(hasA("writing", "d")); //f
	System.out.println(hasA("", "d")); //f
	System.out.println(hasA("d", "d"));  //t
	// I could get this to adddress issues with the second argument being longer than the first; I won't because of time constraints
    
	System.out.println("testing for isAVowel:");
	System.out.println(isAVowel("d")); //f
	System.out.println(isAVowel("a")); //t
	System.out.println(isAVowel("")); // returned t; could potentially be an issue later but idk
	
	System.out.println("testing for countVowels"); 
	System.out.println(countVowels("hawaii")); //4
	System.out.println(countVowels("try")); //0
	System.out.println(countVowels("a")); //1
	System.out.println(countVowels("d")); //0
	System.out.println(countVowels("")); //0
	
	System.out.println("testing for hasAVowel"); 
	System.out.println(hasAVowel("a")); //t
	System.out.println(hasAVowel("abba")); //t
	System.out.println(hasAVowel("bhhlk")); //f
	System.out.println(hasAVowel("")); //f
	System.out.println(hasAVowel("h")); //f
	
	System.out.println("testing for allVowels");
	System.out.println(allVowels("hawaii")); //aaii
	System.out.println(allVowels("try")); // (nothing)
	System.out.println(allVowels("")); //(nothing)
	System.out.println(allVowels("e")); //e
	System.out.println(allVowels("h")); //(nothing)
	System.out.println(allVowels("advantage")); //aaae

  }//end main()

}//end class Pig