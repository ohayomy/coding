package p25metaAnnotation;
import java.lang.annotation.*;
/*애너테이션.
1.애너테이션을 직접 만들어 쓸 수 있다.
2.애너테이션의 메서드는 추상메서드이며, 애너테이션을 적용할 때 지정한다.(순서 x)

애너테이션의 요소
1. 적용시 값을 지정하지 않으면 사용될 수 있는 기본값 지정 가능(null제외)
2. 요소가 하나이고 이름이 value일 때는 요소의 이름 생략 가능
3. 요소의 타입이 배열인 경우 괄호를 사용해야 하며, 값이 없을 때는 빈괄호라도 꼭 사용한다.

모든 애너테이션의 조상
1. Annotation은 모든 애너테이션의 조상이지만 상속은 불가하다.
2. 사실 Annotation은 인터페이스이다.
3. 모든 애너테이션은 Annotation의 추상메서드들을 가지고 있다. 구현하지 않고 필요도 없지만 사용은 가능하다.

마커 애너테이션
1.요소가 하나도 정의되지 않은 애너테이션

애너테이션 요소의 규칙
1. 요소의 타입은 기본형, String, enum, 애너테이션, Class만 허용됨
2.괄호()안에 매개변수를 선언할 수 없다.
3.예외를 선언할 수 없다.
4.요소를 타입 매개변수로 정의할 수 없다. */

@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
class Ex12_8 {
	public static void main(String args[]) {
		// Ex12_8의 Class객체를 얻는다.
		Class<Ex12_8> cls = Ex12_8.class;

		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());		//aaa
		System.out.println("anno.testDate().yymmdd()=" +anno.testDate().yymmdd()); //160101
		System.out.println("anno.testDate().hhmmss()=" +anno.testDate().hhmmss()); //235959

		for(String str : anno.testTools())
			System.out.println("testTools="+str);

		System.out.println();

		// Ex12_8에 적용된 모든 애너테이션을 가져온다.
		Annotation[] annoArr = cls.getAnnotations(); //유효하지않은 값을 넣어서 무시된 @SuppressWarnings는 호출되지않는다.

		for(Annotation a : annoArr)
			System.out.println(a);
	} // main의 끝
}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정 
@interface TestInfo {
	int       count()	  	default 1;
	String    testedBy();
	String[]  testTools() 	default "JUnit";  //배열로 여러 값을 줄 수도 있다.
	TestType  testType()    default TestType.FIRST;
	DateTime  testDate();
}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }

