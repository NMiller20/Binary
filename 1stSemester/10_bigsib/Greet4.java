/** 
KEVIN
(Nora, Hans, Neil, Hatch, Justin, Alfred)
APCS
HW 09 -- programs in multiple files
2021-10-03
*/

public class Greet4 {
   public static void main(String[] commandLine) {
	   System.out.println( BigSib2.greet("Crosby") ); 
	   System.out.println( BigSib2.greet("Stills") );
	   System.out.println( BigSib2.greet("Nash") );
  }
  
}
/** 
DISCOVERIES: 
- Files in a multiple-file program need to be compiled in order - files containing methods used by the other file need to be compiled first
- A name change in a directory requires that everything in it either be readdded, or the entire folder be readded
- Adding a directory, no matter the size, adds everything in it. 

UNRESOLVED QUESTIONS:
- This seems like a rather small program to break up into multiple files. At what point in the year will we regularly need to do this?
*/