package p13basicClasses;

class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String toString() { //toString 메서드를 재정의한 모습.
		return title + "," + author;
	}
}

public class ToString { //사진참조
	public static void main(String[] args) {
		
		Book book = new Book("해변의카프카","하루키");
		System.out.println(book.toString()); // (p01basic.Static.java 참조)
		//인스턴스를 통해서 인스턴스메서드를 호출한 모습. 그 인스턴스메서드는 toString의 재정의이고, 따라서
		//주소값이 아니라 제목과 저자가 출력된다.
		
		String str = new String("test");
		System.out.println(str); //위와 다르게 이 줄은 바로 실행되는 이유는, String클래스에서는 이미 toString메서드가
		//문자열 자기 자신을 출력하도록 재정의를 마친 상태이기 때문이다.
		
		System.out.println(book);
		//book만 넣어도 정상출력되는 이유는, println을 컨트롤 우클릭해서 보면 알 수있듯이 println(Object)꼴에서
		//valueOf가 null이 아닐 시 toString을 호출하는 메서드이기 때문에 주소값이 나와야 맞으나
		//toString을 재정의했기에 정상값이 나온다.
	}
}
