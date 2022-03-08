package pratice.coding;

import java.util.Arrays;

public class SecMinMaxValue {

	static int arr[] = {3,5,2,9,6,1}, n = arr.length;
	
	
	static int[] findSecMax() {
		
		int maxFirst, maxSec, minFirst, minSec;
		maxFirst = maxSec = Integer.MIN_VALUE;
		minFirst = minSec = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if(maxFirst < arr[i]) {
				maxSec = maxFirst;
				maxFirst = arr[i];
			}else if (maxSec < arr[i]  && arr[i] != maxFirst) {
				maxSec = arr[i];
			}
			
			if(minFirst > arr[i]) {
				minSec = minFirst;
				minFirst = arr[i];
			}else if (minSec > arr[i]  && arr[i] != minFirst) {
				minSec = arr[i];
			}
			
		}
		return new int[] {maxSec,minSec}; 
	}
	
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		System.out.println(Arrays.toString(findSecMax()));
	}

}
