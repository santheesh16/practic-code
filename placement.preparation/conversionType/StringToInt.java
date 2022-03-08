package conversionType;

public class StringToInt {
	
	static char StringToChar(String s) {
		return s.charAt(0);
	}
	
	static String CharToString(char c) {
		return String.valueOf(c); //or Character.toString(n);   
	}
	
	static int StringToInteger(String s) {
		return Integer.parseInt(s);
	}
	
	static String IntegerToString(int n) {
		return String.valueOf(n); //or Integer.toString(n); or String.format("%d",i);  
	}
	
	static long StringToLong(String s) {
		return Long.parseLong(s);  
	}
	
	static String LongToString(long n) {
		return String.valueOf(n); //or Long.toString(n); or String.format("%l",i);  
	}
	
	
	static float StringToFloat(String s) {
		return Float.parseFloat(s);  
	}
	
	static String FloatToString(float n) {
		return String.valueOf(n); //or Float.toString(n); or String.format("%f",i);  
	}

	
	static double StringToDouble(String s) {
		return Double.parseDouble(s);  
	}
	
	static String DoubleToString(float n) {
		return String.valueOf(n); //or Double.toString(n); or String.format("%x",i);  
	}
}
