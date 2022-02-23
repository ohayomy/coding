package gloomyday;

public class Practice007 {

	static String rule1(String s) {
		return s.toLowerCase();
	}

	static String rule2(String s) {
		return s;

	}

	static String rule3(String s) { 	//연속 3개이상일 경우 고려하기
		s = s.replace("..", ".");		//정규식에서 .은 어떤문자 1개를 의미하기도 하므로, 정규식으로 하면안된다.
		s = s.replace("..", ".");		//따라서 replaceAll이 아닌 replace를 썼다.
		s = s.replace("..", ".");
		s = s.replace("..", ".");
		s = s.replace("..", ".");
		s = s.replace("..", ".");
		s = s.replace("..", ".");
		s = s.replace("..", ".");
		s = s.replace("..", ".");
		s = s.replace("..", ".");
		return s;
	}

	static String rule4(String s) {	//replace는 문자열만 변환가능하지만, replaceAll은 정규식에도 적용가능하다는 차이가 있다.
		s = s.replaceAll("^.", "");
		s = s.replaceAll(".$", "");
		return s;

	}

	static String rule5(String s) {
		if(s.equals(""))
		s = "a";
		return s;
	}

	static String rule6(String s) {
		if(s.length() > 15)
			s= s.substring(0, 15);
		return s;
	}

	static String rule7(String s) {
		if(s.length() = 3) {
			
		} else if (s.length() = 2){
			
		}
			
		return s;

	}

	String solution(String new_id) {
		return new_id;
		
	}

	public static void main(String[] args) {
		System.out.println(rule3("d............................................d"));
		System.out.println(rule6("123456789012345678901234567892222222222222222222222222222222"));
	}
}
