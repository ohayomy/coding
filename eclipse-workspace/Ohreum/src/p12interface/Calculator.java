package p12interface;

public class Calculator implements Calc {

	public int add(int num1, int num2) {
		return 0;
	}
	public int substract(int num1, int num2) {
		return 0;
	}
	public int times(int num1, int num2) {
		return 0;
	}
	public int divide(int num1, int num2) {
		return 0;
	}
	
//	public void description() {
//		System.out.println("재정의합니다");
//	}
	
	
	public static void main(String[] args) {
		
		Calc calc = new Calculator();
		calc.description();
	
	
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	
	
	}
	
}
