package staticMethod;

public class MainClass {
	
	private static void max(int num1, int num2) {
		int temp = num1 >= num2 ? num1 : num2;
		System.out.println("Maximum is "+temp);
	}
	
	public static void main(String[] args) {
	
		max(25,83);	
		
	}
}
