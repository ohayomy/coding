package gloomyday;

import java.util.Scanner;

public class Practice006 {
	static int sum = 0;

	static void total(String s) {
		int num = Integer.parseInt(s);
		
		do {
			int quotient = num / 10;	//��
			int remainder = num % 10;	//������
			sum += remainder;
			
			System.out.println("sum:" + sum + " num:" + quotient);
			num /= 10;

		} while (num != 0);
		//do-while���� �� ����غ����� ���.
	}

	public static void main(String[] args) {
		System.out.print("�����Է�");
		Scanner scan = new Scanner(System.in);
		String string = scan.next();
		total(string);
		System.out.println(sum);

	}
}
