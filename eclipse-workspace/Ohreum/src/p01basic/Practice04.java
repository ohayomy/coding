package p01basic;

public class Practice04 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1)
				continue;
			System.out.println(i);
		}
//		중괄호 영역 잘 보기(toggle continue)
// 		continue도 기존의 방식으로 표현할 수 있지만(j를 따로 정의한 후 j += 2를 한다던지,
//		짝수라면 i *= 2를 한다던지), 컨티뉴 코드를 사용함에 따라
//		식의 논리구조를 깔끔하게 맞추고, 변경 및 수정이 자유롭다.

		
		int sum = 0;
		int num = 1;
		for (int j=0; ;j++) {
			sum += num;
			if(sum >= 100)
				break;
			num++;
		}
		System.out.println(num);
//		break문을 써서 조건식의 논리를 깔끔히 맞출 수 있다.
//		즉 n이 이미 더해지기 전이니까 프린트에서 1을 빼는 식을 넣는다던가 하는 지저분한 과정 없이
//		깔끔하게 표현이 된다.
	}

}
