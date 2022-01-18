package p2classAndObject;

public class P3FunctionAndMethod {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}
	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

}

//	메인함수가 덧셈함수를 호출한 형태이며, 먼저 정의된 메인함수의 변수들(num1, num2, sum)이 먼저 메모리를 차지하고 나중에 정의된 덧셈함수의 변수들(n1, n2, result)이 차지하는 메모리는 그 위에 쌓이는 모양새가 된다. 이를 스택메모리라고한다. 호출이 끝나면 메인 위에 쌓였던 덧셈함수 메모리가 자연스레 없어지며, 메인함수만 남게 된다.
	
