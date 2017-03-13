/*Hamming Distance: The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.*/


/*Number Complement: Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.*/

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 4;
		System.out.println(hammingDistance(x, y));
		System.out.println(findComplement(x));
	}
	
	public static int hammingDistance(int x, int y){
		return (Integer.bitCount(x ^ y));
	}
	
	public static int findComplement(int num){
		int map = (Integer.highestOneBit(num)<<1) - 1;
		return ~num & map;
	}

}
