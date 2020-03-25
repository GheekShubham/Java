package generalStrings;
import java.util.Scanner;
public class AnagramString2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isAnagram = true;
		System.out.print("Enter first string: ");
		String str1 = sc.next();
		
		System.out.print("Enter second string: ");
		String str2 = sc.next();
		
		int[] frequency1 = new int[256];
		int[] frequency2 = new int[256];
		
		for(char ch: str1.toCharArray()) {
			int index = (int)ch;
			frequency1[index]++;
		}
		for(char ch: str2.toCharArray()) {
			int index = (int)ch;
			frequency2[index]++;
		}
		
		for(int i = 0; i < 256; i++) {
			if(frequency1[i] != frequency2[i]) {
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("Strings are Anagram to each others!!!");
		}else {
			System.out.println("Strings are not Anagram to each others!!!");
		}
		sc.close();
	}
}
