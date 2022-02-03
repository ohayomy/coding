package p16lambda;


//함수를 변수처럼 사용하는 람다식들....

interface PrintString{
	void showString(String str);
}
public class LambdaTest {

	public static void main(String[] args) {
		
		PrintString lambdaPrint = str->System.out.println(str);
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint);
		
		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}
	
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	
	public static PrintString returnPrint() {
		return s->System.out.println(s+ " world");
	}
}
