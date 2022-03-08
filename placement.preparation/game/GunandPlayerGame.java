package game;

import java.util.Random;
import java.util.Scanner;
public class GunandPlayerGame {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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

		System.out.println("Enter 1 to move left\nEnter 2 to move right\nEnter 3 to move up\nEnter 4 to move down");
		while(true) {
			int choice = sc.nextInt();
			int move = 0;
			
			move = random.nextInt(4);
				
			
			
			System.out.println("Number of moves: " + move);
			if(choice >= 1 && choice <= 4) {
				mat[xPlayer][yPlayer] = 0;
			}
			switch(choice) {
				case 1:
					if(yPlayer - move >= 0) {
						yPlayer -= move;
					}
					
					break;
				case 2:
					if(yPlayer + move < 9) {
						yPlayer += move;
					}
					break;
				case 3:
					if(xPlayer - move >= 0) {
						xPlayer -= move;
					}
					break;
				case 4:
					if(xPlayer + move < 9) {
						xPlayer += move;
					}
					break;
				
			}
			mat[xPlayer][yPlayer] = 1;
			for(int row = 0; row < 9; row++) {
				for(int col = 0; col < 9; col++) {
						System.out.print(mat[row][col] + " ");
				}
				System.out.println();
			}
			if(xGun == xPlayer && yGun == yPlayer) {
				break;
			}
		}
		System.out.println("Game Over!!");	
	}
}