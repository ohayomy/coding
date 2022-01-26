package p13basicClasses;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			
			Student std = (Student)obj;
			
			if(studentID == std.studentID)
				return true;
			else
				return false;
		}
		return false;
		
	}
}

public class Equals {
	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); // ���� ���������� ���޸� �ּҰ� �ٸ�
		System.out.println(str1.equals(str2)); // �׷��� ���ڿ��� ���� �� �������� ����(String������ �������� �����ǵǾ��ֱ� ����)
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);     //�޸��ּҰ� �ٸ�.
		System.out.println(std1.equals(std2)); //�����Ȱ��� �ٸ�. �׷��� �������ϰ��� ��.(��ġ�� �ߺ������� ��������)
	}

}
