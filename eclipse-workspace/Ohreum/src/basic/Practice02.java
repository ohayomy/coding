package basic;
import javax.xml.ws.soap.MTOMFeature;

public class Practice02 {
	public static void main(String[] args) {
	int num1 = 5;
	int num2 = 10;
	
	int result1 = num1 & num2;
	System.out.println(result1);
//	0101 1010을 and연산자로 0000
	
	
	int result2 = num1 | num2;
	System.out.println(result2);
//	0101 1010을 or연산자로 1111
	
	int result3 = result2 << 2;
	System.out.println(result3);
//	15의 이진수를(1111) 왼쪽 두번이동 후 오른쪽을 0으로 채우니 111100
//	즉 2번 이동했다는 것은 2의 2승을 곱한것과 같다.
	
	int result4 = result2 >> 2;
	System.out.println(result4);
//	1111에서 두칸 이동하고 0011이 되버리면서 뒷부분 11은 짤려없어진다.
//	2의 2승으로 나누고 나머지를 버렸다고 볼 수 있다.
}
}
