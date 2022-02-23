package gloomyday;

public class Practice008 {
	
	static int numberWithSign(int num) {
		int count = 0;
		for(int i = 2; i <= (num / 2); i++) { 	// 약수 중 1과 자기자신은 두개이므로 홀짝에 영향을 주지않아 둘다뺐다.
			if(num % i == 0)					// 숫자의 절반을 초과하는 약수는 없으므로 루프를 덜 돌도록 제외한다.
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
