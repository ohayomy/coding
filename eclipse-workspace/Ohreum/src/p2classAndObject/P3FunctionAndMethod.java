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

//	�����Լ��� �����Լ��� ȣ���� �����̸�, ���� ���ǵ� �����Լ��� ������(num1, num2, sum)�� ���� �޸𸮸� �����ϰ� ���߿� ���ǵ� �����Լ��� ������(n1, n2, result)�� �����ϴ� �޸𸮴� �� ���� ���̴� ������ �ȴ�. �̸� ���ø޸𸮶���Ѵ�. ȣ���� ������ ���� ���� �׿��� �����Լ� �޸𸮰� �ڿ����� ��������, �����Լ��� ���� �ȴ�.
	
