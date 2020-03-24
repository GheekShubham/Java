/*****************************************
****        STAR PATTERN EXAMPLE      ****
****            *                     ****
****            * *                   ****
****            *   *                 ****
****            *     *               ****
****            * * * * *             ****
*****************************************/
package forLoop;

import java.util.Scanner;

public class StarPattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			for(int j = 1; j <= 2*i-1; j++) {
				if(j == 1 || j == 2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int p = 1; p <= n; p++) {
			System.out.print("* ");
		}
		sc.close();
	}
}
