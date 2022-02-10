package p28stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamArray {
	public static void main(String[] args) {
		
		String[] strArr = new String[] {"a","b","c"};
		Stream<String> strStream1 = Stream.of(strArr);
		Stream<String> strStream2 = Arrays.stream(strArr);
		strStream1.forEach(System.out::println);
		
		int[] intArr1 = {1,2,3,4,5};		//기본자료형
		IntStream intStream1 = Arrays.stream(intArr1);
//		intStream1.forEach(System.out::print);
//		System.out.println("count="+intStream1.count());
//		System.out.println("sum="+intStream1.sum());
		System.out.println("average="+intStream1.average()); //4개 다 최종연산이기때문에 주석처리함
		
		Integer[] intArr2 = {1,2,3,4,5};	//참조자료형
		Stream<Integer> intStream2 = Arrays.stream(intArr2);	//숫자값인지 다른값인지모르기에 sum, average등은 제공하지않음
		intStream2.forEach(System.out::print);
//		System.out.println("count="+intStream2.count());
		
	}
}
