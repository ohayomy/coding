package p16lambdaPractice;


public class Practice000{

//	Practice001 f = new Practice001() {
//		public Integer toInt(String s) {
//			return Integer.parseInt(s);
//		}
//	};
	
	Practice001 f = (String s) -> Integer.parseInt(s);
	
	int value = f.toInt("100");
	
	public static void main(String[] args) {
		Practice000 aaa = new Practice000();
		System.out.println(aaa.value);
		
	}


}
