package p16lambda;

public class MyNumberTest {
	
	public static void main(String[] args) {
		
		MyNumber maxNum = (x, y) -> (x >= y)? x: y;
		
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
		
		
//		��ǻ� ���ٽĵ� �͸���Ŭ������ �����̴�.
//		MyNumber aaa = new MyNumber() {
//			
//			public int getMaxNumber(int num1, int num2) {
//				return 0;
//			}
//		};
	}
}
