package p16lambda;

public class MyNumberTest {
	
	public static void main(String[] args) {
		
		MyNumber maxNum = (x, y) -> (x >= y)? x: y;
		
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
		
		
//		사실상 람다식도 익명내부클래스의 일종이다.
//		MyNumber aaa = new MyNumber() {
//			
//			public int getMaxNumber(int num1, int num2) {
//				return 0;
//			}
//		};
	}
}
