package p25metaAnnotation;

public class Repeatable {


//반복해서 붙일 수 있는 애너테이션을 정의할 때 사용
@Repeatable(ToDos.class)		//ToDo애너테이션을 여러번 반복해서 쓸 수 있게 한다.
@interface ToDo {
	String value();
}

//@Repeatable이 붙은 애너테이션은 반복해서 붙일 수 있다.
@ToDo("delete test codes.")
@ToDo("override inherited methods")
class MyClass {
	....
}
	
//@Repeatable인 @ToDo를 하나로 묶을 컨테이너 애너테이션도 정의해야 함
@interface ToDos {	//여러개의 ToDo애너테이션을 담을 컨테이너 애너테이션 ToDos
	ToDo[] value(); //ToDo애너테이션 배열타입의 요소를 선언. 이름이 반드시 value여야함.
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}