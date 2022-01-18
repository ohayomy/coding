package p3reference;

public class P3Student {
	
	int studentID;
	String studentName;
	
	P4Subject korean;
	P4Subject math;
	
	public P3Student() {
		korean = new P4Subject();
		math = new P4Subject();
	}
	
	public P3Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korean = new P4Subject();
		math = new P4Subject();
	}
	
	public void setKorean(String name, int score) {
		korean.setSubjectName(name);
		korean.setScore(score);
	}
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korean.getScore() + math.getScore();
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}
