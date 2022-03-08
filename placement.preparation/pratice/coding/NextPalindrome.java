package pratice.coding;

public class NextPalindrome {

	static int[] palindromeORNot(int n) {
		int rem = 0, rev = 0, ori = n, dig = 0;
		while (n > 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n /= 10;
			dig++;
		}
		return new int[] { rev == ori ? 1 : 0, dig };
	}

	static void findNextPalindrome() {

		int n = 808, rem = 0, range1 = n + 1, range2 = n + 10, num1, num2 = 0;
		for (int i = range1; i <= range2; i++) {
			num1 = i;
			num2 = 0;
			while (num1 != 0) {
				rem = num1 % 10;
				num1 /= 10;
				num2 = num2 * 10 + rem;
			}

			if (i == num2)
				break;
		}
		System.out.print(num2);
	}

	public static void main(String[] args) {
		findNextPalindrome();
	}
}
