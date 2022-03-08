package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class AscandDescSorting {
	static int[] arr;
	
	public static void sortAscending(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void sortDescending(int n) {
		for(int i = arr.length - 1; i >= n; i--) {
			for(int j = i - 1; j >= n; j--) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if(n % 2 == 0) {
			sortAscending(n / 2);
			sortDescending(n / 2);
		} else {
			sortAscending((int) n / 2 - 1 );
			sortDescending((int) n / 2 + 1);
		}
		System.out.println(Arrays.toString(arr));
	}

}
