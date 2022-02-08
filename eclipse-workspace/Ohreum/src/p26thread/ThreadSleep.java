package p26thread;

public class ThreadSleep {
	//쓰레드의 실행을 제어하는 메서드. sleep join, interrupt, stop, suspend, resume, yield가 있다.
	//이 중 sleep과 yield만
	//static void sleep(long mills); 
	//static void yield();
	//이처럼 static이 붙는데, 자기 자신한테만 호출할 수 있는 메서드들이기때문이다.
	
	public static void main(String[] args) {
		Thread t4 = new Thread(new Thread4());
		Thread t5 = new Thread(new Thread5());
		t4.start();
		t5.start();
		
		delay(2000);
		
		System.out.println("main쓰레드 종료");
		
	}
	
	static void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch(InterruptedException e) {}
	}
	
}

class Thread4 implements Runnable {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(0);
		}
		System.out.println();
		System.out.println("Thread4종료");
	}
}

class Thread5 implements Runnable {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(1);
		}
		System.out.println();
		System.out.println("Thread5종료");
	}
}