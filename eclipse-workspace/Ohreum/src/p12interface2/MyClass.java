package p12interface2;

public class MyClass implements MyInterface{

	@Override
	public void x() {
		System.out.println("x()");
		
	}

	@Override
	public void y() {
		System.out.println("y()");
		
	}

	@Override
	public void myMethod() {
		System.out.println("MyMethod()");
		
	}
//���ٽ��� MyInterface�� X�� Y�� ��ӹޱ⶧���� X�� Y�� �����޼������ �ڵ����� ���.
	
	public static void main(String[] args) {
		
		X xClass = new MyClass();
		xClass.x();
	}
	
}
