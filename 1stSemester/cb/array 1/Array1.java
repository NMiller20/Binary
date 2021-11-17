/*
Nora Miller, Gloria Lee, Ziying Jian (3 Lucky Duckies)
 APCS
 HW37 - PPMP[] Practicing Arrays
 2021-11-16
 time spent: 2 hrs
 
 QCC: the difference between [] and {}? How can we effectively layer if statements and else statements without making the code inefficient / complicated? How long should
 each of these problems be taking us? What is the most effective way to do each problem?
 DISCO: From piazza, you can only hardcode an array using {}. It's difficult finding the right combo of && and || if you have a lot of if and else statements 
 layered on top of each other. We should be careful to always initialize variables like counters before using them. We have to be careful to always return something, especially 
 when dealing with different branches of if/else statements.
 */


public class Array1 {
	public boolean firstLast6(int[] nums) {
		boolean val = false; 
		if (nums[0] == 6) {
			val = true; 
		} if (num[num.length - 1] == 6) {
		val = true; }
		return val; }
	
	public boolean sameFirstLast(int[] nums) {
		if (nums.length > 0) {
			if (nums[0] == nums[nums.length - 1]) {
			return true; 
			} 
		}
		return false; 
	}
	public int[] makePi() {
		int[] pi = {3, 1, 4};
		return pi; 
	 
	}
	
	public boolean commonEnd(int[] a, int[] b) {
		boolean val = false; 
		if (a[0] == b[0]) {
			val = true; 
		} 
		if (a[a.length - 1] == b[b.length - 1]) {
			val = true; 
		} 
		return val;
	}
	
	public int sum3(int[] nums) {
		return (nums[0] + nums[1] + nums[2]);
	}
	public int[] rotateLeft3(int[] nums) {
	  int[] newNums = { nums[1], nums[2], nums[0]};
	  return newNums; 
	}
	
	public int[] reverse3(int[] nums) {
		int[] newNums = { nums[2], nums[1], nums[0]};
		return newNums; 
	}
	
	public int[] maxEnd3(int[] nums) {
	  int max; 
	  max = nums[0]; 
	  if (nums[2] > max){
		max = nums[2];
	  }
	  
	  int[] newNums = {max, max, max}; 
	  return newNums; 
  
	}

	
	
}


