package p01basic;

public class Casting {

	public static void main(String[] args) {
		int a = 1;
		double b = 1;       //값 손실이 없으므로 자동변환
		double b2 = (double) 1;  //수동변환
		
		System.out.println(b);
		System.out.println(b2);

		
//		int c = 1.1;
//여기에 주석을 풀고 빨간줄에 마우스를 대면 두가지 방법이 제시된다. 각각 클릭해보자.
		double d = 1.1;   // 1. 더블로 바뀐다.
		int e = (int) 1.1;  // 2. 값손실 감안하고 수동변환해준다.
		System.out.println(e);
		
		String f = Integer.toString(1);
		System.out.println(f.getClass());
//		1을 문자열로 바꿨다. getClass메서드를 사용해 문자열임을 확인할 수 있다.
		
		
		
		
		
	}

}
