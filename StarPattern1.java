/****************************************
**** TO PRINT STAR PATTERN OF SQUARE ****
****        * * * *                  ****
****        * * * *                  ****
****        * * * *                  ****
****************************************/
package forLoop;

import java.util.Scanner;

public class StarPattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
