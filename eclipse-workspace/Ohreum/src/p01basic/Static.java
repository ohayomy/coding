package p01basic;

class Foo {
	public static String classVar = "Im class var"; // static ������ Ŭ�����Ҽ� ����
	public String instanceVar = "Im instance Var";  // static ������ �ν��Ͻ� �Ҽ� ����
	
	public static void classMethod() {
		System.out.println(classVar); // OK :Ŭ�����޼��忡���� Ŭ���������� �����̵ȴ�.
//		System.out.println(instanceVar); // Error : Ŭ�����޼��忡�� �ν��Ͻ��������� ������ �ȵȴ�.
	}
	public void instanceMethod() {
		System.out.println(classVar); // OK  :�ν��Ͻ��޼���� �Ѵ� ���ٵȴ�.
		System.out.println(instanceVar); // OK
	}
}

public class Static {
	
	public static void main(String[] args) {
			System.out.println(Foo.classVar); // OK :Ŭ������ ���ؼ� Ŭ���������� ������ �翬�� �ȴ�.
	//		System.out.println(Foo.instanceVar); // Error :Ŭ������ ���ؼ� �ν��Ͻ��������� �����̾ȵȴ�.
			Foo.classMethod(); // OK
	//		Foo.instanceMethod(); // Error
			
			Foo f1 = new Foo();
			Foo f2 = new Foo();
			
			System.out.println(f1.classVar); // Im class var
			System.out.println(f1.instanceVar); // Im instance var
			
			f1.instanceMethod(); //�̰͵� �ȴ�..
			
			f1.classVar = "changed by f1"; // �ν��Ͻ����� Ŭ���������� �մ�� �ٹٲ��. ������ �����̱� ������.
			System.out.println(Foo.classVar); // changed by f1
			System.out.println(f2.classVar); // changed by f1
			
			f1.instanceVar = "changed by f1"; // �ν��Ͻ����� �ν��Ͻ������� �մ�� �װ͸� �ٲ��. ������ �����̱� ����.
			System.out.println(f1.instanceVar); // changed by f1
			System.out.println(f2.instanceVar); // Im instance var
			
			
			
	
	}
}
