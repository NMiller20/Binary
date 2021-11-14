/**
Nora Miller, Gloria Lee, Ziying Jian (3 Lucky Duckies)
APCS
HW34 -- intro to arrays
2021-11-14
time spent: 1hr

QCC:

DISCO: 
- Reminder to self: generation of random stuff is a static method - you need to create a random generator first. 
- It seems like I can't redefine items in an array within a loop. 
*/

import java.util.Random; 

public class Loopier {
		
	public static int[] randArray(int[] array){ // seems easier to take the array being modified as an argument than 
											   // to do so as the thing invoking the function, because I don't know how 
											   // to access the contents of the item invoking a method
		Random randomGen = new Random();
		int[] newArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			newArray[i] = randomGen.nextInt(5); // it didn't specify the range for the number, but 100 is prob good for now?
		}
		return newArray; 
	}
	
	public static void printArray(int[] array) {
		for (int x : array){
			System.out.print( x + " "); 
		}
		System.out.println("\n"); 
	} // not entirely necessary anymore
	
	public static String intString(int[] array) {
		String stringRep = "";
		for (int x : array){
			stringRep += x + " "; 
		}
		return stringRep; 
	}
	
	public static int linSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++){
			if (array[i] == target) {
				return i; 
			}
		}
		return -1;
	}
	
	public static int linSearchR(int[] array, int target) {
		// if (array[0] == target){
			// return 0; 
		// } else {
			// return (1 + linSearchR(array.
		// }
		return -1;
	}
	
	public static int freq(int[] array, int target) {
		return -1;
	}
	
	public static int freqR(int[] array, int target) {
		return -1;
	}
	
	
	public static void main(String[] args){
		int[] a = new int[10]; 
		a = randArray(a); 
		printArray(a);
		System.out.println(intString(a));
		System.out.println(linSearch(a, 2)); 
		
		
	}
}