/** 
KEVIN
(Nora, Hans, Neil, Hatch, Justin, Alfred)
APCS
HW 14 -- overloaded constructors
2021-10-07
*/

public class Greet5 {
    public static void main(String[] commandLine) {
		
		String greeting;

		BigSib5 richard = new BigSib5();
		
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
- Overloading classes works, more or less, as expected, 

UNRESOLVED QUESTIONS:
- This seems like a rather small program to break up into multiple files. At what point in the year will we regularly need to do this?
- Am I allowed to name my files something more helpful, provided that they have the same numbers as everyone else's?
*/
