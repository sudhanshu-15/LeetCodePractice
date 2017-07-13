import java.util.Deque;
import java.util.LinkedList;

/*Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".*/


public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in = "Hello";
		System.out.println(reverseString(in));
	}
	public static String reverseString(String s){
		Deque<Character> d = new LinkedList<Character>();
		for (char c: s.toCharArray()){
			d.push(c);
		}
		StringBuilder str = new StringBuilder(d.size());
		for (char c: d){
			str.append(c);
		}
		return str.toString();
	}

}
