/*********************************************
**** PROGRAM TO CHECK PRIME NUMBER OR NOT ****
*********************************************/
package forLoop;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check whether it is prime or not: ");
		int num = sc.nextInt();
		
		if(num < 2) {
			System.out.println("Prime number less than 2 is not there !!!");
		}else {
			boolean isPrime = true;
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num+" is Prime number!!!");
			}else {
				System.out.println(num+" is not Prime number!!!");
			}
		}
		sc.close();
	}
}
