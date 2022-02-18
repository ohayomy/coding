package practice;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Practice004Test {
	@Test
	void ex4() {
		assertEquals("Thtt ttland tt good","This island is good".replaceAll("is", "tt"));
		assertEquals("This island tt good","This island is good".replaceAll("\\bis\\b", "tt"));
	}
	
	
	// \b는 단어의 경계선을 찾는 역할을 합니다. 예제를 보시면 경계선의 의미가 무엇인지 이해할 수 있습니다. 
	// 단어 양 옆에 \b를 사용하여 다른 문자와 결합되지 않은, 독립적인 단어를 찾을 수 있습니다.
	
	@Test
	void ex5() {
		assertTrue("az".matches("[abc][yz]"));
		assertTrue("final_1".matches("final_[0-9y-z]"));
		assertFalse("final_c".matches("final_[a-bd-z]"));
	}
	
	@Test
	void ex6() {
		String s = "\\d\\D";
		assertTrue("1a".matches(s));
		assertFalse("a1".matches(s));
		
		s = "\\d\\s\\D";
		assertTrue("1 c".matches(s));
		
		s = "\\d\\s\\S\\D";
		assertTrue("1 tx".matches(s));
		
		s = "\\w\\W";
		assertTrue("a ".matches(s));
		
		
//		\d	0~9 사이의 숫자, [0-9]와 동일
//		\D	숫자가 아닌 어떤 문자, [^0-9]와 동일
//		\s	whitespace 1개, \t,\n,\x0b,\r,\f 와 동일
//		\S	whitespace를 제외한 문자
//		\w	Alphanumeric(alphabet, 숫자) 문자, [a-zA-Z_0-9]와 동일
//		\W	Alphanumeric을 제외한 문자(whitespace 등)
	}
}
