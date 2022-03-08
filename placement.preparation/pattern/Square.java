package pattern;

public class Square {

	public static void main(String[] args) {
		int n = 10 , a[][] = new int[n][n];
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col <= row ; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if(row - col <= 0 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if(row - col >= 0 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

		
	  for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if(col == 0 || row == 0 || n - 1 == row + col ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if(col == n - 1 || row == n - 1 || n - 1 == row + col ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if(col == 0 || row == n- 1 || row - col == 0 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if(col == n -1 || row == 0 || row - col == 0 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if(col == 0 || col == n - 1 || row == 0 || row == n - 1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if(col == 0 || row == 0 || n - 1 == row + col ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if(col == n - 1 || row == n - 1 || n - 1 == row + col ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if(col == 0 || row == n- 1 || row - col == 0 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if(col == n -1 || row == 0 || row - col == 0 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
/* 
 *              
                    row == 0                                                       row = 0                                     
                 00 01 02 03 04                         00  row - col >= 0      00 01 02 03 04                                 
                 10 12 12 13 14                         10 11                      12 12 13 14                                 
       col = 0   20 21 22 23 24  col = n -1    col = 0  20 21 22    row - col <= 0--> 22 23 24 col = n - 1                     
                 30 31 32 33 34                         30 31 32 33                      33 34                                 
                 40 41 42 43 44                         40 41 42 43 44                      44                                 
                   row = n -1                             row = n -1                                               
                                                                                                                   
                                                                                                                               
                     row == 0                                                                                         
                  00 01 02 03 04                                                 04                                            
                  10 11 12 13                                                 13 14                                            
        col == 0  20 21 22    n - 1 >= row + col       n - 1 <= row + col  22 23 24  col = n -1                                
                  30 31                                                 31 32 33 34                                            
                  40                                                 40 41 42 43 44                                            
                                                                       row = n -1                                  
 

*/