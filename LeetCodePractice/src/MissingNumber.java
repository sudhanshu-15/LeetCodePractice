/*Missing Number
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * */

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 3};
		System.out.println(missingNumberBetter(arr));

	}
	
	public static int missingNumber(int[] nums) {
	    Arrays.sort(nums);
	    int ans = nums.length;
	    for (int i = 0; i < nums.length; i++){
	        	if (i != nums[i]){
	        		ans = i;
	        		break;
	        	}
	    }
	    return ans;
	}
	
	public static int missingNumberBetter(int[] nums) {
	    int sum = 0;
	    for (int i = 0; i < nums.length; i++){
	        	sum += nums[i];
	    }
	    return (nums.length * (nums.length + 1)/2) - sum;
	}

}
