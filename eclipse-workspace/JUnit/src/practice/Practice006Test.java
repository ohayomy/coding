package practice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class Practice006Test {
	@Test
	void ex8() {
		String s = "(\\w)(\\s)([\\w])";
		assertEquals("Hell-orld", "Hello world".replaceAll(s, "-"));
		assertEquals("Hello-world", "Hello world".replaceAll(s, "$1-$3"));
		assertEquals("Hellw-oorld", "Hello world".replaceAll(s, "$3-$1"));
		//���Ͽ� �׷��� ������ �� �ֽ��ϴ�. �׷��� ()�� �����ϸ�, 
		//�׷��� ǥ���� ���� $1ó�� $������ �׷��� ��ȣ�� �Է��մϴ�. ���Ͽ��� ���� ���� �׷��� 1������ �����մϴ�.
		
	}
	
	
	
	
//	String Ŭ������ Regex�� �����ϴ� �޼ҵ���� �ֽ��ϴ�.
//	String.matches(regex)					String�� regex�� ��ġ�ϸ� true ����
//	String.split(regex)						regex�� ��ġ�ϴ� ���� �������� String�� �и��Ͽ� �迭�� ����
//	String.replaceFirst(regex, replacement)	regex�� ���� ���� ��ġ�ϴ� ���� replacement�� ��ȯ
//	String.replaceAll(regex, replacement)	regex�� ��ġ�ϴ� ��� ���� replacement�� ��ȯ
	
	//matches�� replaceAll�� �տ��� �߰�,
	
	@Test
	void ex9() {
		String s = "\\s";
		String[] arr = "Merry Christmas Mr Lawrence".split(s);
		System.out.println(Arrays.asList(arr));
	}
	
	@Test
	void ex10() {
		String s = "Merry";
		System.out.println("Merry Merry Christmas Mr Lawrence".replaceFirst(s, "Thanks"));
		System.out.println("Merry Merry Christmas Mr Lawrence".replaceAll(s, "Thanks"));
	}
	
	
}
