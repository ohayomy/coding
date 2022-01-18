package p6singleton;

public class P1Singleton {
	
	private static P1Singleton instance1 = new P1Singleton();
	
	private P1Singleton() {}
	
	public static P1Singleton getInstance() {
		return instance1;
	}
	
	
	
}
// �� �ý��ۿ� �ϳ��� �ν��Ͻ��� �ֵ��� �����ϴ� ���
//1. �ڹٴ� �۷ι� ������ ���⶧���� ����ƽ ���� ���
//2. ������ �������� public default �����ڰ� �ڵ����� �����Ǵ� private�� �����.
//3. �ܺο��� �� �� �־�� �ϹǷ�, public���� ����� ����ƽ �޼��带 �߰��Ѵ�.