package p27lambda;

import java.util.function.Function;

public class MethodReference { //	=	클래스이름::메서드이름
	// 하나의 메서드만 호출하는 람다식은 '메서드 참조'로 간단히 줄일 수 있다.
	//	static메서드 참조와 인스턴스 메서드참조가 있다.
	
	public static void main(String[] args) {
		
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		
		Function<String, Integer> f2 = Integer::parseInt;
	}
}
