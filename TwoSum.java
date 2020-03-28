package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		Arrays.sort(array);
		System.out.println("Enter elements: ");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter target Sum: ");
		int target = sc.nextInt();
		
		int i = 0, j = size - 1;
		
		while(i < j) {
			if(target == array[i] + array[j]) {
				System.out.println("Target "+target+" is found in given elements!!!");
				break;
			}else if(target > array[i] + array[j]) {
				i++;
			}else if(target < array[i] + array[j]) {
				j--;
			}else {
				System.out.println("Target "+target+" is not found!!!");
				break;
			}
		}
		sc.close();
	}
}
