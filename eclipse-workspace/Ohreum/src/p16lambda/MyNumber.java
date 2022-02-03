package p16lambda;

@FunctionalInterface
public interface MyNumber { //함수형 인터페이스
	
	int getMaxNumber(int num1, int num2);
//	int testNumber(int x, int y); 처럼 두개의 메서드를 정의해버리면 구현부에서 어느쪽인지 알수 없다.
	//그래서 하나의 인터페이스에서 하나만 정의한다.
}
