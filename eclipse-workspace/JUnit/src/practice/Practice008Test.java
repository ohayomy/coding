package practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class Practice008Test {

	@Test
	void ex13() {	//숫자 패턴 찾기
		Pattern pattern = Pattern.compile("\\d{3}-\\d{5}");
		Matcher matcher = pattern.matcher("123-45678");
		assertTrue(matcher.find());
	}

	@Test
	void ex14() {
// Backreferences
// Regex에서 이전에 사용된 subpattern을 참조하는 것도 가능합니다. 이것을 Backreferences라고 합니다.
// Backreferences는 \n으로 표현합니다. 예를 들어, \1는 첫번째 subpattern이며,
// \2는 두번째 subpattern입니다. 아래 예제에서 \1은 첫번째 subpattern (..)을 의미합니다.
		Pattern pattern = Pattern.compile("c(..) s\\1");
		Matcher matcher = pattern.matcher("The cat sat on the mat");
		assertTrue(matcher.find());
	}
	
	@Test
	void ex15() {
// 중복된 단어 패턴 찾기
// 아래 예제의 Regex에서 \1은 첫번째 subpattern ("\w+")을 의미합니다.
// 따라서 동일한 단어가 연달아 오는 String은 이 패턴과 일치하게 됩니다.
		Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b");
		Matcher matcher = pattern.matcher("hello world world");
		assertTrue(matcher.find());
	}
	
	@Test
	void ex16() {	//Replace와 관련된 예제입니다.
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


