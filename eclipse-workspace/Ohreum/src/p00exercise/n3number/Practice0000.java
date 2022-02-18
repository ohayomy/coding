package p00exercise.n3number;

public class Practice0000 {
	
	int x = 0;

	void didid(int star) {
		for(int j=0; j< 10; j++) {
			if(star / (int)Math.pow(10, j + 1) == 0) {
					System.out.println(j);
					x = j;
					break;
				}}
	}

	public static void main(String[] args) {
		Practice0000 p = new Practice0000();
		p.didid(29348);
		System.out.println(p.x);
	}
}
