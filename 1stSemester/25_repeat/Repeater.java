/** 
Ocho
(Nora, Tasmin, Hamim)
APCS
HW 25 -- while and recursive loops
Time spent: 0.8 hours
2021-10-27

DISCOVERIES: 
 - Differences between the while loop and recursion
 - the this keyword has only two uses - in making overloaded constructors, and in using an object's own fields. For invoking a method 
   within itself, just call the method by name. 

UNRESOLVED QUESTIONS:
- Am I allowed to name my directories something more helpful, provided that they have the same numbers as everyone else's?
- I'm not really sure why using while within a recursive loop doesn't work. My guess is that if you use a while loop, when you invoke
  fenceR(numPosts), you invoke fenceR(something) numPosts number of times, and somewhere in the process of doing that, I had an error. 
- What is the procedure for submitting homework after 8am but before the start of class? 
*/

public class Repeater {
	public static String fenceW(int numPosts){
		int postsDone = 1;
		String fenceDisplay; // by default, should be empty
		if (numPosts < 1) { 
			return "no fence";
		} // if not, it just keeps going.
		fenceDisplay = "|";
		while (postsDone < numPosts) {
			fenceDisplay += "--|"; 
			postsDone += 1; 
		}
		return fenceDisplay; 
		
		
	}
	/* public static String fenceR(int numPosts){
		// ignore 0 case for now: 
		int postsNeeded = numPosts; 
		String fenceDisplay = "|"; 
		while (postsNeeded > 1) {
			postsNeeded -= 1;
			System.out.println(postsNeeded); 
			fenceDisplay = fenceR(postsNeeded) + "--|"; 
			
		}
		return fenceDisplay ; // failing all else, return 1
		
		
	} 
	 */
	public static String fenceR(int numPosts){
		if (numPosts < 0) {
			
		}
		if (numPosts > 1) {
			return (fenceR(numPosts - 1) + "--|"); 
			
		}
		return "|" ; // failing all else, return 1
		
		
	} 
	public static void main(String[] args){
		System.out.println( fenceW(4) ); 
		System.out.println( fenceW(0) );
		System.out.println( fenceR(4) ); 
		//System.out.println( fenceR(0) );
	}
}