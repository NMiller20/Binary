public class String1 {
	
	
	public String doubleChar(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++){
			newStr += str.substring(i, i+1) + str.substring(i, i+1);
		}
		return newStr;
	}
	
	public int countHi(String str) {
		int count = 0; 
		for (int i = 0; i < str.length() - 1; i++){
			if ( str.substring(i, i+2).equals("hi") ){
				count++; 
			}
		}
		return count;
	}
	
	public boolean catDog(String str) {
		int catCount = 0; 
		int dogCount = 0; 
		for (int i = 0; i < str.length() - 2; i++){
			if ( str.substring(i, i+3).equals("cat") ){
				catCount++; 
			}
			if ( str.substring(i, i+3).equals("dog") ){
				dogCount++; 
			}
		}
		
		return (catCount == dogCount);
	}
	
	
	public boolean endOther(String a, String b) {
		boolean outcome = true; 
		a = a.toLowerCase();
		b = b.toLowerCase();
		int i = 0; 
		while (i < a.length() && i < b.length()) {
			if (   a.substring(a.length() - i - 1, a.length() - i).equals( b.substring(b.length() - i - 1, b.length() - i) ) == false ) {
				outcome = false; 
			}
			
			i++;
		}
		return outcome; 
		
	}
	
	public boolean xyzThere(String str) {
		boolean outcome = false; 
		for (int i = 0; i < str.length() - 2; i++){
			if ( str.substring(i, i+3).equals("xyz") ){
				if ( i == 0 || str.substring(i-1, i).equals(".") == false ){
					outcome = true; 
				}
			}
		}
		return outcome;
	}

		

}