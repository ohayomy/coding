package p13basicClasses3;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person p = new Person();
		
		Class pClass = Class.forName("p13basicClasses3.Person");
		System.out.println(pClass.getName());
		//forName()�޼��尡 �߿��ϴٱ׷��� �ѹ����ẽ
		
		Person p2 = (Person)pClass.newInstance();
		System.out.println(p);
		System.out.println(p2);
		//�ν��Ͻ��� ��������

	}

}
