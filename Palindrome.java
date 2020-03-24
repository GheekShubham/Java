// Simple Palindrome Program
package whileLoop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to check for palindrome: ");
		int num = sc.nextInt();
		
		int temp = num, reverse = 0;
		
		while(temp != 0) {
			reverse = reverse*10 + (temp % 10);
			temp /= 10;
		}
		if(reverse == num) {
			System.out.println(num+" is Palindrome.");
		}else {
			System.out.println(num+" is not Palindrome.");
		}
		sc.close();
	}
}
