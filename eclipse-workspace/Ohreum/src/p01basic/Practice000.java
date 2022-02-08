package p01basic;


public class Practice000{
	
	void method(Practice001 p) {
		p.something();
	}
	
	static Practice001 p = () -> System.out.println("something");

	
	
	
	
	public static void main(String[] args) {
		Practice000 aaa = new Practice000();
//		aaa.method(() -> System.out.println("something"));
		
		p.something();
		
	
	}



}
