package practice;

import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;

class Practice007Test {


	@Test
	void ex11() {
		Pattern pattern = Pattern.compile("\\bcat\\b");
		//Pattern
//		Regex는 "\d"와 같이 String으로 표현할 수 있습니다. Pattern은 컴파일된 Regex라고 표현합니다.
//
//		다음과 같이 Regex String을 컴파일하여 Pattern이라는 객체로 만듭니다.
		System.out.println(pattern);
		System.out.println();
	}
	
	@Test
	void ex12() {
		Pattern pattern = Pattern.compile("\\bcat\\b");
		Matcher matcher = pattern.matcher("cat cat cat cattie cat");
		
		int count = 0;
		while(matcher.find()) {
			count++;
			System.out.println("Match number: " + count);
			System.out.println("group(): " + matcher.group());
			System.out.println("start(): " + matcher.start());
			System.out.println("end(): " + matcher.end());
		}
	}
	
//	Matcher
//	Matcher는 match operation을 수행하는 engine입니다.
//	Matcher는 다음과 같이 Pattern 객체로부터 생성됩니다.
//	인자로 패턴을 찾을 문자열을 전달합니다.
	
}





