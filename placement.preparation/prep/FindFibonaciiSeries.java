package prep;

public class FindFibonaciiSeries {

	static boolean isPerfectSquare(int num) {
		int n = (int) (Math.sqrt(num));
		return (n * n == num);
	}

	static void checkFib(int array[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (isPerfectSquare(5 * array[i] * array[i] + 4) || isPerfectSquare(5 * array[i] * array[i] - 4)) {
				System.out.print(array[i] + " ");
				count++;
			}
		}
		if (count == 0)
			System.out.println("None Present");
	}

	public static void main(String[] args) {
		int[] n = new int[] { 1, 10, 6, 8, 13, 21 };
		checkFib(n, n.length);
	}
}
