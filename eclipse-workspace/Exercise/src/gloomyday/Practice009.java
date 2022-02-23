package gloomyday;

import java.util.ArrayList;

public class Practice009 {
	
	static ArrayList<Integer> array = new ArrayList<>();
	
	static void arrayInit() {
		for (int i = 1; i <= 45; i++) {		//{1,2,3, ...,43,44,45}
			array.add(i);
		}
	}
	
	static void randomNum() {
		for(int j =45; j > 38; j --) {
			if(j == 39)
				System.out.print("보너스: ");
			System.out.print(array.remove((int)(Math.random() * j)) + "  ");
			// (int)((Math.random() * j) + 1)가  1~45지만, 인덱스를 호출해야하므로 1을빼서 0~44로한다.
			// remove는 제거와 동시에 제거한 엘리먼트를 리턴한다.
		}
	}
	
	//메서드가 둘다 JUnit 쓰기에 애매한것같다.랜덤넘버도 랜덤이라서 assertEquals못씀
	
	public static void main(String[] args) {
		System.out.println("로또 당첨 번호입니다.");
		arrayInit();
		randomNum();
	}
}
