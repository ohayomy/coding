package p12interface;

public interface InterfaceBuy {
	void buy();
	
	default void order() {
		System.out.println("구매주문");
	}
}
