package gloomyday;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.*;
import java.util.stream.Stream;

public class Practice011 {
	
	static Set<Integer> set = new TreeSet<>();
	
	public static void randomNum() {
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
	}
	
	public static void lotto(Set<Integer> set) {
		Stream<Integer> stream = set.stream();
		stream.sorted().forEach(i -> System.out.print(i + " "));
	}
	
	public static void main(String[] args) {
		randomNum();
		lotto(set);
	}
}


