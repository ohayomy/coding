package p26thread;


public class ThreadSuspendResume {
		//suspend()는 일시정지, resume()은 재개, stop()은 쓰레드를 완전정지(소멸)시킨다.
		//사용하지 말 것이 권장된다.(쓰레드들의 데드락, 즉 교착상태를 유발할 수 있다.)
		//따라서 기존의 것을 쓰지 않고 새롭게 재정의한 것을 ThreadSuspendResume2에 적어놓았따.
	public static void main(String args[]) {
		RunImplEx10 r = new RunImplEx10();
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000);
			th1.suspend();	// 쓰레드 th1을 잠시 중단
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();	// 쓰레드 th1이 다시 동작
			Thread.sleep(3000);
			th1.stop();		// 쓰레드 th1이 완전 정지
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {}
	} // main
}

class RunImplEx10 implements Runnable {
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	} // run()
}