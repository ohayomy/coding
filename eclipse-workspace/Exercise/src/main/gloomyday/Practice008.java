package gloomyday;

public class Practice008 {
	
	static int numberWithSign(int num) {
		int count = 0;
		for(int i = 2; i <= (num / 2); i++) { 	// ��� �� 1�� �ڱ��ڽ��� �ΰ��̹Ƿ� Ȧ¦�� ������ �����ʾ� �Ѵٻ���.
			if(num % i == 0)					// ������ ������ �ʰ��ϴ� ����� �����Ƿ� ������ �� ������ �����Ѵ�.
				count++;
		}
		if(count % 2 == 0) {
			return num;
		} else {
			return num * (-1);
		}
	}
	
	static int sum(int left, int right) {
		int sum = 0;
		for(int j = left; j <= right; j++) {
			sum += numberWithSign(j);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(24, 27));
	}
}
