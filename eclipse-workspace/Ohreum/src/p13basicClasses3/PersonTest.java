package p13basicClasses3;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass();
		
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("p13basicClasses3.Person"); //���ڿ��� �־ �ִ��������� ��ǻ�Ϳ��� Ȯ�ν�Ű��, ������ �ε���Ŵ.
		
		System.out.println(pClass3.getName());

		//Ŭ������ ȣ���ϴ� Ŭ���� 3���� ���.
	}

}
