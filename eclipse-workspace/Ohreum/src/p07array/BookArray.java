package p07array;

public class BookArray {
	
	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		//�̰͸����� ��ü 5���� ������ ���� �ƴϴ�. ��ü �ڸ��� 5���� �������� ���̴�.
		//���Ŀ� ��ü�� ���� �����Ͽ� �ڸ��� �־��־�� �Ѵ�. ?�ּҰ��� �����Ѵٰ� �ϴµ� �ȳ��´�.
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("����1", "�ڰ渮");
		library[1] = new Book("����2", "�ڰ渮");
		library[2] = new Book("����3", "�ڰ渮");
		library[3] = new Book("����4", "�ڰ渮");
		library[4] = new Book("����5", "�ڰ渮");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
	}
}
