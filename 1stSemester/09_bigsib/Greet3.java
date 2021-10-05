/** 
KEVIN
(Nora, Hans, Neil, Hatch, Justin, ???)
APCS
HW 09 -- programs in multiple files
2021-10-03
*/

public class Greet3 {
   public static void main(String[] commandLine) {
	   BigSib.greet("Flim'"); 
	   BigSib.greet("Flam");
	   BigSib.greet("Kazaam");
  }
  
  /* public static void greet(String name) {
	  System.out.println("Hi " + name + "! How're you doing?");
  } */
}
/** 
DISCOVERIES: 
- You can have a Java program invoke functions from java files within the same directory as itself. In order to do so, remember to:
- compile every file
- only use a main function in the file that you are using to invoke functions from other files. 

UNRESOLVED QUESTIONS:
- This seems like a rather small program to break up into multiple files. At what point in the year will we regularly need to do this?
*/