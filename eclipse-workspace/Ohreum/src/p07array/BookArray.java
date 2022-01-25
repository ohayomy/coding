package p07array;

public class BookArray {
	
	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		//이것만으로 객체 5개가 생성된 것이 아니다. 객체 자리를 5군데 마련했을 뿐이다.
		//추후에 객체를 각각 생성하여 자리에 넣어주어야 한다. ?주소값도 생성됏다고 하는데 안나온다.
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("토지1", "박경리");
		library[1] = new Book("토지2", "박경리");
		library[2] = new Book("토지3", "박경리");
		library[3] = new Book("토지4", "박경리");
		library[4] = new Book("토지5", "박경리");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
	}
}
