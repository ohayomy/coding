package p14generic2;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorTest {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("À±¼¼ÁØ", 8, 23));
		list.add(new Student("±èÇÑ", 8, 7));
		list.add(new Student("À±½ÂÀÏ", 8, 29));
		
		Iterator<Student> it = list.iterator();
//		Iterator it = list.iterator();
		while(it.hasNext()) {
//			Student s = it.next();
//			Student s =(Student)it.next();
//			System.out.println(s.name);
			System.out.println(it.next().name);
		}
		
	} //main
}

class Student {
	String name = "";
	int ban; //¹İ
	int no;  //¹øÈ£
	
	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}