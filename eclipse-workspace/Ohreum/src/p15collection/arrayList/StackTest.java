package p15collection.arrayList;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	public String pop() {
//		String data = arrayStack.remove(arrayStack.size() -1);
		int leng = arrayStack.size();
		if(leng == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		return arrayStack.remove(leng -1);
	}
	
	public String peek() {  //데이터 유지한 채로 살짝 콕 찍어서 뭔지보기
		int leng = arrayStack.size();
		if(leng == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		return arrayStack.get(leng -1);
		
	}
}


public class StackTest {
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
	}
}
