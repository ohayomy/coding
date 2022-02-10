public class Practice005 {
	static int a = 3; // 정적 필드
	int b; // 인스턴스 필드
	Practice005(int a, int b){
		this.a = a; // 매개값 할당
		this.b = b; // 매개값 할당
	}
	public String print(){
		String value = "a : " + a + ", b : " + b;
		return value;
	}
	
	public static void main(String[] args) {
		Practice005 sm = new Practice005(1, 2);
		Practice005 sm1 = new Practice005(2, 3);
		Practice005 sm2 = new Practice005(3, 4);
		System.out.println(sm.print()); // a : 3, b : 2
		System.out.println(sm1.print()); // a : 3, b : 3
		System.out.println(sm2.print()); // a : 3, b : 4
	}
}