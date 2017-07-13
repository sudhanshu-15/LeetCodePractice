import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterEl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {4, 1, 2};
		int[] num2 = {1, 3, 4, 2};
		int [] ans = nextGreaterElement(num1, num2);
		for (int i: ans){
			System.out.println(i);
		}
	}
	
/*	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
        	map.put(i, nums[i]);
        }
        
        class MyComp implements Comparator {
        	Map map;
        	public MyComp(Map map){
        		this.map = map;
        	}
        	public int compare(Object o1, Object o2){
        		return ((Integer)map.get(o2)).compareTo((Integer)map.get(o1));
        	}
        }
        
        MyComp comp = new MyComp(map);
        Map<Integer, Integer> treemap = new TreeMap(comp);
        
        treemap.putAll(map);
        int[] ans = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++){
        	if(treemap.get(i) > findNums[i]){
        		ans[i] = treemap.get(i);
        	}else{
        		for (Entry<Integer, Integer> e : treemap.entrySet()){
        			if((e.getValue() > findNums[i]) && (e.getKey() < i )){
        				ans[i] = e.getValue();
        				break;
        			}else{
        				ans[i] = -1;
        			}
        		}
        	}
        }
        return ans;
    }*/
	
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<>();
		for (int n : nums){
			while(!stack.isEmpty() && stack.peek() < n){
				map.put(stack.pop(), n);
			}
			stack.push(n);
		}
		for (int i = 0; i < findNums.length; i++){
			findNums[i] = map.getOrDefault(findNums[i], -1);
		}
		return findNums;
	}

}
