package p14generic2;
import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>();
		map.put("자바", new Student("오름", 8, 18));
		
		Student s =map.get("자바");
		
		System.out.println(map);
		System.out.println(s.name);
	}
}
