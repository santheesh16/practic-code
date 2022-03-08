package conversionType;

import java.util.Arrays;

public class ArrayConvert {
	
	static char[] stringToCharArray(String s){
		return s.toCharArray();
	}
	
	static String charArrayToString(char c[]){
		return c.toString();  // String.valueOf(a); or new String(c) or String.copyValueOf(arr);
		// Stream.of(char).map(arr -> new String(arr)).collect(Collectors.joining());
	}
	
	static String[] stringToStringArray(String s){
		return s.split(" ");
	}
	
	static String stringArrayToString(String s[]){
		return s.toString();  // String.valueOf(a); or new String(c) or String.copyValueOf(arr);
		// Stream.of(char).map(arr -> new String(arr)).collect(Collectors.joining());
	}
	
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
        int sum = Arrays.stream(A).sum();
        System.out.println("The sum of all the array elements is " + sum);
	}
}
