package prep;

import java.util.Arrays;

public class RemoveDuplicates {

	static void arrayRemove(int[] n){
		int[] unique = new int[n.length];
		
		for (int i = 0; i < unique.length - 1; i++) {
			for (int j = i + 1; j < unique.length; j++) {
				if(n[i] == n[j]) {
					n[j] = 0; 
				}
			}
		}
		System.out.println(Arrays.toString(n));
		for (int i = 0, j = 0; i < unique.length && j <unique.length  ; i++, j++) {
			if(n[i] != 0 ) {
				unique[j] = n[i];
				System.out.printf(n[i] + " "); 
			}
		}
		System.out.printf(Arrays.toString(unique)); 
	}	
	
	public static void main(String[] args) {
		arrayRemove(new int[] {4,2,5,8,3,2,6,3});
	}

}
