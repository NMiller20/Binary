import java.util.Arrays;

public class ArrayProblems { // it wouldn't let me name the file arrays
	
	public static double[] powArray(double[] nums, double exp) {
		double[] newNums = new double[nums.length];
		for (int i = 0; i < nums.length; i++) {
			newNums[i] = Math.pow(nums[i], exp); 
		}
		return newNums;
	}
	
	public static int indexOfMax(int[] nums) {
		int biggest = nums[0];
		int biggestIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= biggest) {
				biggest = nums[i];
				biggestIndex = i;
			}
		}
		return biggestIndex;
	}
	
	public static boolean[] sieve(int n){
		double toCheckUnder = Math.sqrt(n); 
		boolean[] isPrime = new boolean[n];
		for (int i = 0; i < n; i++) {
			isPrime[i] = true;
		}
		
		isPrime[0] = false; 
		
		for (int i = 1; i < toCheckUnder; i++) {
			if (isPrime[i] == true) { // this means that the number above i is prime
				// change all the multiples of this i to false
				for (int a = 2*i+1; a < n; a = a + i+1 ) { // starting at the same place, go up by intervals of i+1
					isPrime[a] = false;
				}
			}
		}
		return isPrime; 
	}
	
	public static void main(String[] args) {
		double[] p = new double[] {3, 4, 6.7, -8, 1.05};
		System.out.println(Arrays.toString(powArray(p, 2) )); 
		
		int[] q = new int[] {3, 55, 51, 479, 104, -4};
		System.out.println(indexOfMax(q) ); 
		System.out.print("Yes, it is possible to do this with an enhanced for loop," 
		+ "but you'll have to find the index number given the largest number, since the enhanced for loop doesn't deal with large numbers\n"); 
		
		System.out.println(Arrays.toString(sieve(25)) ); 
	}
}