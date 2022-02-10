package p27lambda;

import java.util.function.*;

class MyClass{
	
	MyClass() {}
	MyClass(Integer i) {}

}

public class Constructor {
	
	public static void main(String[] args) {
		
		Supplier<MyClass> s = () -> new MyClass();
		
		Supplier<MyClass> s2 = MyClass::new;
		//디폴트생성자의 메서드참조
		
		Function<Integer, MyClass> f = (i) -> new MyClass(i); //생성자에 매개변수가 필요한 경우(컨스트럭터)
		
		Function<Integer, MyClass> f2 = MyClass::new;
		//정수매개변수 생성자 메서드참조
		
		
		Function<Integer, int[]> a = x -> new int[x]; //람다식
		
		Function<Integer, int[]> a2 = int[]::new; //메서드 참조
		//배열의 메서드 참조
		
		//Runnable = void run(), Supplier<T>= T get(), Consumer<T>= void accept(T t), Function<T,R> = R apply(T t)
		//Predicate<T>= boolean test(T t)
		
			System.out.println(s.get());
			
	}
}
