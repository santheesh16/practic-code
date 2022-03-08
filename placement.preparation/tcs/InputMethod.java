package tcs;

import java.io.DataInputStream;

public class InputMethod {

	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(System.in);

		@SuppressWarnings("deprecation")
		int n = Integer.parseInt(dis.readLine());
		int m = (n / 2) + 1;
		int md = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i == j && i <= m) || (j == 1) || (j == n) || (md == j && j >= m)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			md--;
		}
	}

}
