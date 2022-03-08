package prep;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	static int findPalindrome(int num) {
		int n = num, temp , rev = 0; 
		while(n > 0) {
			temp = n % 10;			
			rev = (10 * rev) + temp;
			n /= 10; 
		}
		return rev;
	}
	
	static List<Integer> betnPalindrom(int start, int end) {
		
		List<Integer> palinNum = new ArrayList<>();  
		for (int i = start; i < end; i++) {
			int n = i, temp = 0 , rev = 0; 
			while(n > 0) {
				temp = n % 10;			
				rev = (10 * rev) + temp;
				n /= 10; 
			}
			if(i == rev) {
				palinNum.add(rev);
			}
		}
		return palinNum;
	}
	
	public static void main(String[] args) {
		System.out.println(findPalindrome(12345));
		System.out.println(betnPalindrom(101, 1000).toString());
	}
}
