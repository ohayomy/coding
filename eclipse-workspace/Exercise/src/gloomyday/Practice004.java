package gloomyday;

import java.util.Scanner;

public class Practice004 {

	static int answer = (int) (Math.random() * 100) + 1;

	static void input() {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if (answer > num) {
			System.out.println("��");
			input();
		} else if (answer < num) {
			System.out.println("�ٿ�");
			input();
		} else if (answer == num) {
			System.out.println("�����Դϴ�!!");
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			input();}
		
	}


	public static void main(String[] args) {

		System.out.println("1~100 ���ٿ����");
		input();
		//��ǲ �޼��带 ���� �A ������ �ݺ��ϱ����ؼ�.

	}
}
