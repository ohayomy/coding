package p11abstract;

public abstract class Computer {
	//�߻�޼��尡 �ϳ��� ������ abstract�� �ٿ�����
	//�߻�Ŭ������ �ν��Ͻ��� ����.
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�");
	}

}
