package p00exercise.n1controlStatement;

public class Practice005 {
	public static void main(String[] args) {
		long num = 0;
		String s = "        ";
		for (int i = 1; i < 9; i++) {
				System.out.print(s);
				System.out.println(num);
				num *= 10;
				num += i + (i * Math.pow(10,(2*i)));
				s = s.substring(1);
			
		}
	}
}
