package p12interface;

public interface InterfaceSell {
	void sell();
	
	default void order() {
		System.out.println("�Ǹ��ֹ�");
	}
}
