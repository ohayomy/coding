package p12interface;

public class Shop implements InterfaceBuy, InterfaceSell {

	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}

	public void buy() {
		System.out.println("�����ϱ�");
	}
	
	public void order() {
		System.out.println("�� �ֹ�");
	}
	//������ ����Ʈ�޼������ �ߺ��ǹǷ� �������̵��� ���� ������ �����־���.
}
