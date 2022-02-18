package practice;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Practice003Test {
	//아래 예제에서 replaceAll(regex, replacement)은 regex와 일치하는 내용을 replacement로 교체합니다.
	//자바에서 \를 표현하려면 \\처럼 사용해야 합니다.
	@Test
	void ex2() {
		assertEquals("kk cat sat on kk mat.", "The cat sat on the mat.".replaceAll("[Tt]he", "kk"));
		assertEquals("kk cat sat on the mat.","The cat sat on the mat.".replaceAll("^[Tt]he", "kk"));
	}
	//^는 문자열의 시작지점을 찾습니다. 따라서 ^ 다음으로 오는 패턴으로 문자열이 시작되는 것을 찾습니다. 
	@Test
	void ex3() {
		assertEquals("The dd sat on the dd","The cat sat on the cat".replaceAll("cat", "dd"));
		assertEquals("The cat sat on the dd","The cat sat on the cat".replaceAll("cat$", "dd"));
	}
	//$는 문자열의 종료지점을 찾습니다. 따라서 $ 앞의 패턴으로 문자열이 끝나는 것을 찾습니다.
}
