package p01basic;

public class Casting {

	public static void main(String[] args) {
		int a = 1;
		double b = 1;       //�� �ս��� �����Ƿ� �ڵ���ȯ
		double b2 = (double) 1;  //������ȯ
		
		System.out.println(b);
		System.out.println(b2);

		
//		int c = 1.1;
//���⿡ �ּ��� Ǯ�� �����ٿ� ���콺�� ��� �ΰ��� ����� ���õȴ�. ���� Ŭ���غ���.
		double d = 1.1;   // 1. ����� �ٲ��.
		int e = (int) 1.1;  // 2. ���ս� �����ϰ� ������ȯ���ش�.
		System.out.println(e);
		
		String f = Integer.toString(1);
		System.out.println(f.getClass());
//		1�� ���ڿ��� �ٲ��. getClass�޼��带 ����� ���ڿ����� Ȯ���� �� �ִ�.
		
		
		
		
		
	}

}
