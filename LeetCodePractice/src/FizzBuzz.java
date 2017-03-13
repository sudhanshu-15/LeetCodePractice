import java.util.LinkedList;
import java.util.List;

/*Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.*/

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		List<String> an = fizzBuzz(n);
		for (String s : an){
			System.out.println(s);
		}
	}
	
	public static List<String> fizzBuzz(int n){
		LinkedList<String> ans = new LinkedList<>();
		for (int i = 1; i <= n; i ++){
			if (i%15 == 0){
				ans.add("FizzBuzz");
			}else if (i%3 == 0){
				ans.add("Fizz");
			}else if (i%5 == 0){
				ans.add("Buzz");
			}else{
				ans.add(Integer.toString(i));
			}
		}
		return ans;
	}

}
