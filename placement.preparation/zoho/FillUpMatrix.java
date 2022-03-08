package zoho;

import java.util.Scanner;

public class FillUpMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[9][9];
		int x = sc.nextInt();
		int y = sc.nextInt();
		x -= 1;
		y -= 1;
		mat[x][y] = 5;
		System.out.println("Gun Placed Matrix: ");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
