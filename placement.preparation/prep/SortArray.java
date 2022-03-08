package prep;

public class SortArray {

	public static void main(String[] args) {
		String pattern = "bxyzca";
		String str = "abcabcabc";
		String strSortedArr = "";
		char[] pattArr = pattern.toCharArray();
		char[] strArr = str.toCharArray();
		
		for (int i = 0; i < pattArr.length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				if(pattArr[i] == strArr[j]) {
					strSortedArr += strArr[j];
				}
			}
		}
		System.out.println(strSortedArr);
	}

}
