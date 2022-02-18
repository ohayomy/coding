package practice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Practice005Test {
	@Test
	void ex7() {
		String s = "a*[0-9]*";
		assertTrue("aaa123".matches(s));
		assertTrue("aaa".matches(s));
		assertFalse("a*[0-9]*".matches(s)); //�̰� �ȵǴ� ������ matches�޼��尡 ����ǥ���İ� �´����� �Ǻ��ϱ� �����̴�.
		
		s = "a*[0-9]+";
		assertTrue("aaa123".matches(s));
		assertFalse("aaa".matches(s));
		//*�� * ���� ��Ұ� 0�̻� �ݺ��Ǵ� ���� �ǹ��մϴ�.
		//+�� 1�̻� �ݺ��Ǵ� ���� �ǹ��մϴ�. �̰��� ��Ұ� 1���� ������ ���ϰ� ��ġ���� �ʴ´ٴ� �ǹ��Դϴ�.
		
		s = "a*[0-9]?";
		assertTrue("aaa".matches(s));
		assertFalse("aaa12".matches(s));
		
		s = "a*[0-9]{0,1}";
		assertTrue("aaa1".matches(s));
		assertFalse("aaa123".matches(s));
		//?�� ��Ұ� 0 �Ǵ� 1ȸ�� �ݺ��Ǵ� ���� �ǹ��մϴ�.
		//{X,Y}�� X~Y ������ ����ŭ �ݺ��ȴٴ� ���� �ǹ��ϸ�, ������ ���ڿ� 1���� ó���ߴ� ���� ��� ǥ���� �� �ֽ��ϴ�.
		//�������� {0,1}�� ?�� ������ �ǹ��Դϴ�.
	}
	
}
