package zoho;

import java.util.Scanner;
public class Calculator {	
	public static int operation(int choice, int num1, int num2) {
		int answer = 0;
		switch(choice) {
		case 1:
			answer = num1 + num2;
			break;
		case 2:
			answer = num1 + num2;
			break;
		case 3:
			answer = num1 + num2;
			break;
		case 4:
			try {
				answer = num1 / num2;
				break;
			} catch (Exception e) {
				System.out.println("Number can't be divided by zero");
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		System.out.println(" Press '1' for Addition\n Press '2' for Subtraction\n Press '3' for Multiplication\n Press '4' for Division");
		int choice = sc.nextInt();
		int result = operation(choice, number1, number2);
		System.out.println("The result for the opertion : " + result);
		sc.close();
	}
}
