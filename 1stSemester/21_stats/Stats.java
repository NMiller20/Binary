
/** 
Ocho
(Nora, Tasmin, Hamim)
APCS
HW 21 -- writing a class to a previously set out set of tests
2021-10-17

DISCOVERIES: 
 - Making a method static makes it shared by the entire class, rather than belonging to each individual member of the class. 
 - You don't have to import java math; you just have to call math functions by denoting them as such
 - static methods can be invoked using the dot operator on the class name
 - In an overwritten function with math operations which takes either integers or doubles, if you invoke the method with some of each, 
 it will use the double version. 
 - (note to self): if you use the division operator on integers, it will lop off any decimal and return another int

UNRESOLVED QUESTIONS:
- Am I allowed to name my directories something more helpful, provided that they have the same numbers as everyone else's?
- Why is it useful to write any of these functions using integers when you can do the same operation with doubles and not run into issues
  with various built in math functions?




*/


public class Stats {
	public static int mean(int a, int b) { 
		int m = (a + b) / 2;
		return m;
	}
	
	public static double mean(double a, double b) {
		double m = (a + b) / 2;
		return m;
	}
	
	public static int max(int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}

	public static double max(double a, double b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
	
	
	public static int geoMean(int a, int b) { // Frankly, I don't know why it's useful to return this as an int. 
		double m = Math.sqrt(a * b);
		int n = 0;
		while (n < m) {
			n += 1; 
		}
		return n;
	}
	
	public static double geoMean(double a, double b) {
		double m = Math.sqrt(a * b);
		return m;
	}
  


    public static int max(int a, int b, int c) {
		int currentMax = a; 
		if (b >= currentMax) {
			currentMax = b;
		} 
		if (c >= currentMax) {
			currentMax = c;
		} 
		return currentMax;

    }

    public static double max(double a, double b, double c) {
		double currentMax = a; 
		if (b >= currentMax) {
			currentMax = b;
		} 
		if (c >= currentMax) {
			currentMax = c;
		} 
		return currentMax;

    }

 
    public static int geoMean(int a, int b, int c) {
		double product = a * b * c; 
		double sign = product / Math.abs(product);
		/* if (product == 0.0){
			return 0;
		} */
		double m = Math.pow(Math.abs(product),(1.0/3.0) ); 
		m = m * sign;
		
		int n = 0;
		if (sign == 1){
			while (n < m) {
				n += 1 ; 
			}
			return n;
		} else {
			while (n > m) {
				n -= 1  ;
			}
			return n;
		}
		
    } 

    public static double geoMean(double a, double b, double c) {
		double product = a * b * c; 
		double sign = product / Math.abs(product);
		/* if (product == 0.0){
			return 0.0;
		} */
		double m = Math.pow(Math.abs(product),(1.0/3.0) ); 
		m = m * sign;
		return m;
    }
	


  //main method for testing functionality
  public static void main( String[] args ) {

  }

}//end class