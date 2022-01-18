package p6singleton;

public class P1Singleton {
	
	private static P1Singleton instance1 = new P1Singleton();
	
	private P1Singleton() {}
	
	public static P1Singleton getInstance() {
		return instance1;
	}
	
	
	
}
// 전 시스템에 하나의 인스턴스만 있도록 구현하는 방식
//1. 자바는 글로벌 변수가 없기때문에 스태틱 변수 사용
//2. 컴파일 과정에서 public default 생성자가 자동으로 생성되니 private로 만든다.
//3. 외부에서 쓸 수 있어야 하므로, public으로 선언된 스태틱 메서드를 추가한다.