package p00exercise.n2array;

public class N10 {
//	https://developer-ek.tistory.com/11  �� ��������
	public static void main(String[] args) {
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';',
				':', ',', '.', '/' };
						 // 0	 1	  2	   3    4    5    6    7    8    9 
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String src = "abc123";
		String result = "";

		// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			/* (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ� . */
			
			if(ch>='a'&&ch<='z'){

				result += abcCode[ch-'a'];   //'a'�� 97

			}else{

				result += numCode[ch-'0'];

			}
			
			
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	} // end of main
} // end of class

//������ : 
//src:abc123 
//result:`~!wer



