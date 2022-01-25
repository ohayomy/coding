package p00exercise.n2array;

public class N8 {

	public static void main(String[] args) {
//		배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을 찍어서 그래프를 그리는 프로그램이다.
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] count = new int[4];
		
		for (int i = 0; i < answer.length; i++) {
			//1번빈칸
			
			switch(answer[i]) {
			case 1: count[0] +=1;
			break;
			case 2: count[1] +=1;
			break;
			case 3: count[2] +=1;
			break;
			case 4: count[3] +=1;
			break;
			}
//			풀이
			
//			count[answer[i]-1]++;
//			답
			
			
			//
		}
		
		for (int i = 0; i < count.length; i++) {
			//2번빈칸
			
			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
//			풀이
			
//			System.out.print(count[i]);
//			for (int j = 0; j < count[i]; j++) {
//				System.out.print("*");
//			}
//			답
			
			
			
			//
			System.out.println();
		}

	}

}
