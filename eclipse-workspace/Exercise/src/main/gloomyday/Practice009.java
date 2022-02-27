package gloomyday;

import java.util.ArrayList;

public class Practice009 {

	static ArrayList<Integer> array = new ArrayList<>();

	static void arrayInit() {
		for (int i = 1; i <= 45; i++) {
			array.add(i);
		}
	}

	static void randomNum() {
		for (int j = 45; j > 38; j--) {
			if (j == 39)
				System.out.print("보너스: ");
			System.out.print(array.remove((int) (Math.random() * j)) + "  ");
		}
	}

	public static void main(String[] args) {
		System.out.println("로또 당첨 번호입니다.");
		arrayInit();
		randomNum();
	}
}
