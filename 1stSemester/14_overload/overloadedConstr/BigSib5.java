/** 
KEVIN
(Nora, Hans, Neil, Hatch, Justin, Alfred)
APCS
HW 14 -- overloaded constructors
2021-10-07
*/

public class BigSib5 {
	private String HelloMsg = "";
	
	public BigSib5() {
		
	} 
	
	public BigSib5(String message) {
		HelloMsg = message;
	} 
   	
	public void setHelloMsg(String message) {
		HelloMsg = message;
	} 
   	
   	public String greet(String name) {
	   return(HelloMsg + ", " + name);
  	}
  
  
    	
	 

}
/** 
DISCOVERIES: 
- (see file containing main method)

UNRESOLVED QUESTIONS:
(none)
*/
