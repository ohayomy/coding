package p13basicClasses;

class Student2 {
	int studentID;
	String studentName;
	
	Student2(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	public int hashCode() {
		return studentID;
	}
}


public class HashCode {
//hashCode�޼��� : ������ ����, �˻��ϱ� ���� ����ϴ� �ڷᱸ��. �ڷ��� Ư�� Ű���� ���� ���� ��ġ�� ��ȯ���ִ� �ؽ� �Լ��� �����.
	//�� �޸𸮿� �ν��Ͻ��� ����Ǵ� ����� hash�̴�.
	//equals�� ���弱�̶�� ����ȴ�. �ᱹ equals���� hashCode��ȯ���� ������ true�̰� �ٸ��� false���� ����.
	//equals�� ���������� ���� hashCode�� ���������ִ°� �����̴�. �Ǵٸ� ���μ������� ������ �� �� �ֱ⶧��.
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		Student2 std1 = new Student2(10001, "Tomas");
		Student2 std2 = new Student2(10001, "Tomas");
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());//���� �� ���� �ٸ����� studentID�� ���� �����������.
		
		System.out.println(System.identityHashCode(std2)); // �̰� ������ �ؽ��ڵ��ε� �����ǵ����ʾ��� ���� �̰Ͱ� ���� ����.
		System.out.println("=============");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); //��Ʈ������ ���� ������ �ؽ��ڵ尡 ��Ʈ��Ŭ�������� �����ǵǾ��ֱ⶧��.
		System.out.println("=============");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); // ������ ������ ���� �ٸ���.
	}

}
