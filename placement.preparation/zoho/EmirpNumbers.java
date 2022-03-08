package zoho;
import java.util.Arrays;
import java.util.Scanner;
public class EmirpNumbers {
	static int[] arr;
	public static boolean checkPrime(int n) {
		
		for(int i = 2; i<= n / 2; ++i) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkReverse(int n) {
		int rev = 0;
		int num = n;
		while(num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if(rev != n) {
			if(checkPrime(rev)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		int k = 0;
		for(int i = 2; i <= n; i++) {
			if(checkPrime(i)) {
				if(checkReverse(i)) {
					arr[k++] = i;
				}
			}
		}
		System.out.println("The Emirp Numbers are : ");
		for(int i = 0; i < k; i++) {
			if(i == k - 1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i] + ", ");
			}
		}
		
	}

}
