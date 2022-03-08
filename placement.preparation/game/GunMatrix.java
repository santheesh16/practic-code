package game;


import java.util.Random;
public class GunMatrix {
	
	public static void main(String[] args) {
		

		Random random = new Random();
		int[][] mat = new int[9][9];
		int x = random.nextInt(9);
		int y = random.nextInt(9);
		
		System.out.println("Generated Random number for x: " + (x+1) + "\nGenerated Random Number for y: " + (y+1));
		

		mat[x][y] = 5;
		System.out.println("Gun Matrix: ");
		for(int row = 1-1; row < 9; row++) {
			for(int col = 1-1; col < 9; col++) {
				System.out.print(mat[row][col] + " ");
			}
			System.out.println();
		}	  
	}
}