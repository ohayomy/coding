package basic;
import javax.xml.ws.soap.MTOMFeature;

public class Practice02 {
	public static void main(String[] args) {
	int num1 = 5;
	int num2 = 10;
	
	int result1 = num1 & num2;
	System.out.println(result1);
//	0101 1010�� and�����ڷ� 0000
	
	
	int result2 = num1 | num2;
	System.out.println(result2);
//	0101 1010�� or�����ڷ� 1111
	
	int result3 = result2 << 2;
	System.out.println(result3);
//	15�� ��������(1111) ���� �ι��̵� �� �������� 0���� ä��� 111100
//	�� 2�� �̵��ߴٴ� ���� 2�� 2���� ���ѰͰ� ����.
	
	int result4 = result2 >> 2;
	System.out.println(result4);
//	1111���� ��ĭ �̵��ϰ� 0011�� �ǹ����鼭 �޺κ� 11�� ©����������.
//	2�� 2������ ������ �������� ���ȴٰ� �� �� �ִ�.
}
}
