package p07array;

public class Array {
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[] {0, 1, 2};
		int[] arr3 = {1, 2, 3};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
// 배열의 특성
// 1.메모리의 한 부분에 선언된다.
// 2.연속자료이다. 중간데이터를 하나 삭제하면 빈 채로 두는게 아닌, 한칸씩 앞으로 땡긴다.
// 3.fixed-length이다. 길이를 10으로 선언했을 떄, 더 늘리고 싶다면 아예 새로운 어레이를 선언한다. ?자바스크립트의 어레이푸시는 뭐가다른가
// 4. 배열을 선언할 때는 int[] array = new int[i] 로 표기한다.
// 5.선언과 동시에 초기화를 할 때는 개수를 표기하면 에러가 난다.
//    int[] array = {101, 102, 103} 이런식으로 표기한다.
//    만약 초기화 값 없이 개수로 선언만 한 경우 정수는 0, 실수는 0.0, 객체는 null로 초기화된다.
