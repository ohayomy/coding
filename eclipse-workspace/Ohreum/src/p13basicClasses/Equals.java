package p13basicClasses;

public class Equals {
	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); // ���� ���޸� �ּҰ� �ٸ�
		System.out.println(str1.equals(str2)); // �׷��� ���ڿ��� ġȯ���� �� �������� ����.
		
	}
}
