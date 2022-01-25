package p02classAndObject;

public class P4MethodInClass {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		
		P1Student studentLee = new P1Student();
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "번동";
				
		P1Student studentKim = new P1Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "불광동";
				
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
				
	}
}

// 이 때, P1Student를 참조형 데이터 타입이라고 하며, 그 옆에 선언된 변수 studentLee를 참조변수라고 한다. 오른쪽 항의 new 다음에 오는 P1Student()를 컨스트럭터라고 한다.
//참조변수들은 스택메모리에 쌓이며, 우측 컨스트럭터에 의해 생성된 인스턴스들(studentLee.studentName 같은애들)은 힙(Heap)메모리에 동적으로 생성된다.
//덧셈함수같은 경우 스택메모리에 쌓이고 자동으로 사라지지만, 힙메모리같은 경우는 직접 지워줘야 한다. 가비지컬렉터 같은걸로
//사진파일 있음
//마지막 호출값 16진수이고, 8자리에 하나당 4비트(16진수이므로 2의 4승해서 4비트) 이므로 32비트이다. 즉 32비트 짜리 힙 메모리 내 주소값을 뜻한다. 이를 참조값이라고 한다.