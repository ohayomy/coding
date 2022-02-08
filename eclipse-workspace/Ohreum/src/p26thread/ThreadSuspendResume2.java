package p26thread;

public class ThreadSuspendResume2 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("*"); // Thread th = new Thread(new MyThread(), "*"); 가 된다...
		MyThread t2 = new MyThread("**");
		MyThread t3 = new MyThread("***");
		t1.start(); // t1.th.start(); 가 된다...
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(2000);
			t1.suspend();	// 쓰레드 th1을 잠시 중단
			Thread.sleep(2000);
			t2.suspend();
			Thread.sleep(3000);
			t1.resume();	// 쓰레드 th1이 다시 동작
			Thread.sleep(3000);
			t1.stop();		// 쓰레드 th1이 완전 정지
			t2.stop();
			Thread.sleep(2000);
			t3.stop();
		} catch (InterruptedException e) {}

	}
	

}
class MyThread implements Runnable {
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	
	MyThread(String name) {
		th = new Thread(this, name); //Thread(Runnable r, String name)
	}
	
	void start() {
		th.start();
	}
	
	void stop() {
		stopped = true;
		th.interrupt();
	}
	
	void suspend() {
		suspended = true;
		th.interrupt();
	}
	
	void resume() {
		suspended = false;
	}
	
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {}
			} else {
				Thread.yield();
				// 위의 반복문에서, suspend에 true값이 들어가서 if문이 멈춘다면, 쓰레드 일시정지의 상태이다.
				// 이 때, 바깥의 while문은 계속 돌고있다. 이처럼 일시정지이지만 바쁘게 돌아가는 것을 busy-waiting이라고 한다.
				// 이럴때 yield()메서드를 사용하면 불필요한 작동을 줄일 수 있는것이다.
				//실제로 else문을 추가해서 Thread.yield();를 넣자마자, CPU점유율이 확줄었다.
				//원래는 그냥 실행시키면 50퍼, 두번누르면 100퍼까지 찍고, 콘솔창 terminate시켜도 50퍼대를 유지하는데
				//yield메서드를 추가하자마자 1퍼대 이하로 떨어지는 것을 볼 수 있었다.
				//그러나 이 yield메서드 또한, OS스케쥴러에게 언질하는 형식으로 진행되기 때문에, 100퍼센트 작용한다고 확신할 수 없다.
				//때에 따라 전혀 효과가 없을 수도 있다.
			}
		}
	}
}
