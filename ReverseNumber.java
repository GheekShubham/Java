/****************************************
**** BASIC PROGRAM TO REVERSE NUMBER ****
****************************************/
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int reverse = 0, remainder = 0, temp = 0;
		
		System.out.print("Enter number to reverse: ");
		int num = sc.nextInt();
		
		temp = num;
		while(temp != 0) {
			remainder = temp % 10;
			reverse = reverse*10 + remainder;
			temp/=10;
		}
		
		System.out.println("Reverse of "+num+" is "+reverse+".");
		sc.close();
	}

}
