package gloomyday;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Practice007Test {

	@Test
	void testRule1() {
		assertEquals("lowercase", Practice007.rule1("LOWERCASE"));
		assertEquals("uppercase", Practice007.rule1("UppERCasE"));
	}

	@Test
	void testRule2() {
		assertEquals("afa.", Practice007.rule2("afa.??//@#$%"));
		assertEquals("____", Practice007.rule2("&*#____+++:>?"));
		assertEquals("", Practice007.rule2("$&$%&*$%^@#$"));
		assertEquals("___", Practice007.rule2(")(_+)__)+{}{}}{}"));
		assertEquals("e3errtty", Practice007.rule2("e3e#r$r%t%t^y^"));
	}

	@Test
	void testRule3() {
		assertEquals("d.d", Practice007.rule3("d..d"));
		assertEquals("d.d", Practice007.rule3("d............................................d"));
		assertEquals("d.d.d.d.d.d", Practice007.rule3("d...d...d........d...d...d"));
	}

	@Test
	void testRule4() {
		assertEquals("dodo", Practice007.rule4(".dodo."));
		assertEquals("dodo", Practice007.rule4("dodo."));
		assertEquals("dodo", Practice007.rule4(".dodo"));
	}

	@Test
	void testRule5() {
		assertEquals("a", Practice007.rule5(""));
	}

	@Test
	void testRule6() {
		assertEquals("123456789012345", Practice007.rule6("123456789012345678901234567892222222222222222222222222222222"));
		assertEquals("asdfasdfasdfasd", Practice007.rule6("asdfasdfasdfasdfafd2222222222222"));
		assertEquals("123", Practice007.rule6("123"));
		
	}

	@Test
	void testRule7() {
		assertEquals("eee", Practice007.rule7("e"));
		assertEquals("err", Practice007.rule7("er"));
	}

	@Test
	void testSolution() {
		assertEquals("bat.y.abcdefghi", Practice007.solution("...!@BaT#*..y.abcdefghijklm"));
		assertEquals("z--", Practice007.solution("z-+.^."));
		assertEquals("aaa", Practice007.solution("=.="));
		assertEquals("123_.def", Practice007.solution("123_.def"));
		assertEquals("abcdefghijklmn", Practice007.solution("abcdefghijklmn.p"));
	}

}
