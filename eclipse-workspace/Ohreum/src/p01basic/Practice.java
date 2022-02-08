package p01basic;

import java.util.HashSet;
import java.util.Iterator;

public class Practice {
	public static void main(String[] args) {
		HashSet<Integer> aaa = new HashSet<Integer>();
		
		aaa.add(1);
		aaa.add(2);
		aaa.add(3);

		Iterator it = aaa.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
}
}