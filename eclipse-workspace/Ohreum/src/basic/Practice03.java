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
		System.out.println(month +"���� " + day + "�ϱ��� �ֽ��ϴ�");
	
		
		
		
		int num1 = 1;
		int sum1 = 0;
		while(num1 <= 10) {
			sum1 += num1;
			num1++;
		}
		System.out.println("������ " + sum1 + "�Դϴ�");
		
		int num2 = 1;
		int sum2 = 0;
		while(num1 < 1) {
			sum2 += num2;
			num2++;
		}
		System.out.println("������ " + sum2 + "�Դϴ�");
//		vs �ڵ�� �޸� while �ȿ� Ʈ�糪 ���� ������ ������ �����
		
		int num3 = 1;
		int sum3 = 0;
		do {
			sum3 += num3;
			num3++;
		}while(false);
		System.out.println("������ " + sum3 + "�Դϴ�");
//		do while���� �ּ� �ѹ��� �����ϰ� �� �� ������ Ȯ���Ѵ�. ���Ǿ����ʴ´�.

	}
}
