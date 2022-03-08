
package game;
import java.util.Random;
public class GunandPlayerMatrix {
	
	public static void main(String[] args) {
		

		Random random = new Random();
		int[][] mat = new int[9][9];
		int xGun = 0, yGun = 0, xPlayer = 0, yPlayer = 0;

		while(true) {
			xGun = random.nextInt(9) + 1;
			yGun = random.nextInt(9) + 1;
			xPlayer = random.nextInt(9) + 1;
			yPlayer = random.nextInt(9) + 1;
			if(xGun != xPlayer && yGun != yPlayer) {
				break;
			} else {
				System.out.println("Already Gun is on that position. Regenerate position to place player");
			}
			
		}
		
		System.out.println("Gun's Position: \n Generated Random number for x: " + (xGun) + "\nGenerated Random Number for y: " + (yGun) + 
				  "\nPlayer's Position: \n Generated Random number for x: " + (xPlayer) + "\nGenerated Random Number for y: " + (yPlayer) );
		

		mat[--xGun][--yGun] = 5;
		mat[--xPlayer][--yPlayer] = 1;
		System.out.println("Gun Matrix: ");
		for(int row = 0; row < 9; row++) {
			for(int col = 0; col < 9; col++) {
				System.out.print(mat[row][col] + " ");
			}
			System.out.println();
		}	  
	}
}