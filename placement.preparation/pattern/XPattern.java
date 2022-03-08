package pattern;

public class XPattern {
	
	static void MirrorX(int n) {
		int left = n, rgt = 1;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if(row == col) {
					if(n/2 <= row && n/2 <= col) {
						System.out.print(left++);
					}else {
						System.out.print(left--);
					}
				}else if(row+col == n-1){
					if(n/2 <= row) {
						System.out.print(--rgt);
					}else {
						System.out.print(rgt++);
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	static void XWord(String s) {
		int len = s.length();
		for(int i = 0; i < len; i++)                                                                       
	       {                                                                                               
	         for(int j = 0; j < len; j++)                 // j = 5 - 1 - 0 = 4                  i = 0 k =0 
	         {                                            // j = 5 - 1 - 1 = 3                  i = 1 k    
	                                                      // j = 5 - 1 - 2 = 2                  i = 2      
	           // Print characters at corresponding       // j = 5 - 1 - 3 = 1                             
	           // places satisfying the two conditions    // j = 5 - 1 - 4 = 0                             
	           if((i == j) || (i + j == len - 1))                                                          
	             System.out.print(s.charAt(i));                                                            
	                                                                                                       
	           // Print blank space at rest of places                  //1      5                          
	           else                                                    //  2   4                           
	           System.out.print(" ");                                //    3                             
	         } 
	         System.out.println();
	       }
	}
	public static void main(String[] args) { 
		MirrorX(9);
		XWord("santheesh");
	}
}
/* 5 01 02 03 04                                                 1 01 02 03 1       00 01 02 03 04 05 06  
   10 4 12 13 14                                                 10 2 12 2  14      10 11 12 13 14 15 16
   20 21 22 23 24                                                20 21 3 23 24      20 21 22 23 24 25 26
   30 31 32 33 34                                                30 4 32 4  34      30 31 32 33 34 35 36
   40 41 42 43 44                                                5 41 42 43 5       40 41 42 43 44 45 46
                                                                                    50 51 52 53 54 55 56
                                                                                    60 61 62 63 64 65 66
*/
 