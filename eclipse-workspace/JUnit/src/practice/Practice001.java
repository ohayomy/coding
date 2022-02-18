package practice;

public class Practice001 {
	static int plus(int num1, int num2) {
		
		int result = 1;
		for (int i = 0; i < num2; i++) {
			result *= num1;
		}
		return result;
	}
}
