package pratice.coding;

import java.util.Arrays;

public class FreqSort {

	static int[] freqArray(int[] a) {
		
		
		int visited = -1, count = 0;
		int visitedArr[] = new int[a.length];
		int temp = 0;
 		for (int i = 0; i < a.length; i++) {
			for (int j = i +1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
 			count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					visitedArr[j] = visited;
					count++;
				}
			}
			if (visitedArr[i] != visited) {
				visitedArr[i] = count;
			}
		}
 		
		int[][] freqEle = new int[4][6];
 		for (int i = 0; i < visitedArr.length; i++) {
			if (visitedArr[i] != visited) {
				System.out.println(a[i] + "-" + visitedArr[i]);
				
			}
		}
 		
 		for (int i = 0; i < visitedArr.length; i++) {
			for (int j = i +1; j < visitedArr.length; j++) {
				if (visitedArr[i] != -1 && visitedArr[i] > visitedArr[j] ) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(visitedArr));
		System.out.println(Arrays.toString(a));
		return a;
	}
 	
	public static void main(String[] args) {
		int[] a = new int[] {1,1,1,1,2,2,5,4,3,3,3,6,6,7};
		System.out.println(freqArray(a));
	}

}
