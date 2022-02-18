package practice;

import static org.junit.Assert.*;

import org.junit.jupiter.api.*;

public class Practice002Test {
	@Test
	void ex1() {
		String s = "ab.";
		assertFalse("ab".matches(s));
		assertTrue("abc".matches(s));
		
		s = "ab\\s\\S";
		assertFalse("ab  ".matches(s));
		assertTrue("ab c".matches(s));
	}
}
