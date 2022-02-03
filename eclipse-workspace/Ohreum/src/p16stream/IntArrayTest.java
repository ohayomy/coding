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
		
//		int count = (int)stream.count(); //����. stream�� �ѹ����� �Ҹ�Ǳ� ����.
		int count = (int)Arrays.stream(arr).count(); //�̷��� ���ν���ߵ�
		System.out.println(count);
	}
}
