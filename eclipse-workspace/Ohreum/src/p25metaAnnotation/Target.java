package p25metaAnnotation;

import java.lang.annotation.ElementType.*;

// 애너테이션을 정의할 때 적용대상 지정에 사용
@Target({FIELD, TYPE, TYPE_USE})  //적용대상이 FIELD TYPE TYPE_USE
public @interface MyAnnotation { }  //MyAnnotation을 정의

@MyAnnotation		//적용대상이  TYPE인 경우(클래스나 인터페이스, enum)
class Myclass {
	
	@MyAnnotation	//적용대상이 FIELD인 경우(멤버변수 등 필드 )
	int i;
	
	@MyAnnotation	//적용대상이 TYPE_USE인 경우
	Myclass mc;
	
}
