package practice;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Practice004Test {
	@Test
	void ex4() {
		assertEquals("Thtt ttland tt good","This island is good".replaceAll("is", "tt"));
		assertEquals("This island tt good","This island is good".replaceAll("\\bis\\b", "tt"));
	}
	
	
	// \b�� �ܾ��� ��輱�� ã�� ������ �մϴ�. ������ ���ø� ��輱�� �ǹ̰� �������� ������ �� �ֽ��ϴ�. 
	// �ܾ� �� ���� \b�� ����Ͽ� �ٸ� ���ڿ� ���յ��� ����, �������� �ܾ ã�� �� �ֽ��ϴ�.
	
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
		
		
//		\d	0~9 ������ ����, [0-9]�� ����
//		\D	���ڰ� �ƴ� � ����, [^0-9]�� ����
//		\s	whitespace 1��, \t,\n,\x0b,\r,\f �� ����
//		\S	whitespace�� ������ ����
//		\w	Alphanumeric(alphabet, ����) ����, [a-zA-Z_0-9]�� ����
//		\W	Alphanumeric�� ������ ����(whitespace ��)
	}
}
