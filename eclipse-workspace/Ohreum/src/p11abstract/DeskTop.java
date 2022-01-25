package p11abstract;

public class DeskTop extends Computer {
	//추상클래스의 하위클래스지만 모든걸 구현했기에 추상클래스가아님
	
	@Override          //어노테이션(주석)역할을 하며, 오타를 잡아주기도 함.
	public void display() {
		System.out.println("DeskTop display()");
	}
	
	@Override
	public void typing() {
		System.out.println("DeskTop typing()");

	}
//	public void turnOn() {
//		System.out.println("DeskTop turnOn()");
//		
//	}

}
