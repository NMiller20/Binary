/** 
KEVIN
(Nora, Hans, Neil, Hatch, Justin, Alfred)
APCS
HW 14 -- overloaded constructors
2021-10-07
*/

public class Greet7 {
    public static void main(String[] commandLine) {
		
		String greeting;

		BigSib5 richard = new BigSib5("Word up");
		System.out.println(richard.greet("freshman"));
		
		BigSib5 michael = new BigSib5("Salutations");
		System.out.println(michael.greet("Dr. Spaceman"));
		
		BigSib5 emily = new BigSib5("Hey ya");
		System.out.println(emily.greet("Kong Fooey"));
		
		BigSib5 brianna = new BigSib5("Sup");
		System.out.println(brianna.greet("mom"));
		
  }
  
  
  
}
/** 
DISCOVERIES: 
- Overloading classes works, more or less, as expected, 

UNRESOLVED QUESTIONS:
- This seems like a rather small program to break up into multiple files. At what point in the year will we regularly need to do this?
- Am I allowed to name my files something more helpful, provided that they have the same numbers as everyone else's?
*/
