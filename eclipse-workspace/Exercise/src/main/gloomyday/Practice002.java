package gloomyday;

public class Practice002 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("["+i+","+j+"]");
				count++;
				if(count % 5 == 0)
					System.out.print("\n");
			}
		}
	}
}
