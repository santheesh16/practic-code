package prep;

import java.util.Scanner;

public class Fibonaaci {

	static void fibonaaciSeries(int n) {
		int n1 = 0, n2 = 1, n3;
		while (n1 < n) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter end of fibonaaci no:");
		fibonaaciSeries(sc.nextInt());
		sc.close();
	}

}
