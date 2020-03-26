package generalStrings;
import java.util.Scanner;

public class AnagramString3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two strings separated by space: ");
		String str1 = sc.next();
		String str2 = sc.next();
		
		int[] frequency = new int[256];
		boolean isAnagram = true;
		
		for(int i = 0; i < str1.length(); i++) {
			int index = (int) str1.charAt(i);
			frequency[index]++;
		}
		
		for(int i = 0; i < str2.length(); i++) {
			int index = (int) str2.charAt(i);
			frequency[index]--;
		}
		
		for(int i = 0; i < 256; i++) {
			if(frequency[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram){
			System.out.println("Strings are Anagrams to each others.");
		}else{
			System.out.println("Strings are not Anangram to each others.");
		}
		sc.close();
	}
}
