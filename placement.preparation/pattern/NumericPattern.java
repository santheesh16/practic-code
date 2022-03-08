package pattern;

public class NumericPattern {
	public static void main(String[] args) {
		int n = 8, start = 0, noOfColumns =1, noOfSpaces = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < noOfSpaces; j++) {
				System.out.print(" ");
			}
			start = i;
			noOfSpaces -= 1;
			for (int j = 1; j <= noOfColumns; j++) {
				int mid = noOfColumns/2 + 1;	
				System.out.print(start);
				if (j < mid) {
					start--;
				}else {
					start++;
				}
			}
			System.out.println();
			noOfColumns = noOfColumns+2;
		}
		
	/*	int start = 0, noOfColumns =1, noOfSpaces = 3;
		for (int i = 1; i <= 7; i++) {
			
			for (int j = 0; j < noOfSpaces; j++) {
				System.out.print(" ");
			}
			if(i < 4) {
				start = i;
				noOfSpaces -=1; 
			}else {
				start = 8 - i;
				noOfSpaces += 1;
			}
			for (int j = 1; j <= noOfColumns; j++) {
				int mid = noOfColumns/2 + 1;	
				System.out.print(start);
				
				if (j < mid) {
					start--;
				}else {
					start++;
				}
			}
			System.out.println();
			if(i < 4) {
				noOfColumns = noOfColumns+2;
			}else {
				noOfColumns = noOfColumns-2;
			}
			
		}*/
	}
}

/*  4*2 = 8 - 1 = 7/2 = 3 - 0 + 0 
 *  6*2 = 12 - 1 = 11/2 = 5
   00 01 02 03 04          00 01 02  0  04 05 06          0                    
   10 11 12 13 14          10 11 12  0  14 15 16          101  
   20 21 22 23 24          20 21 22  0  24 25 26         21021
   30 31 32 33 34          30 31 32  0  34 35 36        3210123
   40 41 42 43 44           


       0                           00 01 02 03 04  05 06  -
      101                          10 11 12 13 14  15  -  17 -
     21012                         20 21 22 23 24  -  26  27  -
    3210123                        30 31 32 33 34  
   432101234                       40 41 42 43 44  
  54321012345
 6543210123456
765432101234567


*/
