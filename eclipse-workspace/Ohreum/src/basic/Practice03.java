package basic;

public class Practice03 {

	public static void main(String[] args) {
		int month = 10;
		int day;
		switch(month) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			case 4:case 6:case 9:case 11:
				day = 30;
				break;
			default:
				day=0;
				break;
		}
		System.out.println(month +"월은 " + day + "일까지 있습니다");
	
		
		
		
		int num1 = 1;
		int sum1 = 0;
		while(num1 <= 10) {
			sum1 += num1;
			num1++;
		}
		System.out.println("총합은 " + sum1 + "입니다");
		
		int num2 = 1;
		int sum2 = 0;
		while(num1 < 1) {
			sum2 += num2;
			num2++;
		}
		System.out.println("총합은 " + sum2 + "입니다");
//		vs 코드와 달리 while 안에 트루나 폴스 넣을시 오류로 출력함
		
		int num3 = 1;
		int sum3 = 0;
		do {
			sum3 += num3;
			num3++;
		}while(false);
		System.out.println("총합은 " + sum3 + "입니다");
//		do while문은 최소 한번은 실행하고 난 후 조건을 확인한다. 거의쓰지않는다.

	}
}
