package gloomyday;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice005 {

	static ArrayList<Integer> array = new ArrayList<>();

	static void input() {
		System.out.print("���� ���ڸ� �Է����ּ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int result = 0;
		if (num == 0) {
			for (int i : array) {
				result += i;
			}
			System.out.println(result);
		} else {

			array.add(num);
			input();
		}

	}

	public static void main(String[] args) {

		System.out.println("���Ͻô� ���ڸ� ��� �Է��� �� 0�� �Է��ϸ� �������ϴ�.");
		input();

	}
}
