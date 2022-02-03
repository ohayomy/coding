package p16innerClass;


class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runnable = new Runnable() {   //변수에 대입하여 구현
		
		public void run() {
			System.out.println("runnable");
		}
	};
	
	public Runnable getRunnable(final int i) { //메서드 안에 구현
		
		final int localNum = 100;       //메서드안에 구현할 때는 메서드에서 선언된 로컬 변수가 상수화가 된다.
		
		class MyRunnable implements Runnable{

			@Override
			public void run() {
//				localNum += 100;  //에러 :사실상 final로 정의된거나 다름없어서(final이 없어도.) 사용은 가능하나 변경은 불가하다.
//				i += 200;        // 에러
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
			}
			
		}
		return new MyRunnable();   //여기서 MyRunnable이란 이름은 잠깐 쓰고말것이기에 애초에 익명내부함수로 아래와 같이 생략가능하다.
		
		
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
