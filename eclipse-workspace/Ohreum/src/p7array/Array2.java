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
// ���ǵ��� ���� �� 0�̰�, �� ���ع����� total�� 0�� �ǹǷ� ��ȿ�� �������� ���ϰ� ���� ��, size�� �߰��� �����ؼ� i�� ������ �߰����ش�.