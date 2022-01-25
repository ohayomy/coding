package p12interface;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("디폴트 메서드 갖다쓰세요");
	}
	
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		return total;
	}
	//static형식의 메서드(클래스메서드)는 인스턴스의 생성과 상관없이 사용할 수 있다.
	
	
	//추가로, private메서드는 하위클래스에서 사용할 수 없으며 인터페이스 내에서만 사용할 수 잇는 메서드다.
	//private나 private static으로 정의한다.
	
	
}
