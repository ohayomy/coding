package p07array;

public class Array3 {
	
	public static void main(String[] args) {
		
		char[] alphabet = new char[26];
		char ch = 'A'; //���ĺ��� ���������δ� ������ ���ǵȴ�. A=65�̴�. ū����ǥ�� ���� �ȵȴ�.
		
		for (int i = 0; i < alphabet.length; i++, ch++) {    // ��ǥ �� �� ���
			alphabet[i] = ch;
		}
		
		for (int i = 0; i < alphabet.length; i++, ch++) {
			System.out.println(alphabet[i]);
		}
		//�̷� �Ϸ��� ������ �����ϱ� ������ String���� ��ü�Ѵ�?
	}
}
