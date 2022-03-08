package prep;

import java.util.Arrays;

public class Pigeonhole {
	public static void pigeonhole_sort(int arr[], int n) {
		int min = arr[0];
		int max = arr[0];
		int range, i, j, index;

		for (int a = 0; a < n; a++) {
			if (arr[a] > max)
				max = arr[a];
			if (arr[a] < min)
				min = arr[a];
		}

		range = max - min + 1;
		System.out.println(max);
		System.out.println(min);
		int[] phole = new int[range];
		Arrays.fill(phole, 0);

		System.out.println(Arrays.toString(phole));
		for (i = 0; i < n; i++) {
			phole[arr[i] - min]++;
		}
		System.out.println(Arrays.toString(phole));
		index = 0;

		for (j = 0; j < range; j++) {
			while (phole[j]-- > 0) {
				arr[index++] = j + min;
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(phole));
	}

	public static void main(String[] args) {

		int[] arr = { 8, 3, 2, 7, 4, 6, 8 };

		System.out.print("Sorted order is : ");

		pigeonhole_sort(arr, arr.length);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
