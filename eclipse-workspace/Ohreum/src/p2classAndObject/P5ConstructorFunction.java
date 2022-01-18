package p2classAndObject;

public class P5ConstructorFunction {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	

	public P5ConstructorFunction() {}
//	1번쨰 디폴트형 생성자함수
	
	public P5ConstructorFunction(int id, String name) {
		studentID = id;
		studentName = name;
//  2번째 생성자함수
	

		P5ConstructorFunction studentLee = new P5ConstructorFunction();
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "번동";
		
//		P5ConstructorFunction studentLee = new P5ConstructorFunction(100, "이순신");
//		studentLee.address = "번동";
}
}
//자바 컴파일러는 기본적으로 클래스이름을 딴 생성자 함수를 만든다. 이는 사용자가 아무런 생성자 함수를 생성하지 않았을 때  생기는 디폴트생성자이며, 매개변수도 없고 구현코드도 없다.
//2개의 생성자 함수를 만들었는데, 아래것은 매개변수가 있다. 2번째를 아예 정의하지 않았다면 컴파일러에서 기본적으로 1번째처럼 디폴트생성자를 만들겠지만, 2번째만 정의한다면 1번째는 사라진다. 따라서 아래 표현식에서는 매개변수를 안 넣어줘서 에러가 날 것이다.
//맨 아래 주석처럼 매개변수를 넣어주던가, 매개변수가 없어도 되는 디폴트형 생성자함수도 원한다면 둘다 입력해주면 된다. 이 때, 필요에 의해 생성자 추가하는 경우 여러개의 생성자가 하나의 클래스에 있게 되는데 이를 생성자 오버로드라고 부른다.

