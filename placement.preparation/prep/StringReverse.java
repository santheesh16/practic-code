package prep;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		String str = sc.next();
		char[] ch =  str.toCharArray();
		for (int i = str.length() - 1; i > -1 ; i--) {
			System.out.print(ch[i]);
		}
		sc.close();
	}
}
