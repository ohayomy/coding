package p5static;

public class P1Student {
	
	static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public P1Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	
}

//	�ٲ㼭�� �ȵǴ� ���ʹ� ����
//static������ ���α׷��� �޸𸮿� �ε�ɶ� �����Ϳ���(�������)�� �޸𸮿� �����Ǹ�, �ν��Ͻ��� ������ ������� Ŭ�����̸����� ���� �����ϱ� ������ Ŭ���� ������� �Ѵ�.
//��������� �ٸ����� �ν��Ͻ� ������� �Ѵ�.