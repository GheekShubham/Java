package generalStrings;
import java.util.Scanner;

public class AnagramString1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();
		
		boolean isAnagram = false;
		boolean[] isVisited = new boolean[str1.length()];
		
		if(str1.length() == str2.length()) {
			for(int i = 0; i < str1.length(); i++) {
				char ch = str1.charAt(i);
				for(int j = 0; j < str2.length(); j++) {
					if(ch == str2.charAt(j) && isVisited[j] == false) {
						isAnagram = true;
						isVisited[j] = true;
						break;
					}else {
						isAnagram = false;
					}
				}
				if(!isAnagram)	break;
			}
		}
		if(isAnagram) {
			System.out.println("Strings are Anagrams to each others!!!");
		}else {
			System.out.println("Strings are not Anagram to each other !!!");
		}
		sc.close();
	}
}
