package p25metaAnnotation;

import java.lang.annotation.RetentionPolicy;

//애너테이션이 유지(retention)되는 기간을 지정하는데 사용
//유지정책 1.SOURCE - 소스파일에만 존재, 클래스파일에는 존재하지 않음
//		2.CLASS - 클래스 파일에 존재, 실행시에는 사용불가. 기본값. 거의사용되지않음..
//		3.RUNTIME- 클래스 파일에 존재, 실행시에 사용가능.

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)  //컴파일러가 오버라이딩을 체크하는 목적이므로 클래스파일까지 존재할 이유가 없음.
public @interface Override { }

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FunctionalInterface {}

