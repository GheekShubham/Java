/*****************************************************
****        STAR PATTERN EXAMPLE                  ****
****        * * * * *                             ****
****        * * * *                               ****
****        * * *                                 ****
****        * *                                   ****
****        *                                     ****
*****************************************************/
package forLoop;

import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= (n+1-i); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
