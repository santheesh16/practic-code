package pattern;

public class DiamodPattern {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 8, start = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(start);
			}
			for (int j = 0; j < i; j++) {
				System.out.print(start);
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {

				System.out.print(start);
			}
			for (int j = i; j < n; j++) {

				System.out.print(start);
			}

			System.out.println();
		}

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {

				System.out.print(start);
			}

			System.out.println();
		}
	}

}
