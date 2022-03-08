package tcs;

import java.math.BigInteger;
import java.util.Scanner;

public class FactBigInt {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner scn = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = scn.nextInt();
			String res = factorial(num[i]);
			System.out.println(res);
		}
	}

	public static String factorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}
		return fact.toString();
	}
}
