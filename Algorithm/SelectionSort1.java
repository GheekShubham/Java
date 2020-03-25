package selectionSort;

public class SelectionSort1 {

	public static void main(String[] args) {
		
		int[] array = {9, -5, 4, -11, 5, 6, 8, 7, 3, 2, 1};
		
		int len = array.length, miniPos = 0, temp = 0;
		
		for(int i = 0; i < len; i++) {
			miniPos = i;
			for(int j = i; j < len; j++) {
				if(array[miniPos] > array[j]) {
					miniPos = j;
				}
			}
			temp = array[i];
			array[i] = array[miniPos];
			array[miniPos] = temp;
		}
		
		System.out.println("Sorted elements are:" );
		for(int item: array) {
			System.out.print(item+" ");
		}
	}
}
