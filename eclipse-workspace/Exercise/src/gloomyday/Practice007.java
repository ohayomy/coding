package gloomyday;

public class Practice007 {

	static String rule1(String s) {
		return s.toLowerCase();
	}

	static String rule2(String s) {
		return s;

	}

	static String rule3(String s) { 	//���� 3���̻��� ��� ����ϱ�
		s = s.replace("..", ".");		//���ԽĿ��� .�� ����� 1���� �ǹ��ϱ⵵ �ϹǷ�, ���Խ����� �ϸ�ȵȴ�.
		s = s.replace("..", ".");		//���� replaceAll�� �ƴ� replace�� ���.
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

	static String rule4(String s) {	//replace�� ���ڿ��� ��ȯ����������, replaceAll�� ���ԽĿ��� ���밡���ϴٴ� ���̰� �ִ�.
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
