package p11abstract;

public class DeskTop extends Computer {
	//�߻�Ŭ������ ����Ŭ�������� ���� �����߱⿡ �߻�Ŭ�������ƴ�
	
	@Override          //������̼�(�ּ�)������ �ϸ�, ��Ÿ�� ����ֱ⵵ ��.
	public void display() {
		System.out.println("DeskTop display()");
	}
	
	@Override
	public void typing() {
		System.out.println("DeskTop typing()");

	}
//	public void turnOn() {
//		System.out.println("DeskTop turnOn()");
//		
//	}

}
