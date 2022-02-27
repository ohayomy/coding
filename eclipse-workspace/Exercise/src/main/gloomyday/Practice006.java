package gloomyday;

import java.util.Scanner;

public class Practice006 {
	static int sum = 0;

	static void total(String s) {
		int num = Integer.parseInt(s);
		
		do {
			int quotient = num / 10;	//몫
			int remainder = num % 10;	//나머지
			sum += remainder;
			
			System.out.println("sum:" + sum + " num:" + quotient);
			num /= 10;

		} while (num != 0);
		//do-while문이 더 깔끔해보여서 썼다.
	}

	public static void main(String[] args) {
		System.out.print("숫자입력");
		Scanner scan = new Scanner(System.in);
		String string = scan.next();
		total(string);
		System.out.println(sum);

	}
}
