
package game;

import java.util.Scanner;
import java.util.Random;
public class GunGame {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[][] mat = new int[9][9];
		int xGun = 0, yGun = 0, xPlayer1 = 0, yPlayer1 = 0, xPlayer2 = 0, yPlayer2 = 0;

		while(true) {
			xGun = random.nextInt(9) + 1;
			yGun = random.nextInt(9) + 1;
			xPlayer1 = random.nextInt(9) + 1;
			yPlayer1 = random.nextInt(9) + 1;
			xPlayer2 = random.nextInt(9) + 1;
			yPlayer2 = random.nextInt(9) + 1;
			if(xGun != xPlayer1 && yGun != yPlayer1 && xGun != xPlayer2 && yGun != yPlayer2 && xPlayer1 != xPlayer2 && yPlayer1 != yPlayer2) {
				break;
			} else {
				System.out.println("Already Gun is on that position. Regenerate position to place player");
			}
			
		}
		
		System.out.println("Gun's Position: \n Generated Random number for x: " + (xGun) + "\nGenerated Random Number for y: " + (yGun) + 
				  "\nPlayer 1 Position: \n Generated Random number for x: " + (xPlayer1) + "\nGenerated Random Number for y: " + (yPlayer1) + 
					"\nPlayer 2 Position: \n Generated Random number for x: " + (xPlayer2) + "\nGenerated Random Number for y: " + (yPlayer2));
		

		mat[--xGun][--yGun] = 5;
		mat[--xPlayer1][--yPlayer1] = 1;
		mat[--xPlayer2][--yPlayer2] = 2;
		System.out.println("Gun Matrix: ");
		for(int row = 0; row < 9; row++) {
			for(int col = 0; col < 9; col++) {
				System.out.print(mat[row][col] + " ");
			}
			System.out.println();
		}	

