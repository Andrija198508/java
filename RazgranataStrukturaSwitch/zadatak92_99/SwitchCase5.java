package zadatak92_99;

import java.util.Scanner;

public class SwitchCase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y;
		char operator;
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite željeni operator: ");
		operator = ulaz.next().charAt(0);
		System.out.println("Unesite operand x: ");
		x = ulaz.nextDouble();
		System.out.println("Unesite operand y: ");
		y = ulaz.nextDouble();
		
		System.out.println("Rešenje za Switch: ");
		switch(operator) {
		case '+':
			System.out.println("X + Y = " + (x + y));
			break;
		case '-':
			System.out.println("X  - Y = " + (x - y));
			break;
		case '*':
			System.out.println("X * Y = " + (x * y));
			break;
		case '/':
			System.out.println("X / Y = " + (x / y));
		}
		
		/*Rešenje sa If/Else*/
		System.out.println("\nRešenje sa IF/ELSE: ");
		if(operator == '+') {
			System.out.println("X + Y = " + (x + y));
		}else if(operator == '-') {
			System.out.println("X - Y = " + (x - y));
		}else if(operator == '*') {
			System.out.println("X * Y = " + (x * y));
		}else if(operator == '/') {
			System.out.println("X / Y = " + (x / y));
		}else {
			System.out.println("Pogrešan unos");
		}
		ulaz.close();
	}

}
