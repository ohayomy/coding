package p26thread;

public class DaemonThread implements Runnable {
	// 일반쓰레드의 작업을 돕는 보조쓰레드. 일반쓰레드가 모두작업을 마쳐서 프로그램이 종료되면 자동적으로 종료된다.
	// 가비지컬렉터, 자동저장, 화면 자동갱신등에 사용된다.
	// 무한루프와 조건문등을 이용해서 필요시에 작동하고 나머지시간엔 대기.(사진참고)
	static boolean autosave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new DaemonThread()); // Runnable r = new DaemonThread();
		t.setDaemon(true); // 이 부분이 없으면 데몬쓰레드로 취급되지않고 일반쓰레드로 돼서 종료되지않는다.
		t.start();

		for (int i = 10; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println(i);
			if (i == 6)
				autosave = true;
		}

		System.out.println("프로그램이 종료되었습니다. 데몬쓰레드도 자동으로 같이 종료됩니다.");

	}

	public void run() {
		while (true) { 			//무한루프
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			if (autosave)
				autosave();

		}
	}

	public void autosave() {
		System.out.println("데몬쓰레드에 의해 프로그램이 자동저장되었습니다.");
	}

}
