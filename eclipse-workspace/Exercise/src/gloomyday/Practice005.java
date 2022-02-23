package gloomyday;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice005 {

	static ArrayList<Integer> array = new ArrayList<>();

	static void input() {
		System.out.print("더할 숫자를 입력해주세요");
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

		System.out.println("원하시는 숫자를 모두 입력한 후 0을 입력하면 더해집니다.");
		input();

	}
}
