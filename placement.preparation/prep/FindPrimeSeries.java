package prep;

public class FindPrimeSeries {
	static boolean isPrime(int n) {
		int flag = 1;
		for (int j = 2; j < n; ++j) {
			if(n%j == 0) {
				flag = 0;
				break;
			}
		}
		if(flag == 1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] n = new int[] {1,10,6,8,13,21};
		
		for (int i = 0; i < n.length; i++) {
			if(n[i] == 0 || n[i] == 1) {
				System.out.printf("%d ",n[i]);
			}else {
				if(isPrime(n[i])) {
					System.out.printf("%d ",n[i]); 
				}
			}
		}
	}
}
