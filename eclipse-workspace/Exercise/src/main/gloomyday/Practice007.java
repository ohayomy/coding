package gloomyday;

public class Practice007 {

	static String rule1(String s) {	// �ҹ��ڸ����
		return s.toLowerCase();
	}

	static String rule2(String s) {	//������ ���� �ܴ� ����
		s = s.replaceAll("[~!@#$%^&\\*()=+\\[{\\]}:\\?,<>/]", "");
//		s = s.replaceAll("[\\W+&&[^-_\\.]]", "");
		return s;

	}

	static String rule3(String s) { 		//���ԽĿ��� .�� ����� 1���� �ǹ��ϱ⵵ �Ѵ�.
		s = s.replaceAll("[.]{2,}", ".");	//{X}�� Xȸ �ݺ��̸� {X,}�� Xȸ �̻� �ݺ�,{X,Y}�� Xȸ �̻� Yȸ ������ �ݺ��� ���Ѵ�.
		return s;								
	}
//	static String rule3(String s) {
//		s = s.replaceAll("\\.+", "\\.");
//		return s;
//	}

	static String rule4(String s) {	//replace�� ���ڿ��� ��ȯ����������, replaceAll�� ���ԽĿ��� ���밡���ϴٴ� ���̰� �ִ�.
		s = s.replaceAll("^[.]", "");
		s = s.replaceAll("[.]$", "");
		//���Խ� ���
		return s;
	}

	static String rule5(String s) {		//������ �� a�߰�
		if(s.equals(""))
		s = "a";
		return s;
	}

	static String rule6(String s) {		//15�� �Ѵ°�� �ڸ���
		if(s.length() > 15)
			s= s.substring(0, 15);
		
		if(s.endsWith(".")) {
			s = s.substring(0, (s.length() - 1));
		}
		//�̹��� ���Խ� ��� x
		return s;
	}

	static String rule7(String s) {		//2�� �����϶� ���������� �����ؼ� 3���ڸ����
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
