package tcs;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double k = sc.nextInt();
		System.out.println(k);
		k = Math.sqrt(k);
		System.out.println(k);
		System.out.println((int)k);
		if ((int) k == k)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}