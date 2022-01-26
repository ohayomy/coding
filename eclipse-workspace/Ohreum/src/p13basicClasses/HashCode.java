package p13basicClasses;

class Student2 {
	int studentID;
	String studentName;
	
	Student2(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	public int hashCode() {
		return studentID;
	}
}


public class HashCode {
//hashCode메서드 : 정보를 저장, 검색하기 위해 사용하는 자료구조. 자료의 특정 키값에 대해 저장 위치를 반환해주는 해시 함수를 사용함.
	//힙 메모리에 인스턴스가 저장되는 방식이 hash이다.
	//equals의 연장선이라고 보면된다. 결국 equals에서 hashCode반환값이 같은게 true이고 다른게 false였기 때문.
	//equals를 재정의했을 때는 hashCode도 재정의해주는게 정석이다. 또다른 프로세스에서 오류가 날 수 있기때문.
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		Student2 std1 = new Student2(10001, "Tomas");
		Student2 std2 = new Student2(10001, "Tomas");
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());//원래 두 값이 다르지만 studentID로 같게 재정의해줬다.
		
		System.out.println(System.identityHashCode(std2)); // 이건 본연의 해시코드인데 재정의되지않았을 때는 이것과 값이 같다.
		System.out.println("=============");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); //스트링값이 같은 이유는 해시코드가 스트링클래스에서 재정의되어있기때문.
		System.out.println("=============");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); // 하지만 엄밀히 보면 다르다.
	}

}
