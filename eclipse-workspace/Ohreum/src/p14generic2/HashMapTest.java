package p14generic2;
import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>();
		map.put("�ڹ�", new Student("����", 8, 18));
		
		Student s =map.get("�ڹ�");
		
		System.out.println(map);
		System.out.println(s.name);
	}
}
