package p12interface;

public class Shop implements InterfaceBuy, InterfaceSell {

	public void sell() {
		System.out.println("판매하기");
	}

	public void buy() {
		System.out.println("구매하기");
	}
	
	public void order() {
		System.out.println("고객 주문");
	}
	//동일한 디폴트메서드명이 중복되므로 오버라이딩을 통해 오류를 없애주었다.
}
