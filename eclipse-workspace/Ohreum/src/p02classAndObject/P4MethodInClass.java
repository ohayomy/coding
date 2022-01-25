package p02classAndObject;

public class P4MethodInClass {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		
		P1Student studentLee = new P1Student();
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "����";
				
		P1Student studentKim = new P1Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "�ұ���";
				
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
				
	}
}

// �� ��, P1Student�� ������ ������ Ÿ���̶�� �ϸ�, �� ���� ����� ���� studentLee�� ����������� �Ѵ�. ������ ���� new ������ ���� P1Student()�� ����Ʈ���Ͷ�� �Ѵ�.
//������������ ���ø޸𸮿� ���̸�, ���� ����Ʈ���Ϳ� ���� ������ �ν��Ͻ���(studentLee.studentName �����ֵ�)�� ��(Heap)�޸𸮿� �������� �����ȴ�.
//�����Լ����� ��� ���ø޸𸮿� ���̰� �ڵ����� ���������, ���޸𸮰��� ���� ���� ������� �Ѵ�. �������÷��� �����ɷ�
//�������� ����
//������ ȣ�Ⱚ 16�����̰�, 8�ڸ��� �ϳ��� 4��Ʈ(16�����̹Ƿ� 2�� 4���ؼ� 4��Ʈ) �̹Ƿ� 32��Ʈ�̴�. �� 32��Ʈ ¥�� �� �޸� �� �ּҰ��� ���Ѵ�. �̸� �������̶�� �Ѵ�.