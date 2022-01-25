package p12interface3;

class A {
	public void method(I i) {  //인터페이스 I를 구현한 클래스들만 들어올 수 있다
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}
class C implements I {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
//		a.method(new B());
		a.method(new C());
	}
}

//장점 1. A와 B,C의 개발이 별개이므로(A는 추상메서드 I를 호출해서 코드를 작성할 수 있으며 B,C는 I를 구현하는 코드를 작성) 분업가능하다.
// 2. 변경에 유리한 설계가 가능하다.(말그대로 A와 B,C간의 직접적인 관계가 없기 때문에 B에서 C로 바뀌어도 A에는 변화가 없다.)
//3. 표준화가 가능하다. JVM의 역할과 비슷하다고 보면된다.(OS와 관계없이 모두 자바가 작동하게 만드는.)
//4. 서로 관계없는 클래스들을 관계를 맺어줄 수 있다. (사진 참조)
