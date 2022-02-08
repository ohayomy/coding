package p15collection.arrayList;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int leng = arrayQueue.size();
		
		if(leng == 0) {
			System.out.println("큐가 비었습니다");
			return null;
		}
		return arrayQueue.remove(0);
	}
	
}

public class QueueTest {
public static void main(String[] args) {
		
		MyQueue Queue = new MyQueue();
		
		Queue.enQueue("a");
		Queue.enQueue("b");
		Queue.enQueue("c");
		
		
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		
		System.out.println(Queue.deQueue());
	}
}