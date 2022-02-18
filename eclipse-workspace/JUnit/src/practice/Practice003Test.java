package practice;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Practice003Test {
	//�Ʒ� �������� replaceAll(regex, replacement)�� regex�� ��ġ�ϴ� ������ replacement�� ��ü�մϴ�.
	//�ڹٿ��� \�� ǥ���Ϸ��� \\ó�� ����ؾ� �մϴ�.
	@Test
	void ex2() {
		assertEquals("kk cat sat on kk mat.", "The cat sat on the mat.".replaceAll("[Tt]he", "kk"));
		assertEquals("kk cat sat on the mat.","The cat sat on the mat.".replaceAll("^[Tt]he", "kk"));
	}
	//^�� ���ڿ��� ���������� ã���ϴ�. ���� ^ �������� ���� �������� ���ڿ��� ���۵Ǵ� ���� ã���ϴ�. 
	@Test
	void ex3() {
		assertEquals("The dd sat on the dd","The cat sat on the cat".replaceAll("cat", "dd"));
		assertEquals("The cat sat on the dd","The cat sat on the cat".replaceAll("cat$", "dd"));
	}
	//$�� ���ڿ��� ���������� ã���ϴ�. ���� $ ���� �������� ���ڿ��� ������ ���� ã���ϴ�.
}
