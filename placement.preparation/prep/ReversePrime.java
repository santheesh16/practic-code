package prep;

import java.util.Arrays;

public class ReversePrime {

	static int reverseNum(int n) {
		int temp, rev = 0;
		while(n > 0) {
			temp = n % 10;
			rev = (rev * 10) + temp;
			n /= 10;
		}
		return rev;
	}
	static boolean isPrime(int n) {
		
		if(n == 0 || n == 1) {
			return true;
		}
		
		for (int i = 2; i < n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] num = new int[] {17,21,6,61};
		
		for (int i = 0; i < num.length; i++) {
			int rev = reverseNum(num[i]);
			if(isPrime(num[i]) && isPrime(rev)) {
				num[i] = rev;
			}
		}
		System.out.println(Arrays.toString(num));
		
	}

}
