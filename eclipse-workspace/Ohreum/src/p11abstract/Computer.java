package p11abstract;

public abstract class Computer {
	//추상메서드가 하나라도 있으면 abstract를 붙여야함
	//추상클래스는 인스턴스가 없다.
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}

}
