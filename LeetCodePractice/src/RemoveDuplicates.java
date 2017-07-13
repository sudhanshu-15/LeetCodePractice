/*
 * Remove Duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 * */

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,2,2,3,3,3,4,5,6};
		System.out.println(removeDuplicates(arr));
		System.out.println("--");
		for (int i: arr){
			System.out.println(i);
		}
	}
	
	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0){
            return 0;
        }
		int i = 0;
        int j = (nums.length > 1) ? 1 : nums.length;
        int prev = nums[i];
        while (i < nums.length){
        	if (nums[i] != prev) {
        		nums[j] = nums[i];
        		prev = nums[i];
        		j++;
        	}else{
        		i++;
        	}
        }
        return j;
    }
	
	//Using For Loop will improve performance

}
