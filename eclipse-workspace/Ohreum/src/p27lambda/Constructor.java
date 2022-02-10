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
		//����Ʈ�������� �޼�������
		
		Function<Integer, MyClass> f = (i) -> new MyClass(i); //�����ڿ� �Ű������� �ʿ��� ���(����Ʈ����)
		
		Function<Integer, MyClass> f2 = MyClass::new;
		//�����Ű����� ������ �޼�������
		
		
		Function<Integer, int[]> a = x -> new int[x]; //���ٽ�
		
		Function<Integer, int[]> a2 = int[]::new; //�޼��� ����
		//�迭�� �޼��� ����
		
		//Runnable = void run(), Supplier<T>= T get(), Consumer<T>= void accept(T t), Function<T,R> = R apply(T t)
		//Predicate<T>= boolean test(T t)
		
			System.out.println(s.get());
			
	}
}
