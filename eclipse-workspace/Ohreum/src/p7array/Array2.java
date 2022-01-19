package p7array;

public class Array2 {
	
	public static void main(String[] args) {
		
		double[] array = new double[5];
				
		int size = 0;
		array[0] = 10.0; size++;
		array[1] = 20.0; size++;
		array[2] = 30.0; size++;
		
		double total = 1.0;
		
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
			total *= array[i];
		}
		System.out.println("total = " + total);
	}
}
// 정의되지 않은 건 0이고, 다 곱해버리면 total이 0이 되므로 유효한 값까지만 곱하고 싶을 때, size를 추가로 정의해서 i의 범위에 추가해준다.