package p00exercise.n2array;

public class N8 {

	public static void main(String[] args) {
//		�迭 answer�� ��� �����͸� �а� �� ������ ������ ��� ������ŭ '*'�� �� �׷����� �׸��� ���α׷��̴�.
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] count = new int[4];
		
		for (int i = 0; i < answer.length; i++) {
			//1����ĭ
			
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
//			Ǯ��
			
//			count[answer[i]-1]++;
//			��
			
			
			//
		}
		
		for (int i = 0; i < count.length; i++) {
			//2����ĭ
			
			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
//			Ǯ��
			
//			System.out.print(count[i]);
//			for (int j = 0; j < count[i]; j++) {
//				System.out.print("*");
//			}
//			��
			
			
			
			//
			System.out.println();
		}

	}

}
