package p12interface;

public class ShopTest {
	public static void main(String[] args) {
		
		Shop shop = new Shop();
		
		InterfaceBuy buyer = shop;
//		InterfaceBuy buyer = new Shop();  과 같은말이다.
//buyer는 Shop의 인스턴스지만 데이터타입은 InterfaceBuy이므로 한정된 메서드만을 사용할 수 있다.
		buyer.buy();
		
		InterfaceSell seller = shop;
		seller.sell();
		
		
		shop.order();
		buyer.order();
		seller.order();
		//오버라이딩으로 획일화해서 모두가 같은 결과값이 출력된다. buyer나 seller의 데이터타입이 인터페이스라고 해서
		//판매주문, 구매주문이라고 출력되는 것은 아니다. 근본적으로 Shop의 인스턴스이기 때문.
	}
}
