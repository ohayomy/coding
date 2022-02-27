package gloomyday;

public class Practice012 {
	static int numPlace(int num) {
		int place = 0;
		while (num != 0) {
			num /= 10;
			place++;
		}
		return place;
	}

	static int changeTen(int targetPlace) {
		int targetTen = 1;
		while (targetPlace != 0) {
			targetTen *= 10;
			targetPlace--;
		}
		return targetTen;
	}

	static int countTarget(int num, int target) {
		int targetPlace = numPlace(target);
		int targetTen = changeTen(targetPlace);
		int countPart = 0;

		while (num != 0) {
			if (num % targetTen == target)
				countPart++;
			num /= 10;
		}
		return countPart;
	}

	static int count(int start, int end, int target) {
		int countTotal = 0;
		for (int i = start; i < end; i++) {
			countTotal += countTarget(i, target);
		}
		return countTotal;
	}
}
