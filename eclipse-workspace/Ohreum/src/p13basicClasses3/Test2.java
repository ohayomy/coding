package p13basicClasses3;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person p = new Person();
		
		Class pClass = Class.forName("p13basicClasses3.Person");
		System.out.println(pClass.getName());
		//forName()메서드가 중요하다그래서 한번더써봄
		
		Person p2 = (Person)pClass.newInstance();
		System.out.println(p);
		System.out.println(p2);
		//인스턴스도 생성가능

	}

}
