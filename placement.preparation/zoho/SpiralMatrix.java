package zoho;

import java.util.Scanner;

public class SpiralMatrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] mat = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int i = 0, j = 0, elements = 0, rowCountDown = 0,rowCountUp = 0, colCountRight = 0, colCountLeft = 0;
		while(elements != row * col) {
			for(; j < col - colCountRight; j++) {
				System.out.print( mat[i][j] + " ");
				elements++;
			}
			rowCountUp++;
			if(elements == row * col) {
				break;
			}
			for(i = i + 1;i < row - rowCountDown; i++) {
				System.out.print( mat[i][j-1] + " " );
				elements++;
			}
			i = i - 1;
			j--;
			if(elements == row * col) {
				break;
			}
			colCountRight++;
			for(j = j - 1;j >= colCountLeft; j--) {
				System.out.print(mat[i][j] + " " );
				elements++;
			}
			rowCountDown++;
			if(elements == row * col) {
				break;
			}
			;
			for(i = i - 1;i >= rowCountUp; i--) {
				System.out.print(mat[i][j+1] + " " );
				elements++;
			}
			
			if(elements == row * col) {
				break;
			}
			colCountLeft++;
			j=rowCountUp;
			i=colCountLeft;
			//System.out.println(elements + " " + row * col);
		}
	}

}
