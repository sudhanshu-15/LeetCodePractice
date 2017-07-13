/*Roman to Integer
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.*/

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("mmxii"));
	}
	
	public static int romanToInt(String s) {
        
		char[] c = s.toCharArray();
		int x = 0;
		for(int i = 0; i < c.length; i++){
			switch (c[i]) {
			case 'i':
			case 'I' :
				x += 1;
				break;
			case 'v':
			case 'V':
				if (i > 0 && (c[i-1] == 'i' ||c[i-1] == 'I' ) ){
					x = x-1 + 4;
				}else {
					x = x + 5;
				}
				break;
			case 'x':
			case 'X':
				if (i > 0 && (c[i-1] == 'i' ||c[i-1] == 'I' ) ){
					x = x-1 + 9;
				}else {
					x = x + 10;
				}
				break;
			case 'l':
			case 'L':
				if (i > 0 && (c[i-1] == 'x' ||c[i-1] == 'X' ) ){
					x = x-10 + 40;
				}else {
					x = x + 50;
				}
				break;
			case 'c':
			case 'C':
				if (i > 0 && (c[i-1] == 'x' ||c[i-1] == 'X' ) ){
					x = x-10 + 90;
				}else {
					x = x + 100;
				}
				break;
			case 'd':
			case 'D':
				if (i > 0 && (c[i-1] == 'c' ||c[i-1] == 'C' ) ){
					x = x-100 + 400;
				}else {
					x = x + 500;
				}
				break;
			case 'm':
			case 'M':
				if (i > 0 && (c[i-1] == 'c' ||c[i-1] == 'C' ) ){
					x = x-100 + 900;
				}else {
					x = x + 1000;
				}
				break;
			}
		}
		return x;
		
    }
	
	public static int romanToIntBetter(String s) {
        
		char[] c = s.toCharArray();
		int x = 0;
		for(int i = 0; i < c.length; i++){
			switch (c[i]) {
			case 'I' :
				x += 1;
				break;
			case 'V':
				if (i > 0 && c[i-1] == 'I' ){
					x = x-1 + 4;
				}else {
					x = x + 5;
				}
				break;
			case 'X':
				if (i > 0 && c[i-1] == 'I' ){
					x = x-1 + 9;
				}else {
					x = x + 10;
				}
				break;
			case 'L':
				if (i > 0 && c[i-1] == 'X' ){
					x = x-10 + 40;
				}else {
					x = x + 50;
				}
				break;
			case 'C':
				if (i > 0 && c[i-1] == 'X' ){
					x = x-10 + 90;
				}else {
					x = x + 100;
				}
				break;
			case 'D':
				if (i > 0 && c[i-1] == 'C' ){
					x = x-100 + 400;
				}else {
					x = x + 500;
				}
				break;
			case 'M':
				if (i > 0 && c[i-1] == 'C' ){
					x = x-100 + 900;
				}else {
					x = x + 1000;
				}
				break;
			}
		}
		return x;
		
    }

}
