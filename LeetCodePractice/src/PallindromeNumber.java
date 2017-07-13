/*Palindrome Number
 * Determine whether an integer is a palindrome. Do this without extra space.
 * */

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1));
	}
	
	public static boolean isPalindrome(int x) {
		boolean answer = false;
        if (x < 0 || (x != 0 && x%10 == 0)) {
        	answer = false;
        }else {
        	int rev = 0;
        	while (x > rev){
        		rev = rev*10 + x%10;
        		x = x/10;
        	}
        	System.out.println("rev: " + rev);
        	System.out.println("x: " + x);
        	answer = (x == rev || x == rev/10);
        }
        return answer;
    }

}
