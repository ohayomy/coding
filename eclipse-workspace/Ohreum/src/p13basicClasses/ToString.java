package p13basicClasses;

class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String toString() { //toString �޼��带 �������� ���.
		return title + "," + author;
	}
}

public class ToString { //��������
	public static void main(String[] args) {
		
		Book book = new Book("�غ���ī��ī","�Ϸ�Ű");
		System.out.println(book.toString()); // (p01basic.Static.java ����)
		//�ν��Ͻ��� ���ؼ� �ν��Ͻ��޼��带 ȣ���� ���. �� �ν��Ͻ��޼���� toString�� �������̰�, ����
		//�ּҰ��� �ƴ϶� ����� ���ڰ� ��µȴ�.
		
		String str = new String("test");
		System.out.println(str); //���� �ٸ��� �� ���� �ٷ� ����Ǵ� ������, StringŬ���������� �̹� toString�޼��尡
		//���ڿ� �ڱ� �ڽ��� ����ϵ��� �����Ǹ� ��ģ �����̱� �����̴�.
		
		System.out.println(book);
		//book�� �־ ������µǴ� ������, println�� ��Ʈ�� ��Ŭ���ؼ� ���� �� ���ֵ��� println(Object)�ÿ���
		//valueOf�� null�� �ƴ� �� toString�� ȣ���ϴ� �޼����̱� ������ �ּҰ��� ���;� ������
		//toString�� �������߱⿡ ������ ���´�.
	}
}
