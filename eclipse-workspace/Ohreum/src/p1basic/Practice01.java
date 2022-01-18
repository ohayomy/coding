package p1basic;
import javax.lang.model.element.VariableElement;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		System.out.println(num++);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num > 20);
		
		boolean beard = true;
		boolean tall = true;
		boolean shorthair = true;
//		boolean shorthair = false;
		if (beard && tall && shorthair) {
			System.out.println("남자입니다");
		
		}
		boolean skirt = true;
		boolean highheel = false;
		if (skirt || highheel) {
			System.out.println("여자입니다");
			
		}
		int num2 = (num > 10)? 20:30;
		System.out.println(num2);
//		(num % 2 == 1) ? System.out.println("홀수입니다"); : System.out.println("짝수입니다");
		
//		int number = 12;
//		int remain;
//	       remain = number % 2;
//	       
//	    (remain == 1) || System.out.println("짝수입니다");
//	    (remain == 1) && System.out.println("홀수입니다");
	}
	

}