/** 
---
(Nora, Vansh, ___)
APCS
HW 26 -- iterative for loops
Time spent: 0.2 hours
2021-10-27

DISCOVERIES: 
 - 
  

UNRESOLVED QUESTIONS:
- 
*/




public class Rof {
    public static String fenceF(int posts){
    	if (posts == 0){ return ""; }
    	String output = "|";
    	for(int i = 1; i < posts; i++){
        	output += "--|";
    	}
    	return output;
    }

	public static String reverseF(String s){
	    String output = "";
	    for (int i = s.length(); i > 0; i--){
	        output += s.substring(i - 1, i);    
	    }
	    return output;
	}
	
	public static String reverseR(String s){
	    if (s.length() == 1){ return s;} // Base case
	    else{
	        return s.substring(s.length() - 1, s.length()) + reverseF(s.substring(0, s.length() - 1));
	        // Take the last character, plus the reversed string of the characters before it
	    }
	}
	public static void main(String[] args) {
		System.out.println(fenceF(5));
		System.out.println(reverseF("Stressed"));
		System.out.println(reverseF("z"));
		System.out.println(reverseR("Stressed"));
		System.out.println(reverseF("G"));
	}
}