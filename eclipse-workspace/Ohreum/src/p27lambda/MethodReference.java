package p27lambda;

import java.util.function.Function;

public class MethodReference { //	=	Ŭ�����̸�::�޼����̸�
	// �ϳ��� �޼��常 ȣ���ϴ� ���ٽ��� '�޼��� ����'�� ������ ���� �� �ִ�.
	//	static�޼��� ������ �ν��Ͻ� �޼��������� �ִ�.
	
	public static void main(String[] args) {
		
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		
		Function<String, Integer> f2 = Integer::parseInt;
	}
}
