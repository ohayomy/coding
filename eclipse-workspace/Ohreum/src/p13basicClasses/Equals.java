package p13basicClasses;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			
			Student std = (Student)obj;
			
			if(studentID == std.studentID)
				return true;
			else
				return false;
		}
		return false;
		
	}
}

public class Equals {
	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); // 서로 물리적으로 힙메모리 주소가 다름
		System.out.println(str1.equals(str2)); // 그러나 문자열로 봤을 때 논리적으로 같음(String에서는 이퀄스가 재정의되어있기 때문)
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);     //메모리주소가 다름.
		System.out.println(std1.equals(std2)); //위랑똑같이 다름. 그래서 재정의하고자 함.(겹치는 중복데이터 제거위함)
	}

}
