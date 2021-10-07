/** 
KEVIN
(Nora, Hans, Neil, Hatch, Justin, Alfred)
APCS
HW 12 -- programs in multiple files
2021-10-03
*/

public class Greet5 {
    public static void main(String[] commandLine) {
		
		String greeting;

		BigSib3 richard = new BigSib3();
		
		richard.setHelloMsg("Word up");
		System.out.println(richard.greet("freshman"));
		
		richard.setHelloMsg("Salutations");
		System.out.println(richard.greet("Dr. Spaceman"));
		
		richard.setHelloMsg("Hey ya");
		System.out.println(richard.greet("Kong Fooey"));
		
		richard.setHelloMsg("Sup");
		System.out.println(richard.greet("mom")); 
		
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
