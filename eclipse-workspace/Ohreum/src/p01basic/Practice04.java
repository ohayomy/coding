package p01basic;

public class Practice04 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1)
				continue;
			System.out.println(i);
		}
//		�߰�ȣ ���� �� ����(toggle continue)
// 		continue�� ������ ������� ǥ���� �� ������(j�� ���� ������ �� j += 2�� �Ѵٴ���,
//		¦����� i *= 2�� �Ѵٴ���), ��Ƽ�� �ڵ带 ����Կ� ����
//		���� �������� ����ϰ� ���߰�, ���� �� ������ �����Ӵ�.

		
		int sum = 0;
		int num = 1;
		for (int j=0; ;j++) {
			sum += num;
			if(sum >= 100)
				break;
			num++;
		}
		System.out.println(num);
//		break���� �Ἥ ���ǽ��� ���� ����� ���� �� �ִ�.
//		�� n�� �̹� �������� ���̴ϱ� ����Ʈ���� 1�� ���� ���� �ִ´ٴ��� �ϴ� �������� ���� ����
//		����ϰ� ǥ���� �ȴ�.
	}

}
