package conversionType;

public class IntConvert {

	static int charToInt(char c) {
		return c - '0'; //Character.getNumericValue(c); or  Integer.parseInt(String.valueOf(ch));
	}
	
	static char intToChar(int n) {
		return (char)(n+'0'); // (char)n;
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
}
