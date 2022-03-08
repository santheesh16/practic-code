package zoho;
import java.util.Scanner;
public class SecondLargestAndSmallest {
	
	public static int[] MaxandMin(int[] arr) {
		int max = arr[0], min = arr[0], maxIndex = -1, minIndex = -1;
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i] && arr[i] != -1) {
				max = arr[i];
				maxIndex = i;
			}
			if(min > arr[i] && arr[i] != -1) {
				min = arr[i];
				minIndex = i;
			}
		}
		int maxNum = 0, minNum = 0, tempMax= 0, tempMin = 0;
		for(int i = 0; i < arr.length ; i++) {
			tempMax = maxNum;
			tempMin = minNum;
			maxNum = Math.max(arr[i], tempMax);
			minNum = Math.min(arr[i],  tempMin);
//			System.out.println(maxNum);
//			if(maxNum > tempMax && i == arr.length -1) {
//				tempMax = maxNum;
//				System.out.println(maxNum + " " + tempMax);
//			}
//			if(minNum < tempMin && i == arr.length - 1) {
//				tempMin = minNum;
//				System.out.println(minNum + " " + tempMin);
//			}
			
			System.out.println(tempMax + " * " + tempMin);
		}
		
		return new int[] { max, min, maxIndex, minIndex};
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
//		int[] res = MaxandMin(arr);
//		arr[res[2]] = -1;
//		arr[res[3]] = -1;
		int[] ans = MaxandMin(arr);
		System.out.println("Second Largest : " + ans[0] + "\nSecond Smallest : " + ans[1]);	
	}

}
