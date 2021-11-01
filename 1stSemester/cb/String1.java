public class String1 {
	public String helloName(name) {
		return ("Hello " + name + "!"); 
	}
	public String makeOutWord(String out, String word) {
		int midpt = out.length()/2;
		return( out.substring(0, midpt) 
										+ word
												+ out.substring(midpt, out.length() )   ); 
												
  
	}
	
	public String makeAbba(String a, String b) {
		return ( a + b + b + a); 
    }
	
	public String makeTags(String tag, String word) {
		return( "<" + tag + ">" + word + "</" + tag + ">"); 
	}
	
	public String extraEnd(String str) {
		String end = str.substring( str.length() - 1, str.length() );
		return (end + end + end); 
	}

}