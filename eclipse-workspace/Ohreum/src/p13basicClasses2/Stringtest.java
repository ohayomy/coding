package p13basicClasses2;

public class Stringtest {
	public static void main(String[] args) {
		
		String str1 = new String("java"); //문자열은 기본적으로 final로 선언되어있어서 바뀌지않는다.
		String str2 = new String("android");
		
		System.out.println(System.identityHashCode(str1));
		str1 = str1.concat(str2);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1);
		//겉으로는 str1과 str2가 붙은것처럼 보이지만 사실 새로운 javaandroid라는 문자열이 생성되었고 str1의 메모리를 가리켰던 화살표가 그 주소를 가리키고 있을뿐이다.
		//따라서 문자열 연결을 계속하면 메모리에 garbage가 많이생김 
		//이를 해결하기 위한 것이 StringBuilder와 StringBuffer이다. 이들은 final로 선언되지 않아서 연결 변경에 유용하다.
		//내부적으로 가변적인 char[]배열을 가지고있다.
		//toString메서드로 String반환시킬수있다.
	}
}
