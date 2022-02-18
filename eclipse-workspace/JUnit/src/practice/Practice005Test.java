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
		assertFalse("a*[0-9]*".matches(s)); //이게 안되는 이유는 matches메서드가 정규표현식과 맞는지를 판별하기 때문이다.
		
		s = "a*[0-9]+";
		assertTrue("aaa123".matches(s));
		assertFalse("aaa".matches(s));
		//*은 * 앞의 요소가 0이상 반복되는 것을 의미합니다.
		//+는 1이상 반복되는 것을 의미합니다. 이것은 요소가 1개도 없으면 패턴과 일치하지 않는다는 의미입니다.
		
		s = "a*[0-9]?";
		assertTrue("aaa".matches(s));
		assertFalse("aaa12".matches(s));
		
		s = "a*[0-9]{0,1}";
		assertTrue("aaa1".matches(s));
		assertFalse("aaa123".matches(s));
		//?는 요소가 0 또는 1회만 반복되는 것을 의미합니다.
		//{X,Y}는 X~Y 사이의 수만큼 반복된다는 것을 의미하며, 위에서 문자열 1개로 처리했던 것을 모두 표현할 수 있습니다.
		//예제에서 {0,1}은 ?와 동일한 의미입니다.
	}
	
}
