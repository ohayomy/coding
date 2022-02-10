package p27lambda;

import java.util.function.*;

public class PredicateTest {
	public static void main(String[] args) {
		Function<String, Integer>	f  = s -> Integer.parseInt(s, 16);
		Function<Integer, String>	g  = i -> Integer.toBinaryString(i);

		Function<String, String>    h  = f.andThen(g);  //g(f(x))
		Function<Integer, Integer>  h2 = f.compose(g);	// f(g(x))

		System.out.println(h.apply("FF")); // "FF" �� 255 �� "11111111"
		System.out.println(h2.apply(2));   // 2 �� "10" �� 16

		Function<String, String> f2 = x -> x; // �׵� �Լ�(identity function)
		System.out.println(f2.apply("AAA"));  // AAA�� �״�� ��µ�

		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate(); // i >= 100

		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));       // true

		String str1 = "abc";
		String str2 = "abc";
//		String str1 = new String("abc");
//		String str2 = new String("abc");

		
		// str1�� str2�� ������ ���� ����� ��ȯ
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);   
//		boolean result = Predicate.isEqual(str1).test(str2);
//		boolean result = str1.equals(str2);  //��ǻ� equals�� �Ȱ���. �ּҺ��ص� ���Գ��´�.
		System.out.println(result);
	}
}