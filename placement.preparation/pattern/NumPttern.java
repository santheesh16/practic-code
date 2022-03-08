package pattern;

public class NumPttern {
	
	public static void main(String[] args) {
		int n = 3;
		for (int i = 0; i < n; i++) {
			int p = 1;
			for (int j = i; j < n; j++,p++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}

}
