/** 
KEVIN
(Nora, Hans, Neil, Hatch, Justin, Alfred)
APCS
HW 12 -- programs in multiple files
2021-10-03
*/

public class Greet6 {
    public static void main(String[] commandLine) {
		
		String greeting;

		BigSib4 richard = new BigSib4("Word up");
		System.out.println(richard.greet("freshman"));
		
		BigSib4 michael = new BigSib4("Salutations");
		System.out.println(michael.greet("Dr. Spaceman"));
		
		BigSib4 emily = new BigSib4("Hey ya");
		System.out.println(emily.greet("Kong Fooey"));
		
		BigSib4 brianna = new BigSib4("Sup");
		System.out.println(brianna.greet("mom"));
		
		
		
		/**richard.setHelloMsg("Salutations");
		System.out.println(richard.greet("Dr. Spaceman"));
		
		richard.setHelloMsg("Hey ya");
		System.out.println(richard.greet("Kong Fooey"));
		
		richard.setHelloMsg("Sup");
		System.out.println(richard.greet("mom")); */
		
  }
  
  
  
}
/** 
DISCOVERIES: 
- As with methods, new instances of a class in a file can be created outside of that file in another file within the same directory.
- (NOTE TO SELF) Going forward, include these sections in the file that contains the main method.
- <class>() creates a new instance of that class
- Instance variables seem to be the default type of variable - in order for a variable to not be an instance variable, you must use the keyword 'static' 

UNRESOLVED QUESTIONS:
- This seems like a rather small program to break up into multiple files. At what point in the year will we regularly need to do this?
*/
