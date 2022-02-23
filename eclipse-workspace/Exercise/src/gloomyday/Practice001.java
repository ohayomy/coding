package gloomyday;

public class Practice001 {
	
	static int numberPlace(int num) {	//���� ������ �ڸ��� ���ϴ� �޼���. Ÿ���� �ڸ����� ���Ѵ�.
		int place = 0;
		while(num != 0) {
			num /= 10;
			place++;
		}
		return place;
	}
	
	static int changeTen(int targetPlace) {	//Ÿ�� �ڸ��� �������� �� �׺��� ū 10�� ������ ����.
		int result = 1;
		for (int i = 0; i < targetPlace; i++) {
			result *= 10;
		}
		return result;
	}
	
	static int countTarget(int num, int target) {	// ���� ���ڿ��� Ÿ���� ��������� ī��Ʈ
		int targetPlace = numberPlace(target);
		int countPart = 0;
		int targetTen = changeTen(targetPlace);
		
		while(num != 0) {
			if(num % targetTen == target)
				countPart ++;
			num /= 10;
		}
		return countPart;
	}
	
	public static int count(int start, int end, int target) {	// ���� �� ���ڵ��� ī��Ʈ��Ʈ ��
		int countTotal = 0;
		for (int i = start; i < end; i++) {
			countTotal += countTarget(i, target);
		}
		return countTotal;
	}
	
	public static void main(String[] args) {
		System.out.println(count(0, 1000000, 43));
	}
}
