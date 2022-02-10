package p28stream;

import java.util.stream.Stream;

public class Stream2 {
	public static void main(String[] args) {
		
		Stream<Integer> intStream = Stream.iterate(1, n -> n+2);
		intStream.limit(10).forEach(System.out::println);
		//iterate는 단항연산자UnaryOperator라서 하나의 값 입력시 하나의 값만 반환한다.
		
		
		Stream<Integer> oneStream = Stream.generate(() -> 1);
		oneStream.limit(20).forEach(System.out::println);
		//generate는 Supplier라서 주는값이 없이 출력됨
	}
}
