package pattern;

public class StringPattern {

	public static void main(String[] args) {
		String s = "WELCOME";
		int n = s.length();
		for (int i = 0; i < n; i++) {
			int p = n /2, q = 0;
			
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if(p < n ) {
					System.out.print(s.charAt(p++));
				}else {
					System.out.print(s.charAt(q++));
				}
			}
			System.out.println();
		}
	}
}
