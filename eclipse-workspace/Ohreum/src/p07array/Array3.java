package p07array;

public class Array3 {
	
	public static void main(String[] args) {
		
		char[] alphabet = new char[26];
		char ch = 'A'; //알파벳도 내부적으로는 정수로 정의된다. A=65이다. 큰따옴표를 쓰면 안된다.
		
		for (int i = 0; i < alphabet.length; i++, ch++) {    // 쉼표 쓴 거 기억
			alphabet[i] = ch;
		}
		
		for (int i = 0; i < alphabet.length; i++, ch++) {
			System.out.println(alphabet[i]);
		}
		//이런 일련의 과정이 불편하기 때문에 String으로 대체한다?
	}
}
