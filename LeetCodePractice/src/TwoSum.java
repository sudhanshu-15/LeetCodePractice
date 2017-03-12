import java.util.Hashtable;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15};
		int target = 18;
		int[] ans = twoSum(nums, target);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}
	
	public static int[] twoSum(int[] nums, int target){
		int[] ans = new int[2];
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		for(int i = 0; i < nums.length; i++){
			if(ht.containsKey(target - nums[i])){
				ans[1] = i;
				ans[0] = ht.get(target - nums[i]);
			}
			ht.put(nums[i], i);
		}
		
		//Other Solution
		/*for(int i = 0; i < nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				if(nums[i] + nums[j] == target){
					ans[0] = i;
					ans[1] = j;
				}
			}
		}*/
		return ans;
	}
}
