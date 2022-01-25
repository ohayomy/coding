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
//보다싶이 MyInterface가 X와 Y를 상속받기때문에 X와 Y의 구현메서드까지 자동으로 뜬다.
	
	public static void main(String[] args) {
		
		X xClass = new MyClass();
		xClass.x();
	}
	
}
