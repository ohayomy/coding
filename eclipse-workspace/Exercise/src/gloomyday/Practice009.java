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
				System.out.print("���ʽ�: ");
			System.out.print(array.remove((int)(Math.random() * j)) + "  ");
			// (int)((Math.random() * j) + 1)��  1~45����, �ε����� ȣ���ؾ��ϹǷ� 1������ 0~44���Ѵ�.
			// remove�� ���ſ� ���ÿ� ������ ������Ʈ�� �����Ѵ�.
		}
	}
	
	//�޼��尡 �Ѵ� JUnit ���⿡ �ָ��ѰͰ���.�����ѹ��� �����̶� assertEquals����
	
	public static void main(String[] args) {
		System.out.println("�ζ� ��÷ ��ȣ�Դϴ�.");
		arrayInit();
		randomNum();
	}
}
