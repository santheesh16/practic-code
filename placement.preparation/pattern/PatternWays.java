package pattern;

public class PatternWays {

	public static void main(String[] args) {
		int n = 5,coeff  =0 ;
		
		for (int i = 0; i <= n; i++) {
			int p = 1;
			for (int j = i; j <= n; j++) {				
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if(i == n ) {
					System.out.print(1);
				}else {
					coeff = coeff * (i - j + 1)/j;
					System.out.println(coeff);
				}
				
			}
			for (int j = 0; j < i; j++) {
				if(j == i - 1 || i == n) {
					System.out.print(1);
				}else {
					System.out.print(p++);
				}
				
			}
			System.out.println();
		}
		for (int i = 0; i <= n; i++) {
			int p = 1,q = n+1;
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(q--);
			}
			for (int j = i; j < n; j++) {
				System.out.print(q++);
			}
			System.out.println();
		}
		
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i <= n; i++) {

			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
