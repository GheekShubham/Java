/***********************************************
****       STAR PATTERN EXAMPLE             ****
****        * * * * *                       ****
****          * * * *                       ****
****            * * *                       ****
****              * *                       ****
****                *                       ****
***********************************************/

package forLoop;

import java.util.Scanner;

public class StarPattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print("  ");
			}
			for(int k = i; k <= n; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
