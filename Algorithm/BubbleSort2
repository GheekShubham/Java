package bubbleSort;

public class BubbleSort2 {
		public static void main(String[] args) {
			
			int[] array = {9, 8, 7, 5, 6, 2, 1 };
			int len = array.length;
			
			for(int i = 0; i < len-1; i++) {
				boolean isSorted = true;
				for(int j = 0; j < len-1-i; j++) {
					if(array[j + 1] < array[j]) {
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
						isSorted = false;
					}
				}
				if(isSorted) break;
			}
			
			System.out.println("Sorted elements are: ");
			for(int item: array) {
				System.out.print(item+" ");
			}
		}
}
