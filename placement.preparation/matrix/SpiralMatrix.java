package matrix;

import java.util.Arrays;

public class SpiralMatrix {
	
	static int[][] printSpiral(int arr[], int m, int n){
		
		
		 if (arr == null) {
	            return null;
	        }
		int[][] mat = new int[m][n]; 
		int top = 0, left = 0, right = n - 1, bottom = m - 1, index = 0;
		while(true) {
			
			if(left > right){
				break;
			}
			
			for (int i = left; i <= right; i++) {
				mat[top][i] = arr[index++];
			}
			top++;
			
			if(top > bottom){
				break;
			}
			for (int i = top; i <= bottom; i++) {
				mat[i][right] = arr[index++];
			}
			right--;
			if(left > right){
				break;
			}
			
			for (int i = right; i >= left; i--) {
				mat[bottom][i] = arr[index++];
			}
			bottom--;
			
			if(top > bottom){
				break;
			}
			
			for (int i = bottom; i >= top; i--) {
				mat[i][left] = arr[index++];
			}
			left++;
			
		}
		
		return mat;
		
		
	}
	public static void main(String[] args) {
		// `M × N` matrix
        int M = 5;
        int N = 5;
 
        // an array of size `M×N`
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
 
        int[][] mat = printSpiral(arr, M, N);
        for (int r[]: mat) {
            System.out.println(Arrays.toString(r));
        }
	}
}
