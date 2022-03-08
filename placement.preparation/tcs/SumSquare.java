package tcs;

import java.util.Scanner;

public class SumSquare {
	public static void main(String[] args) { // 333 = 3+3+3= 9 == 3*3
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] n = str.toCharArray();
		int sum = 0 , index = 0 , len = n.length;
		
		while(true) {
			sum += n[index++] - '0';
			if(index < len) {
				continue;
			}else {
				break;
			}
		}
//		for (int i = 0; i < n.length; i++) {
//			sum += Integer.parseInt(String.valueOf(n[i]));
//		}
//		int len = n.length;
		System.out.println(sum == len * len ? true:false);
	}
}
