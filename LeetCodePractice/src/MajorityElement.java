/*Majority Element
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 3, 4, 1, 1};
		System.out.println(majorityElement(arr));
	}
	
	public static int majorityElement(int[] nums) {
        int ans = 0;
        
        Arrays.sort(nums);
        int mid = nums.length/2;
        ans = nums[mid];
        
        return ans;
    }

}
