/*************************************************
**** Sum of series (1 + 1/2 + 1/3 + 1/4...)   ****
*************************************************/
package forLoop;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println("Invalid Input!!!, Only non-negtive input is allowed.");
		}else {
			float sum = 0.0f;
		
			for(float i = 1; i <= n; i++) {
				sum +=(1.0/i);
			}
			System.out.println("Sum of series upto "+n+" terms is "+sum+".");
		}
		sc.close();
	}
}
