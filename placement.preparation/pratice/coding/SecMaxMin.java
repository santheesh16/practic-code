package pratice.coding;

public class SecMaxMin {
	
	
	static int[] secMax(int[] arr) {
		int firstMax = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(firstMax < arr[i]) {
				secMax = firstMax;
				firstMax = arr[i];
			}else if(secMax < arr[i] && secMax != firstMax){
				secMax = arr[i];
			}
		}
		return new int[] {firstMax , secMax };
	}
	
	
	static int[] secMin(int[] arr) {
		int firstMin = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(firstMin > arr[i]) {
				secMin = firstMin;
				firstMin = arr[i];
			}else if(secMin > arr[i] && secMin != firstMin){
				secMin = arr[i];
			}
		}
		return new int[] {firstMin , secMin };
	}
	
	

	public static void main(String[] args) {
		int[] arr = new int[]{5,2,8,4,9,1};
		System.out.println("Second Maximum :" +secMax(arr)[1]);
		System.out.println("Second Minimum :" +secMin(arr)[1]);
		
		
	}

}
