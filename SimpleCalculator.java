/**************************
**** SIMPLE CALCULATOR ****
**************************/
package switchExample;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter operand 1: ");
		float op1 = sc.nextFloat();
		
		System.out.print("Enter operand 2: ");
		float op2 = sc.nextFloat();
		
		System.out.print("Enter operator: ");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		
		switch(op) {
		case '*':
			System.out.println(op1+" "+op+" "+op2+" = "+(op1*op2));
			break;
		case '/':
			if(op2 != 0)
				System.out.println(op1+" "+op+" "+op2+" = "+(op1/op2));
			else
				System.out.println("Division by Zero is not possible !!!");
			break;
		case '+':
			System.out.println(op1+" "+op+" "+op2+" = "+(op1+op2));
			break;
		case '-':
			System.out.println(op1+" "+op+" "+op2+" = "+(op1-op2));
			break;
		case '%':
			System.out.println(op1+" "+op+" "+op2+" = "+(op1%op2));
			break;
		default: 
			System.out.println("Invalid input !!!");
		}
		sc.close();	
	}

}
