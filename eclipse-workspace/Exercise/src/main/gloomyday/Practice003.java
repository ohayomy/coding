package gloomyday;

import java.util.Scanner;

public class Practice003 {
	 public static void main(String[] args) {
		int randomNumber = (int)(Math.random() * 3) + 1;
		System.out.println("����(1) ����(2) ��(3) �� �ϳ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("����(1)�� �½��ϴ�");
			break;
		case 2:
			System.out.println("����(2)�� �½��ϴ�");
			break;
		case 3:
			System.out.println("��(3)�� �½��ϴ�");
			break;

		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
		
		System.out.println("��ǻ��: " + randomNumber);
		
		if(num - randomNumber == -2 || num - randomNumber == 1) {
			System.out.println("�¸�");
		}	else if(num == randomNumber){
			System.out.println("���º�");
		} else  {
			System.out.println("�й�");
		}
		
	}
}
