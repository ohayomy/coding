package p5static;

public class P1Student {
	
	static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public P1Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	
}

//	바꿔서는 안되니 세터는 뺀다
//static변수는 프로그램이 메모리에 로드될때 데이터영역(상수영역)의 메모리에 생성되며, 인스턴스의 생성과 관계없이 클래스이름으로 직접 참조하기 때문에 클래스 변수라고 한다.
//멤버변수는 다른말로 인스턴스 변수라고 한다.