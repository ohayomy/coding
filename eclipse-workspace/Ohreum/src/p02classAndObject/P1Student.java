package p02classAndObject;

public class P1Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
//	public static void main(String[] args) {
//		
//		P1Student studentOh = new P1Student();
//		studentOh.studentName = "오름";
//		studentOh.address = "서울시 은평구 갈현동";
//		
//		studentOh.showStudentInfo();
//	}
}
