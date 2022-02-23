package gloomyday;

import java.util.Scanner;

public class Practice003 {
	 public static void main(String[] args) {
		int randomNumber = (int)(Math.random() * 3) + 1;
		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("가위(1)를 냈습니다");
			break;
		case 2:
			System.out.println("바위(2)를 냈습니다");
			break;
		case 3:
			System.out.println("보(3)를 냈습니다");
			break;

		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		
		System.out.println("컴퓨터: " + randomNumber);
		
		if(num - randomNumber == -2 || num - randomNumber == 1) {
			System.out.println("승리");
		}	else if(num == randomNumber){
			System.out.println("무승부");
		} else  {
			System.out.println("패배");
		}
		
	}
}
