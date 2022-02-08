package p01basic;

public class Practice002 {

	Practice001 method() {
		Practice001 p = () -> System.out.println("bbb");
		return p;
//		return () -> {System.out.println("bbb")};
	}
	
//	Practice001 p = () -> System.out.println("bbb");
//	Practice001 p;
	
	public static void main(String[] args) {
		Practice002 aaa = new Practice002();
			
			Practice001 p = aaa.method();
			p.something();
			

	}


}
