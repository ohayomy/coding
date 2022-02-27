package gloomyday;

public class Practice007 {

	static String rule1(String s) {	// 소문자만들기
		return s.toLowerCase();
	}

	static String rule2(String s) {	//정해진 문자 외는 제거
		s = s.replaceAll("[~!@#$%^&\\*()=+\\[{\\]}:\\?,<>/]", "");
//		s = s.replaceAll("[\\W+&&[^-_\\.]]", "");
		return s;

	}

	static String rule3(String s) { 		//정규식에서 .은 어떤문자 1개를 의미하기도 한다.
		s = s.replaceAll("[.]{2,}", ".");	//{X}는 X회 반복이며 {X,}는 X회 이상 반복,{X,Y}는 X회 이상 Y회 이하의 반복을 말한다.
		return s;								
	}
//	static String rule3(String s) {
//		s = s.replaceAll("\\.+", "\\.");
//		return s;
//	}

	static String rule4(String s) {	//replace는 문자열만 변환가능하지만, replaceAll은 정규식에도 적용가능하다는 차이가 있다.
		s = s.replaceAll("^[.]", "");
		s = s.replaceAll("[.]$", "");
		//정규식 사용
		return s;
	}

	static String rule5(String s) {		//공백일 시 a추가
		if(s.equals(""))
		s = "a";
		return s;
	}

	static String rule6(String s) {		//15자 넘는경우 자르기
		if(s.length() > 15)
			s= s.substring(0, 15);
		
		if(s.endsWith(".")) {
			s = s.substring(0, (s.length() - 1));
		}
		//이번엔 정규식 사용 x
		return s;
	}

	static String rule7(String s) {		//2자 이하일때 마지막문자 복사해서 3글자만들기
		if(s.length() == 2) {
			s = s + s.substring(1,2);
		} else if (s.length() == 1){
			s = s + s.substring(0,1) + s.substring(0,1);
		}
			
		return s;

	}

	static String solution(String new_id) {
		String reNew_id = rule7(rule6(rule5(rule4(rule3(rule2(rule1(new_id)))))));
		
		return reNew_id;
	}

}
