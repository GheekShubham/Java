/*************************
**** FIBONACCI SERIES ****
*************************/
package forLoop;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstTerm = 0, secondTerm = 1, nextTerm = 0;
		System.out.print("Enter number of terms for fibonacci series: ");
		int n = sc.nextInt();
		System.out.println("Fibonacci Series: ");
		if(n == 1) {
			System.out.println(firstTerm+" ");
		}
		else if(n >= 2) {
			System.out.print(firstTerm+" "+secondTerm+" ");
		}
		for(int i = 1; i <= n-2; i++) {
			nextTerm = firstTerm + secondTerm;
			System.out.print(nextTerm+" ");
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		System.out.println("\n");
		
		sc.close();
	}
}
