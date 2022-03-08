package pratice.coding;

public class PrintFreq {

	/*
	 * aabbbcccc -> a2b3c4 a2b3c4 -> aabbbcccc
	 */

	public static void main(String[] args) {
		String str = "abbbccddd";
		String s = "";
		int freq = 1;
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
				freq++;
			} else {
				s += arr[i] + String.valueOf(freq);
				freq = 1;
			}
		}
		System.out.println(s);
	}

}
