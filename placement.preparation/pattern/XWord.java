package pattern;

public class XWord {

	public static void main(String[] args) {
		String str = "zohoround";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if(i == j || i + j == len - 1) {
					System.out.print(str.charAt(j));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if(i == len/2 || j == len/2) {
					System.out.print(str.charAt(i));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
