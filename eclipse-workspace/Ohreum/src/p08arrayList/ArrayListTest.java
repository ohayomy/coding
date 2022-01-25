package p08arrayList;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//데이터 타입을 지정하지 않으면 오브젝트로됩니다.
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
//		for(String s: list) {
//			System.out.println(s);
//		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}