		System.out.println("Enter 1 to move left\nEnter 2 to move right\nEnter 3 to move up\nEnter 4 to move down");
		int i = 0;
		int res = 0; 
		while(true) {
			System.out.println((i % 2 == 0) ? "Player 1 move:" : "Player 2 move:");
			int choice = sc.nextInt();
			int move = 0;
			
			move = random.nextInt(4);
			
		
			if(i % 2 == 0) {
				System.out.println("Number of moves: " + move);
				

				switch(choice) {
					case 1:
						if(yPlayer1 - move == xPlayer2) {
							i++;
							continue;
						}
						break;
					case 2:
						if(yPlayer1 + move == xPlayer2) {
							i++;
							continue;
						}
						break;
					case 3:
						if(xPlayer1 - move == yPlayer2) {
							i++;
							continue;
						}
						break;
					case 4:
						if(xPlayer1 + move == yPlayer2) {
							i++;
							continue;
						}
						break;
				}
				if(choice >= 1 && choice <= 4) {
					mat[xPlayer1][yPlayer1] = 0;
				}
				switch(choice) {
					case 1:
						if(yPlayer1 - move >= 0) {
							yPlayer1 -= move;
						}
						
						break;
					case 2:
						if(yPlayer1 + move < 9) {
							yPlayer1 += move;
						}
						break;
					case 3:
						if(xPlayer1 - move >= 0) {
							xPlayer1 -= move;
						}
						break;
					case 4:
						if(xPlayer1 + move < 9) {
							xPlayer1 += move;
						}
						break;
				
				}
				
				
				mat[xPlayer1][yPlayer1] = 1;
				for(int row = 0; row < 9; row++) {
					for(int col = 0; col < 9; col++) {
							System.out.print(mat[row][col] + " ");
					}
					System.out.println();
				}
				if(xGun == xPlayer1 && yGun == yPlayer1) {
					res = 1;
					break;
				}
			} else {
				System.out.println("Number of moves: " + move);
				switch(choice) {
					case 1:
						if(yPlayer2 - move == xPlayer1) {
							i++;
							continue;
						}
						break;
					case 2:
						if(yPlayer2 + move == xPlayer1) {
							i++;
							continue;
						}
						break;
					case 3:
						if(xPlayer2 - move == yPlayer1) {
							i++;
							continue;
						}
						break;
					case 4:
						if(xPlayer2 + move == yPlayer1) {
							i++;
							continue;
						}
						break;
				}
				
				if(choice >= 1 && choice <= 4) {
					mat[xPlayer2][yPlayer2] = 0;
				}
				switch(choice) {
					case 1:
						if(yPlayer2 - move >= 0) {
							yPlayer2 -= move;
						}
						
						break;
					case 2:
						if(yPlayer2 + move < 9) {
							yPlayer2 += move;
						}
						break;
					case 3:
						if(xPlayer2 - move >= 0) {
							xPlayer2 -= move;
						}
						break;
					case 4:
						if(xPlayer2 + move < 9) {
							xPlayer2 += move;
						}
						break;
				
				}
				
				
				mat[xPlayer2][yPlayer2] = 2;
				for(int row = 0; row < 9; row++) {
					for(int col = 0; col < 9; col++) {
							System.out.print(mat[row][col] + " ");
					}
					System.out.println();
				}
				if(xGun == xPlayer2 && yGun == yPlayer2) {
					res = 2;
					break;
				}
			}
			i++;

			
		}
		int gameResult = 0;
		System.out.println((res == 1) ? "Player 1 has gun. Player 2 need to escape" : "Player 2 has Gun. Player 1 need to escape");
		for(int trail = 0; trail < 6; trail++) {
			i++;
			if(i % 2 == 0) {
				System.out.println("Player 1 move:");
				int choice = sc.nextInt();
				if(res == 1) {
					if(xPlayer1 == yPlayer2 || yPlayer1 == xPlayer2) {
						
						if(choice == 5) {
							gameResult = 1;
							break;
						}
					}
				}
				

				int move = 0;	
				move = random.nextInt(4);
				System.out.println("Number of moves: " + move);
				if(choice >= 1 && choice <= 4) {
					mat[xPlayer1][yPlayer1] = 0;
				}
				switch(choice) {
					case 1:
						if(yPlayer1 - move >= 0) {
							yPlayer1 -= move;
						}
						
						break;
					case 2:
						if(yPlayer1 + move < 9) {
							yPlayer1 += move;
						}
						break;
					case 3:
						if(xPlayer1 - move >= 0) {
							xPlayer1 -= move;
						}
						break;
					case 4:
						if(xPlayer1 + move < 9) {
							xPlayer1 += move;
						}
						break;
				
				}
				mat[xPlayer1][yPlayer1] = 1;
				for(int row = 0; row < 9; row++) {
					for(int col = 0; col < 9; col++) {
							System.out.print(mat[row][col] + " ");
					}
					System.out.println();
				}
				
			}else if(i % 2 != 0) {
				System.out.println("Player 2 move:");
				int choice = sc.nextInt();

				if(res == 2) {
					if(xPlayer1 == yPlayer2 || yPlayer1 == xPlayer2) {
						
						if(choice == 5) {
							gameResult = 2;
							break;
						}
					}
				}
				int move = 0;	
				move = random.nextInt(4);
				System.out.println("Number of moves: " + move);
				if(choice >= 1 && choice <= 4) {
					mat[xPlayer2][yPlayer2] = 0;
				}
				switch(choice) {
					case 1:
						if(yPlayer2 - move >= 0) {
							yPlayer2 -= move;
						}
						
						break;
					case 2:
						if(yPlayer2 + move < 9) {
							yPlayer2 += move;
						}
						break;
					case 3:
						if(xPlayer2 - move >= 0) {
							xPlayer2 -= move;
						}
						break;
					case 4:
						if(xPlayer2 + move < 9) {
							xPlayer2 += move;
						}
						break;
				
				}
				mat[xPlayer2][yPlayer2] = 2;
				for(int row = 0; row < 9; row++) {
					for(int col = 0; col < 9; col++) {
							System.out.print(mat[row][col] + " ");
					}
					System.out.println();
				}
			}
		}
		if(gameResult == 0) {
			System.out.println((res == 1) ? "Player 2 Escaped" : "Player 1 Escaped");
		} else if(gameResult == 1) {
			System.out.println("Player1 Killed Player2!! Player 1 Wins....");
		} else {
			System.out.println("Player2 Killed Player1!! Player 2 Wins....");
		}
	}
}