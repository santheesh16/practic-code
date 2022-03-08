package tcs;

import java.util.Scanner;

public class ProductExpiry {

	public static void extractProduct(String code) throws Exception {
		String productString = code.substring(0, 2);
		int manuDate = Integer.parseInt(code.substring(2, 4));
		int validityPeriod = Integer.parseInt(code.substring(4, 6));

		if (productString.equals("EP")) {
			if (01 <= validityPeriod && validityPeriod <= 18) {
				if (manuDate <= 6 && manuDate >= 1) {
					productExpiry(manuDate, validityPeriod);
				} else {
					System.out.println(String.format("%02d", manuDate) + " is an invalid manufactured month");
				}
			} else {
				System.out.println(String.format("%02d", validityPeriod) + " is an invalid validity peroid");
			}
		} else {
			System.out.println(productString + " is an invalid product code");
		}

	}

	public static void productExpiry(int manuMonth, int validityMonth) throws Exception {
		int expiryMonth = 07;
		int expiryYear = 2021;
		int expiryCurrent = manuMonth + validityMonth, expiryCurrentMonth = 0, expiryCurrentYear = 0;

		System.out.println("Manufactured date " + String.format("%02d", manuMonth) + "/" + expiryYear);

		if (expiryCurrent > 12) {
			expiryCurrentMonth = expiryCurrent - 12;
			expiryCurrentYear = expiryYear + 1;
			System.out.println("\nExpiry date " + String.format("%02d", expiryCurrentMonth) + "/" + expiryCurrentYear);
		} else {
			System.out.println("\nExpiry date " + String.format("%02d", expiryCurrent) + "/" + expiryYear);
		}

		if (expiryCurrentYear > expiryYear) {
			System.out.println("\nThe product is not expired");
		} else if (expiryCurrentMonth > expiryMonth) {
			System.out.println("\nThe product is not expired");
		} else {
			System.out.println("\nThe product is expired");
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product code");
		String productCode = sc.nextLine();
		if (productCode.length() == 6) {
			extractProduct(productCode);
		} else {
			System.out.println(productCode.length() + " is an invalid length");
		}
	}

}
