package p13basicClasses3;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass();
		
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("p13basicClasses3.Person"); //문자열로 넣어서 있는지없는지 컴퓨터에게 확인시키고, 있을시 로딩시킴.
		
		System.out.println(pClass3.getName());

		//클래스를 호출하는 클래스 3가지 방법.
	}

}
