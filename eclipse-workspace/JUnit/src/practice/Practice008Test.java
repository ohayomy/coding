package practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class Practice008Test {

	@Test
	void ex13() {	//���� ���� ã��
		Pattern pattern = Pattern.compile("\\d{3}-\\d{5}");
		Matcher matcher = pattern.matcher("123-45678");
		assertTrue(matcher.find());
	}

	@Test
	void ex14() {
// Backreferences
// Regex���� ������ ���� subpattern�� �����ϴ� �͵� �����մϴ�. �̰��� Backreferences��� �մϴ�.
// Backreferences�� \n���� ǥ���մϴ�. ���� ���, \1�� ù��° subpattern�̸�,
// \2�� �ι�° subpattern�Դϴ�. �Ʒ� �������� \1�� ù��° subpattern (..)�� �ǹ��մϴ�.
		Pattern pattern = Pattern.compile("c(..) s\\1");
		Matcher matcher = pattern.matcher("The cat sat on the mat");
		assertTrue(matcher.find());
	}
	
	@Test
	void ex15() {
// �ߺ��� �ܾ� ���� ã��
// �Ʒ� ������ Regex���� \1�� ù��° subpattern ("\w+")�� �ǹ��մϴ�.
// ���� ������ �ܾ ���޾� ���� String�� �� ���ϰ� ��ġ�ϰ� �˴ϴ�.
		Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b");
		Matcher matcher = pattern.matcher("hello world world");
		assertTrue(matcher.find());
	}
	
	@Test
	void ex16() {	//Replace�� ���õ� �����Դϴ�.
		String result;
		Pattern p = Pattern.compile("dog");
		Matcher m = p.matcher("The dog says meow, All dogs say meow.");
		System.out.println(m.replaceAll("cat"));
		
		result = "The cat sat on the mat.".replaceAll("at[.]", "*");
		System.out.println(result);
		
		result = "The cat sat on the mat.".replaceAll("at[.]?", "*");
		System.out.println(result);
		
		result = "The cat sat on the mat.".replaceAll("[a-z]+", "*");
		System.out.println(result);
	}
	
	@Test
	void ex17() {
		String result;
		result = "The cat sat on the mat.".replaceAll("c.+t", "*");
		System.out.println(result);
		
		result = "The cat sat on the mat.".replaceAll("c.+?t", "*");
		System.out.println(result);
	}
}


