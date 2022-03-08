package zoho;

import java.util.Scanner;

public class TargetSum {
	
	public static int[] checkSum(int[] arr, int t) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == t) {
					return new int[] {i, j};
				}
			}
		}
		
		return new int[] { };
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int[] res = checkSum(array,target);
		if(res.length != 0) {
			System.out.println("True");
			for(int i = 0; i < res.length; i++) {
				if(i != res.length -1) {
					System.out.print(res[i] + ",");
				} else {
					System.out.println(res[i]);
				}
				
			}
		} else {
			System.out.println("False");
		}
	}

}
