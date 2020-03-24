/*******************************************************
**** POWER FUNCTION WITHOUT USING IN-BUILD FUNCTION ****
*******************************************************/
package forLoop;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers (x, y to compute x powers to y): ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(y == 0) {
			System.out.println(x+" powers to "+y+" = "+1);
		}else {
			float result = 1.0f;
			for(int i = 1; i <= Math.abs(y); i++) {
				result *= x;
			}
			if(y > 0) {
				System.out.println(x+" powers to "+y+" = "+result);
			}else if(y < 0) {
				System.out.println(x+" powers to "+y+" = "+(1.0/result));
			}
		}
		sc.close();
	}
}
