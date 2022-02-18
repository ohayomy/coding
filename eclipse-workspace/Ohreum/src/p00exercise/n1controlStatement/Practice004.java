package p00exercise.n1controlStatement;

public class Practice004 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + "\t");
			if(i % 10 == 0)
				System.out.print("\n");
		}
	}
}
