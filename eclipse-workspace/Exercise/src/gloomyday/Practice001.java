package gloomyday;

public class Practice001 {
	
	static int numberPlace(int num) {	//각각 숫자의 자릿수 구하는 메서드. 타깃의 자리수도 구한다.
		int place = 0;
		while(num != 0) {
			num /= 10;
			place++;
		}
		return place;
	}
	
	static int changeTen(int targetPlace) {	//타깃 자리수 대입했을 때 그보다 큰 10의 제곱수 리턴.
		int result = 1;
		for (int i = 0; i < targetPlace; i++) {
			result *= 10;
		}
		return result;
	}
	
	static int countTarget(int num, int target) {	// 각각 숫자에서 타깃이 몇개나오는지 카운트
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
	
	public static int count(int start, int end, int target) {	// 범위 내 숫자들의 카운트파트 합
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
