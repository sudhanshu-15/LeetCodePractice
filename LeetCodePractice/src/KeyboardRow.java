import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard
 * Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.*/


public class KeyboardRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"Hello", "Alaska", "Dad", "Peace"};
		String[] output = findWords(input);
		for(String w:output){
			System.out.print(w + ", ");
		}
	}
	
	public static String[] findWords(String[] words){
		String[] key = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
		Map<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < key.length; i++){
			for (char c: key[i].toCharArray()){
				hmap.put(c, i);
			}
		}
		LinkedList<String> ans = new LinkedList<>();
		for (String w : words){
			if (w.equals("")) continue;
			int i = hmap.get(w.toUpperCase().charAt(0));
			for(char c:w.toUpperCase().toCharArray()){
				if(hmap.get(c) != i){
					i = -1;
					break;
				}
			}
			if (i != -1){
				ans.add(w);
			}
		}
		return ans.toArray(new String[0]);
	}

}
