package zoho;

import java.util.Scanner;

public class LargestUnique {
	
	public static int[] findMaxandIndex(int[] arr) {
		int max = arr[0], index = 0;
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		return new int[] {max, index};
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = findMaxandIndex(arr);
		int index = res[1], max = res[0];
		boolean check = true;
		for(int i = 0; i < n; i++) {
			if(arr[i] != max) {
				if(max < arr[i] * 2) {
					check = false;
					break;
				}
			}
		}
		System.out.println((check) ? index : (arr.length==1) ? 0 : -1);
	}
}
