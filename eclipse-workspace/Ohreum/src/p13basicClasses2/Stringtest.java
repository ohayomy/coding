package p13basicClasses2;

public class Stringtest {
	public static void main(String[] args) {
		
		String str1 = new String("java"); //���ڿ��� �⺻������ final�� ����Ǿ��־ �ٲ����ʴ´�.
		String str2 = new String("android");
		
		System.out.println(System.identityHashCode(str1));
		str1 = str1.concat(str2);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1);
		//�����δ� str1�� str2�� ������ó�� �������� ��� ���ο� javaandroid��� ���ڿ��� �����Ǿ��� str1�� �޸𸮸� �����״� ȭ��ǥ�� �� �ּҸ� ����Ű�� �������̴�.
		//���� ���ڿ� ������ ����ϸ� �޸𸮿� garbage�� ���̻��� 
		//�̸� �ذ��ϱ� ���� ���� StringBuilder�� StringBuffer�̴�. �̵��� final�� ������� �ʾƼ� ���� ���濡 �����ϴ�.
		//���������� �������� char[]�迭�� �������ִ�.
		//toString�޼���� String��ȯ��ų���ִ�.
	}
}
