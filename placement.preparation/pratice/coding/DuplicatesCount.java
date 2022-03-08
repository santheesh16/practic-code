package pratice.coding;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesCount {
	public static void main(String[] args) {
		int a[]= { 1, 2, 4, 5, 2, 1, 5, 2, 10, 22, 5} ;
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {  
			int count = 1;
			if (i+1 < a.length && a[i] == a[i + 1]) {
				count++;
				System.out.println(count);
			} else {
				mp.put(a[i], count);
			}
		}
		System.out.println(mp.toString());
	}
}
