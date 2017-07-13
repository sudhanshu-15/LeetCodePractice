/*Rotate Array
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		rotate(arr, 2);
		for(int i: arr){
			System.out.println(i);
		}

	}
	
	public static void rotateTimeExceed(int[] nums, int k) {
        List<Integer> al = Arrays.stream(nums).boxed().collect(Collectors.toList()); 
		
		int size = nums.length;
        
        if (k > size){
            k = k % size;
        }
		
		for (int i = 0; i < k; i ++){
			int a = al.get(size-1).intValue();
			al.remove(size-1);
			Collections.reverse(al);
			al.add(a);
			Collections.reverse(al);
		}
		Integer[] temp = al.toArray(new Integer[nums.length]);
		for(int j = 0; j < temp.length; j++){
			nums[j] = temp[j];
		}
    }
	
	public static void rotate(int[] nums, int k) {
		if (k > nums.length){
			k = k % nums.length;
			
			int div = nums.length - k;
			
			reverseArr(nums, 0, div-1);
			reverseArr(nums, div, nums.length - 1);
			reverseArr(nums, 0, nums.length-1);
		}
	}
	
	public static void reverseArr(int[] arr, int left, int right){
		while (left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

}
