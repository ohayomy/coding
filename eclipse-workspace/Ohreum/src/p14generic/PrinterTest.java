package p14generic;

public class PrinterTest {
	
	public static void main(String[] args) {
		
		Printer<Powder> printer = new Printer<Powder>();
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
//		Powder powder = (Powder)printer.getMaterial(); 제네릭이 없었으면 이렇게 바꿔줘야한다.
		System.out.println(printer);
		//제네릭클래스를 쓰지않고 파우더와 플라스틱 모두 사용가능한 클래스를 구현하려면,
		//둘의 최대공약수가 오브젝트밖에 없으므로 오브젝트로 놓고 Printer를 작성해야하지만,
		//다시 사용할때는 앞에 (Powder)를 붙여서 다운캐스팅 해야한다.
		//제네릭을 쓰면 이와 같은 번거로운 과정이 생략된다.
		
		Printer<Plastic> printer2 = new Printer<Plastic>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		System.out.println(printer2);
		
		
//		Printer<Water> printer3 = new Printer<Water>();
//		printer3.setMaterial(new Water());
//		Water water = printer3.getMaterial();
//		System.out.println(printer3);
		
		//이처럼 Water는 원하지 않는 입력값인데 들어와도 컴파일 오류를 내지 않는다.
		//따라서 이를 방지하기 위해 원하는 입력값들에 제한을 둘 수 있다.
		//원하는 입력값인 파우더클래스와 플라스틱 클래스의 상위클래스 Material클래스를 정의하고
		//Printer클래스에 이를 상속받는 클래스들만 들어올 수 있다는 의미의 extends를 추가한다.
		//제네릭의 extends는 일반적인 extends와 다르다.
		//예컨데, 상위클래스를 정의하는 것뿐만 아니라 상위인터페이스를 사용해도 되는데,
		// 이 때도 implements를 사용하는것이 아니라 extends를 사용하기 때문이다.
		
		
		
	}
}
