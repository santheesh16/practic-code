package prep;

import java.util.Arrays;

public class MoveZeroEnd {

	static int[] swapZero(int[] a, int pos) {

		for (int i = pos; i < a.length; i++) {
			if(i < a.length - 1) {
				a[i] = a[i + 1];
			}
		}
		a[a.length - 1] = 0;
		return a;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 8, 0, 4, 0, 2, 0, 1, 3, 55, 1005 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				a = swapZero(a, i);
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
