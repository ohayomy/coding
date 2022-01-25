package p12interface;

public class ShopTest {
	public static void main(String[] args) {
		
		Shop shop = new Shop();
		
		InterfaceBuy buyer = shop;
//		InterfaceBuy buyer = new Shop();  �� �������̴�.
//buyer�� Shop�� �ν��Ͻ����� ������Ÿ���� InterfaceBuy�̹Ƿ� ������ �޼��常�� ����� �� �ִ�.
		buyer.buy();
		
		InterfaceSell seller = shop;
		seller.sell();
		
		
		shop.order();
		buyer.order();
		seller.order();
		//�������̵����� ȹ��ȭ�ؼ� ��ΰ� ���� ������� ��µȴ�. buyer�� seller�� ������Ÿ���� �������̽���� �ؼ�
		//�Ǹ��ֹ�, �����ֹ��̶�� ��µǴ� ���� �ƴϴ�. �ٺ������� Shop�� �ν��Ͻ��̱� ����.
	}
}
