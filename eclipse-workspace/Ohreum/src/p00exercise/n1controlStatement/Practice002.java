package p00exercise.n1controlStatement;

public class Practice002 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100; i >0; i--) {
			System.out.print(i + "\t");
			count++;
			if(count % 20 == 0)
				System.out.print("\n");
		}
	}
}
