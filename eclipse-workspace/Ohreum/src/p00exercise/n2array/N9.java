package p00exercise.n2array;

class N9 {
	public static void main(String[] args) {
//		 �־��� �迭�� �ð�������� 90�� ȸ�����Ѽ� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
		
		char[][] star = { 
				{ '*', '*', ' ', ' ', ' ' },
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } 
		};
		char[][] result = new char[star[0].length][star.length];
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				/* �˸��� �ڵ带 �־� �ϼ��Ͻÿ� (1) . */
				
				result[j][star.length -1 -i] = star[i][j];
				
				
				//
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}


//������ :
//** 
//**
//***** 
//*****
//
//**** 
//**** 
//** 
//** 
//**