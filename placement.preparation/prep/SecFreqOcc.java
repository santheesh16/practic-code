package prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecFreqOcc {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 1, 2, 3, 1, 2, 4 };
		int[] c = a;
		int count, maxFirst =  Integer.MIN_VALUE ,maxSec=  Integer.MIN_VALUE, firstfreq = 0, secFre = 0 ;
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					c[j] = 0;
				}
			}
			if (a[i] != 0) {
				mp.put(a[i], count); // Element , Frequency
			}
		}

		for (Entry<Integer, Integer> entry : mp.entrySet()) {
			if(maxFirst < entry.getValue()) {
				maxSec = maxFirst;
				maxFirst = entry.getValue();
				secFre = firstfreq;
				firstfreq = entry.getKey();
			}else if(maxSec < entry.getValue() && maxFirst != entry.getValue()) {
				maxSec = entry.getValue();
				secFre = entry.getKey();
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		System.out.println(mp.toString());
		System.out.println("Frist Frequency: Element "+ firstfreq + "-Freq: "+ maxFirst);
		System.out.println("Second Frequency: Element "+ secFre + "-Freq: "+ maxSec);
	}
}
