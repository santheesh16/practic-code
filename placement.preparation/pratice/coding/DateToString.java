package pratice.coding;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author santh
 *
 */
public class DateToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		SimpleDateFormat sdF = new SimpleDateFormat("dd-mm-yyyy");
		String str = sc.nextLine();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date;
		try {
		    date = dateFormat.parse(str);
		    System.out.println(date.toString()); // Wed Dec 04 00:00:00 CST 2013

		    String output = dateFormat.format(date);
		    System.out.println(output); // 2013-12-04
		} 
		catch (ParseException e) {
		    e.printStackTrace();
		}
	}
}
