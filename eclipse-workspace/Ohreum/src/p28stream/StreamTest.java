package p28stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	//스트림이란 다양한 데이터 소스(컬렉션 프레임워크)를 표준화된 방법으로 다루기 위한 것.
	//스트림을 다루는 과정은 3단계로 구성된다.
	//1.데이터 소스에서 스트림 만들기
	//2.중간연산(0번~n번)
	//3.최종연산(1번)을 마치면 스트림은 소멸된다.
	//스트림은 Iterator처럼 일회용이다.필요시 다시 생성해야함.
	//최종연산 전까지 중간연산이 진행되지않는다(지연된 연산)
	//스트림은 데이터를 읽기만 할 뿐 변경하지않음(Read Only)
	//스트림은 반복문을 내부로 집어넣어서 코딩에 편리하다(사진참고)
	//병렬스트림 - 스트림의 작업을 병렬로 처리하는 기능을 제공(멀티쓰레드 사용에 유리)-parallel()메서드를사용한다.
	//기본형스트림 - IntStream, LongStream, DoubleStream이 있으며, 오토박싱&언박싱의 비효율이 제거된다. 예를들어서, Stream<T>에는 기본자료형
	//은 들어갈 수 없다. int[] {1,2,3} 같은 int배열은 각각의 값이 1 = new Integer(1)과 같이 참조형데이터로 변환이 필요했는데, IntStream을 쓰면
	//그 과정이 생략된다. 또한 숫자전용 유용한 메서드를 Stream<T>보다 더많이제공.(count()나 sum() average()등등)
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,1,5,4,2);
		List<Integer> sortedList = list.stream().sorted()
												.collect(Collectors.toList());
		
		System.out.println(sortedList);
		System.out.println(list);
		//원본값은 그대로인 것을 확인할 수 있다.
	}

}
