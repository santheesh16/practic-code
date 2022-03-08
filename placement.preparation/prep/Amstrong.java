package prep;

import java.util.ArrayList;
import java.util.List;

public class Amstrong {

	static int findDigits(int n) {
		
		int dig = 0;
		while(n > 0) {
			n /= 10;
			dig++;
		}
		return dig;
	}
	
	static List<Integer> amstrongBetn(int start, int end) {
		
		List<Integer> amsNum = new ArrayList<>();
		for (int i = start; i < end; i++) {
			int n = i, temp = 0 , ams = 0; 
			while(n > 0) {
				temp = n % 10;			
				ams += Math.pow(temp, findDigits(i));
				n /= 10; 
			}
			if(i == ams) {
				amsNum.add(ams);
			}
		}
		return amsNum;
	}
	
	public static void main(String[] args) {
		System.out.println(amstrongBetn(101, 500).toString());
	}

}
