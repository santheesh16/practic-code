package prep;

public class PrintFreq {

	static void printCount(String str) {
		String num = "";
		char letter = ' ';
		for (char c : str.toCharArray()) {
			if (!(c >= '0' && c <= '9')) {
				if (num != "") {
					int n = Integer.parseInt(num);
					for (int i = 0; i < n; i++) {
						System.out.print(letter);
					}
				}
				letter = c;
				num = "";
			} else {
				num += c;
			}

		}
		int n = Integer.parseInt(num);
		for (int i = 0; i < n; i++) {
			System.out.print(letter);
		}
	}

	public static void main(String[] args) {
		printCount("a1b4c2");

	}
}
