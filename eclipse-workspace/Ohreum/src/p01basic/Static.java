package p01basic;

class Foo {
	public static String classVar = "Im class var"; // static 있으면 클래스소속 변수
	public String instanceVar = "Im instance Var";  // static 없으면 인스턴스 소속 변수
	
	public static void classMethod() {
		System.out.println(classVar); // OK :클래스메서드에서는 클래스변수에 접근이된다.
//		System.out.println(instanceVar); // Error : 클래스메서드에서 인스턴스변수에는 접근이 안된다.
	}
	public void instanceMethod() {
		System.out.println(classVar); // OK  :인스턴스메서드는 둘다 접근된다.
		System.out.println(instanceVar); // OK
	}
}

public class Static {
	
	public static void main(String[] args) {
			System.out.println(Foo.classVar); // OK :클래스를 통해서 클래스변수에 접근은 당연히 된다.
	//		System.out.println(Foo.instanceVar); // Error :클래스를 통해서 인스턴스변수에는 접근이안된다.
			Foo.classMethod(); // OK
	//		Foo.instanceMethod(); // Error
			
			Foo f1 = new Foo();
			Foo f2 = new Foo();
			
			System.out.println(f1.classVar); // Im class var
			System.out.println(f1.instanceVar); // Im instance var
			
			f1.instanceMethod(); //이것도 된다..
			
			f1.classVar = "changed by f1"; // 인스턴스에서 클래스변수에 손대면 다바뀐다. 참조의 형태이기 때문에.
			System.out.println(Foo.classVar); // changed by f1
			System.out.println(f2.classVar); // changed by f1
			
			f1.instanceVar = "changed by f1"; // 인스턴스에서 인스턴스변수에 손대면 그것만 바뀐다. 복제의 형태이기 때문.
			System.out.println(f1.instanceVar); // changed by f1
			System.out.println(f2.instanceVar); // Im instance var
			
			
			
	
	}
}
