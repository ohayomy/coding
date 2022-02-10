package p28stream;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamRandom {
	public static void main(String[] args) {
		IntStream intStream = new Random().ints(); //무한스트림
//		IntStream intStream = new Random().ints(5, 10);
		
		intStream.limit(5).forEach(System.out::println);
		
		
		
		//특정범위의 정수를 요소로 갖는 스트림 생성
//		IntStream intStream = IntStream.range(1, 5);	//	1,2,3,4
//		IntStream intStream = IntStream.rangeClosed(1, 5);	//1,2,3,4,5
		
		
	}
}
