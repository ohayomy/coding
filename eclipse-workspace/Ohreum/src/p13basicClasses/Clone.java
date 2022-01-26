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

class Circle implements Cloneable{ //implements Cloneable �Ⱥ����� ������
	
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		return "������ " +this.point +"�̰�, �������� " + radius + "�Դϴ�";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	// ��Ŭ�� �ҽ����� �������̵� ���� Ŭ�м���
}
public class Clone {
//�⺻ Ʋ(prototype)�� �ΰ� ������ ���������� �ݺ����� �ʰ� ����
	//��ü���� ���α׷��� ��������, ��ü��ȣ�� ������ �����.
	//��ü�� clone()�޼��� ����� ����Ѵٴ� �ǹ̷� cloneable�������̽��� �������
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle =  new Circle(10, 20, 5);
		Circle cloneCircle = (Circle)circle.clone(); // �ٿ�ĳ����
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));
		
		System.out.println(circle);
		System.out.println(cloneCircle);
	}
	
	
	
}
