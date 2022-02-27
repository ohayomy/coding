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
		//패턴에 그룹을 지정할 수 있습니다. 그룹은 ()로 지정하며, 
		//그룹을 표현할 때는 $1처럼 $다음에 그룹의 번호를 입력합니다. 패턴에서 가장 왼쪽 그룹이 1번으로 시작합니다.
		
	}
	
	
	
	
//	String 클래스는 Regex를 지원하는 메소드들이 있습니다.
//	String.matches(regex)					String이 regex와 일치하면 true 리턴
//	String.split(regex)						regex와 일치하는 것을 기준으로 String을 분리하여 배열로 리턴
//	String.replaceFirst(regex, replacement)	regex와 가장 먼저 일치하는 것을 replacement로 변환
//	String.replaceAll(regex, replacement)	regex와 일치하는 모든 것을 replacement로 변환
	
	//matches와 replaceAll은 앞에서 했고,
	
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
