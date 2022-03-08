package tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleSmallestValue {

	
	public int findDigits(int n, int count) {
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
	
	public int findMultiplySmallest(int num) {
		
		List<Integer> list = new ArrayList<Integer>();
		int a, b;
		for (int i = num+1; i < 100; i++) {
			a = i % 10;
			b = i / 10;
			int c = a * b;
			if(c == num) {
				list.add(i);
			}
		}
		return list.get(0);
	}

	public static void main(String[] args) {

		MultipleSmallestValue multply = new MultipleSmallestValue();

		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(multply.findMultiplySmallest(num));
	}
}
