package p13basicClasses;

public class Equals {
	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); // 서로 힙메모리 주소가 다름
		System.out.println(str1.equals(str2)); // 그러나 문자열로 치환했을 때 논리적으로 같음.
		
	}
}
