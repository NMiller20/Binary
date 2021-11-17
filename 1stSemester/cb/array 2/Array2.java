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


public class Array2 {
	public int countEvens(int[] nums) {
	  int numEvens = 0; 
	  for (int x : nums) {
		if (x%2 == 0) {
		  numEvens +=1; 
		}
	  }
	  return numEvens; 
	}
	
	public int bigDiff(int[] nums) {
	  int max = nums[0]; 
	  int min = nums[0];
  
	  for (int x : nums) {
  		max = Math.max(max, x);
  		min = Math.min(min, x);
	  }
	  return (max - min); 
	}
	
	
	public int centeredAverage(int[] nums) {
		int sum = 0; 
		int max = nums[0]; 
		int min = nums[0];
		for (int x : nums) {
			max = Math.max(max, x);
			min = Math.min(min, x);
			sum += x; 
		}
		sum = sum - max - min; 
		return (sum/(nums.length - 2)); 
	}
	
	public int sum13(int[] nums) {
		int sum = 0; 
		int toSubtract = 0;  
		int i = 0;
		while (i < nums.length) {
			if (nums[i] == 13) {
				if (i+1 < nums.length && nums[i+1] != 13) {
					toSubtract += nums[i+1];
				}				
			} else {
				sum += nums[i];
			}
			i += 1; 
			
		}return (sum - toSubtract); 
	}
	
	
	public int sum67(int[] nums) {
		int sum = 0; 
		boolean go = true;   
		int i = 0;
		while (i < nums.length) {
			if (go) {
				if (nums[i] == 6){
					go = false; 
				} else {
					sum +=  nums[i]; 
				}
				
			} else {
				if (nums[i] == 7){
					go = true; 
				}
			}
			i += 1; 
			
		}return sum; 
	}
	
	public boolean has22(int[] nums) {
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == 2 && i < nums.length - 1 && nums[i+1] == 2) {
				return true;  
			}
		}
		return false; 
	}
	
	public boolean lucky13(int[] nums) {
		boolean OnesOrThrees = true; 
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == 1 || nums[i] == 3) {
				OnesOrThrees = false;  
			}
		}
		return OnesOrThrees; 
	}

	public boolean sum28(int[] nums) {
		int sumOfTwos = 0; 
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == 2) {
				sumOfTwos += 2;  
			}
		}
		return (sumOfTwos == 8); 
	  
	}

}