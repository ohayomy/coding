package p00exercise.n3number;

public class Practice000 {
	//초기버젼
	int countTarget(int start, int end, int target) {
		int n = 0;
		int x = 0;
		
		// start의 자리수 n
		for (int j = 0; j < 10; j++) {
			if (start / (int) Math.pow(10, j) == 0) {
				n = j;
				break;
			}
		}
		
		// target의 자리수 x
		for (int k = 0; k < 10; k++) {
			if (target / (int) Math.pow(10, k) == 0) {
				x = k;
				break;
			}
		}
		
		int count = 0;
		
		for (int i = start; i < end; i++) {
			for (int l = 0; l <= (n - x); l++) {
				int m = i;
				m = i % (int) Math.pow(10, (n - l));
				m = m / (int) Math.pow(10, (n - x - l));
				if (m == target) {
					count++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		Practice000 p = new Practice000();
		System.out.println(p.countTarget(77770, 77780, 77));
	}
}
