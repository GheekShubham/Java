/***********************************************
****           STAR PATTERN                 ****
****             *                          ****
****           *   *                        ****
****         *   *   *                      ****
****       *   *   *   *                    ****
****     *   *   *   *   *                  ****
***********************************************/

package forLoop;

import java.util.Scanner;

public class StarPattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n-1; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
		sc.close();
	}
}
