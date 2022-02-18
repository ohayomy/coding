package p00exercise.n1controlStatement;

public class Practice003 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if((2 * i + 1) > 100)
				break;
			System.out.print((2 * i + 1) + "\t");
			count++;
			if(count % 5 == 0)
				System.out.print("\n");
			
		}
	}
}
