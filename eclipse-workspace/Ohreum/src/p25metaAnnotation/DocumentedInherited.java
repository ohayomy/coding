package p25metaAnnotation;

public class DocumentedInherited {
	//자바독으로 작성한 문서에 포함시키려면 @Documented를 붙인다.
	
	
	
	//애너테이션을 자손 클래스에 상속하고자 할 때, @Inherited를 붙인다.
	
	@Inherited					//@SuperAnno는 조상 애너테이션이고,
	@interface SuperAnno {}		//자손까지 영향 미치게 함
	
	@SuperAnno
	class Parent {}
	
	class Child extends Parent {} 	//Child에 애너테이션이 붙은 것으로 인식
	
}
