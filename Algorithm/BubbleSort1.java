package bubbleSort;

public class BubbleSort1 {
	
	public void bubbleSort(int[] array) {
		int len = array.length;
		int count = len - 1;
		for(int i = 0; i < len - 1; i++) {
			for(int j = 0; j < count; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}else 
			}
			count--;
		}
		System.out.println("Sorted elements are :");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {9, 8, 7, 6, 5, 4, 3};
		BubbleSort1 bs = new BubbleSort1();
		bs.bubbleSort(arr);
	}
}
