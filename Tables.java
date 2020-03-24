/*******************************************
**** MULTIPLE TABLES TILL MANUAL EXTENT ****
*******************************************/
package forLoop;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of tables: ");
		int n = sc.nextInt();
		System.out.print("Enter extent: ");
		int m = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
