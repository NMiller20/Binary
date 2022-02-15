// Nora Miller, Ethan Lam
// APCS pd6
// Recursion CB 
// 2022-02-14
// time spent: 0.6 hr

public class Recursion2 {
	public boolean groupSum(int start, int[] nums, int target) {
  if (start > nums.length - 1){
    return false; 
  }
  if (target == nums[start]){
    return true; 
  } else {
    boolean att = groupSum( start + 1, nums, target - nums[start]); 
    if (att == false){
      return (groupSum(start + 2, nums, target - nums[start]) ); 
    }
    return att; 
    
  }
}
}