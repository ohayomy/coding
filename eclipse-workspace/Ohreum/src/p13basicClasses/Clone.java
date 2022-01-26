package p13basicClasses;

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x="+ x + "," + "y=" + y;
	}
}

class Circle implements Cloneable{ //implements Cloneable 안붙히면 오류남
	
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		return "원점은 " +this.point +"이고, 반지름은 " + radius + "입니다";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	// 우클릭 소스에서 오버라이딩 들어가서 클론선택
}
public class Clone {
//기본 틀(prototype)을 두고 복잡한 생성과정을 반복하지 않고 복제
	//객체지향 프로그램의 정보은닉, 객체보호의 관점에 위배됨.
	//객체의 clone()메서드 사용을 허용한다는 의미로 cloneable인터페이스를 명시해줌
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle =  new Circle(10, 20, 5);
		Circle cloneCircle = (Circle)circle.clone(); // 다운캐스팅
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));
		
		System.out.println(circle);
		System.out.println(cloneCircle);
	}
	
	
	
}
