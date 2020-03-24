/**************************************************
****        STAR PATTERN EXAMPLE               ****
****                1                          ****
****              2   3                        ****
****            4   5   6                      ****
****          7   8   9   10                   ****
**************************************************/
package forLoop;

import java.util.Scanner;

public class StarPattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		 int num = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n-1; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(num+"   ");
				num++;
			}
			System.out.println();
		}
		sc.close();
	}
}
