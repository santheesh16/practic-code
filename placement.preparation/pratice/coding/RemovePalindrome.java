package pratice.coding;

public class RemovePalindrome {
	
	
	static boolean isPalindrome(String s) {
		
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "He did a good deed", word = "", finalStr = "";
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) != ' ') {
				word = word + s.charAt(i);
			}else {
				if (!(isPalindrome(word))) {
					finalStr += word + " ";
				}
				word = "";
			}
		}
		System.out.println(finalStr);
	}

}
