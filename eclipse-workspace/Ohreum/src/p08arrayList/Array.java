package p08arrayList;

public class Array {
	public static void main(String[] args) {
	int[][] num = {{1,2,3}, {4,5,6}};
	
	System.out.println(num.length);
	System.out.println(num[0].length);
	System.out.println(num[1].length);
	
	for (int i = 0; i < num.length; i++) {
		for (int j = 0; j < num[0].length; j++) {
			System.out.println(num[i][j]);
		}
	}
	//다차원배열의 기본형
	
	
	
	char[][] alphabet = new char[2][13];
	char ch = 'a';
	
	for (int i = 0; i < alphabet.length; i++) {
		for (int j = 0; j < alphabet[0].length; j++) {
			alphabet[i][j] = ch;
			ch++;
		}
	}
	
	for (int i = 0; i < alphabet.length; i++) {
			System.out.println(alphabet[i]);
		
	}
	//다차원 배열에 알파벳 넣기
}
}