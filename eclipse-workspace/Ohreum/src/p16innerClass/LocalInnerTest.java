package p16innerClass;


class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runnable = new Runnable() {   //������ �����Ͽ� ����
		
		public void run() {
			System.out.println("runnable");
		}
	};
	
	public Runnable getRunnable(final int i) { //�޼��� �ȿ� ����
		
		final int localNum = 100;       //�޼���ȿ� ������ ���� �޼��忡�� ����� ���� ������ ���ȭ�� �ȴ�.
		
		class MyRunnable implements Runnable{

			@Override
			public void run() {
//				localNum += 100;  //���� :��ǻ� final�� ���ǵȰų� �ٸ����(final�� ���.) ����� �����ϳ� ������ �Ұ��ϴ�.
//				i += 200;        // ����
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
			}
			
		}
		return new MyRunnable();   //���⼭ MyRunnable�̶� �̸��� ��� �������̱⿡ ���ʿ� �͸����Լ��� �Ʒ��� ���� ���������ϴ�.
		
		
//		return new Runnable(){
//			
//
//			public void run() {
//				outNum += 10;
//				System.out.println(outNum);
//				System.out.println(sNum);
//				System.out.println(localNum);
//				System.out.println(i);
//			}
//			
//		};
	}
}


public class LocalInnerTest {
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.getRunnable(20).run();
		
		Runnable runnable = outer.getRunnable(20);
		runnable.run();
		
		outer.runnable.run();
	}

}
