package p06singleton;

import java.util.Calendar;

public class P2SingletonTest {

		public static void main(String[] args) {
			
			P1Singleton c1 = P1Singleton.getInstance();
			
			P1Singleton c2 = P1Singleton.getInstance();
			
//			P1Singleton c3 = new P1Singleton(); 하면 에러남
			
			
			System.out.println(c1);
			System.out.println(c2);
			
			
			Calendar cal = Calendar.getInstance();
			System.out.println(cal);
		}
}
