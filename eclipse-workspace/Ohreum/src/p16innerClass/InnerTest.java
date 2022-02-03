package p16innerClass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	private class InClass{
		int inNum = 200;
//		static int sInNum = 100;   //에러 : 내부클래스에서는 스태틱변수를 사용할 수 없다.
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
//		static void sTest() {}     //에러 : 내부클래스에서는 스태틱 메서드를 사용할 수 없다.
	}
	
	public void usingTest() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
//			num += 10; //에러: 외부클래스의 인스턴스변수라서 못씀
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		static void sTest() {
			System.out.println(sNum);
//			System.out.println(iNum); // 에러
			System.out.println(sInNum);
		}
	}
	
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		
		outClass.usingTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();
	}

}
