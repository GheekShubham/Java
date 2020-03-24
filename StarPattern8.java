/******************************************
****        STAR PATTERN EXAMPLE       ****
****            *                      ****
****            * *                    ****
****            * * *                  ****
****            * *                    ****
****            *                      ****
******************************************/
package forLoop;
import java.util.Scanner;
public class StarPattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter nummber of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i <= Math.ceil(n/2.0)) {
				for(int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}else {
				for(int k = 1; k <= n-i+1 ; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
