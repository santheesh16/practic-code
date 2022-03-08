package matrix;


public class ZeroOnesPattern {

	public static void main(String[] args) {
		int row, col ;
		row = col = 5;
		int[][] zerOnes = new int[row][col];
		for (int i = 0; i < zerOnes.length; i++) {
			for (int j = 0; j < zerOnes.length; j++) {
				System.out.printf("%d ", zerOnes[i][j]);
			}
			System.out.println();
		}
	}
}
