package p12interface3;

class A {
	public void method(I i) {  //�������̽� I�� ������ Ŭ�����鸸 ���� �� �ִ�
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}
class C implements I {
	public void method() {
		System.out.println("CŬ������ �޼���");
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
//		a.method(new B());
		a.method(new C());
	}
}

//���� 1. A�� B,C�� ������ �����̹Ƿ�(A�� �߻�޼��� I�� ȣ���ؼ� �ڵ带 �ۼ��� �� ������ B,C�� I�� �����ϴ� �ڵ带 �ۼ�) �о������ϴ�.
// 2. ���濡 ������ ���谡 �����ϴ�.(���״�� A�� B,C���� �������� ���谡 ���� ������ B���� C�� �ٲ� A���� ��ȭ�� ����.)
//3. ǥ��ȭ�� �����ϴ�. JVM�� ���Ұ� ����ϴٰ� ����ȴ�.(OS�� ������� ��� �ڹٰ� �۵��ϰ� �����.)
//4. ���� ������� Ŭ�������� ���踦 �ξ��� �� �ִ�. (���� ����)
