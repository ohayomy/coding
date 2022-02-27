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
//		Regex�� "\d"�� ���� String���� ǥ���� �� �ֽ��ϴ�. Pattern�� �����ϵ� Regex��� ǥ���մϴ�.
//
//		������ ���� Regex String�� �������Ͽ� Pattern�̶�� ��ü�� ����ϴ�.
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
//	Matcher�� match operation�� �����ϴ� engine�Դϴ�.
//	Matcher�� ������ ���� Pattern ��ü�κ��� �����˴ϴ�.
//	���ڷ� ������ ã�� ���ڿ��� �����մϴ�.
	
}





