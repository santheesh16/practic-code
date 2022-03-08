package prep;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
	static List<Integer> primeBetN(int start, int end){
		
		List<Integer> primeNum = new ArrayList<>();
		for (int i = start; i < end; i++) {
			boolean flag = true;
			for (int j = 2; j <= i/2; ++j) {
				if(i%j == 0) {
					flag = false;
					break;
				}
				
			}
			if(flag) {
				primeNum.add(i);
			}
		}
		return primeNum;
	}
	public static void main(String[] args) {
		System.out.println(primeBetN(2, 100));
	}
}
