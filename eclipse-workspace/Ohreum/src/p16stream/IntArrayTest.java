package p16stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
//		int sum = Arrays.stream(arr).sum();
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
//		int count = (int)stream.count(); //에러. stream은 한번쓰면 소멸되기 때문.
		int count = (int)Arrays.stream(arr).count(); //이렇게 새로써줘야됨
		System.out.println(count);
	}
}
