/**************************************************************************
**** BASIC PROGRAM TO EVALUAE WHETHER GIVEN NUMBER IS ARMSTRONG OR NOT ****
**************************************************************************/

import java.util.Scanner;
class ArmstrongNumber {
	
	public static int count(int number) {
		int counter = 0;
		while(number != 0) {
			counter++;
			number /= 10;
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = 0, resultNum = 0, digit = 0, count = 0;
		
		System.out.print("Enter number to check whether it is Armstrong or not: ");
		int num = sc.nextInt();
		
		temp = num;
		count = count(temp);
		while(temp != 0) {
			digit = temp % 10;
			resultNum += Math.pow(digit, count);
			temp /= 10;
		}
		
		if(num == resultNum) {
			System.out.println(num+" is Armstrong number !!!");
		}else {
			System.out.println(num+" is not Armstrong number !!!");
		}
		
		sc.close();
	}
}
