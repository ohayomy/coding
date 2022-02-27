package gloomyday;

import java.util.Scanner;

public class Practice004 {

	static int answer = (int) (Math.random() * 100) + 1;

	static void input() {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if (answer > num) {
			System.out.println("업");
			input();
		} else if (answer < num) {
			System.out.println("다운");
			input();
		} else if (answer == num) {
			System.out.println("정답입니다!!");
		} else {
			System.out.println("잘못된 입력입니다.");
			input();}
		
	}


	public static void main(String[] args) {

		System.out.println("1~100 업다운게임");
		input();
		//인풋 메서드를 따로 뺸 이유는 반복하기위해서.

	}
}
