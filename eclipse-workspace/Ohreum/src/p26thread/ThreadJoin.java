package p26thread;

public class ThreadJoin {

	static long startTime = 0;

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();

		Runnable r = new Thread2();
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
		// start는 또다른 호출스택에 run이라는 메서드를 올려놓는다. 우리가 줄곧써왓던 메인스택과는 별개의 스택이라서 멀티쓰레드가
		// 완성된다.(사진참고)
		// 쓰레드는 OS스케쥴러가 실행시키기때문에 jvm은 관여할 수 없다. 따라서 순서는 뒤죽박죽섞인다. 1이먼저 출력되는 경우도있다.
		startTime = System.currentTimeMillis();
		try {
			t1.join(); // main쓰레드가 t1쓰레드의 작업이 끝날때까지 기다린다.
			t2.join(); // main쓰레드가 t2쓰레드의 작업이 끝날때까지 기다린다.
			//join(long millis)안에 시간을 적어서 그시간만큼만 기다릴수도있다.

		} catch (InterruptedException e) {
		}

		System.out.println("소요시간" + (System.currentTimeMillis() - startTime));
		// 프로그램의 종료시기는 모든 쓰레드가 일을 마쳤을 때이다.
		// 멀티쓰레드로 작업을 처리하면 작업이 왔다갔다하므로 오히려 싱글쓰레드보다 시간이 더걸린다.
		// 그러나 시간이 좀 더 걸리더라도 두가지 일을 동시에 할 수 있다는 메리트가 있다.
		// 예를들어 카톡으로 동영상을 보내는 도중에 채팅을 쓴다던지..
		// 그러나, I/O블락킹(인풋아웃풋블락킹으로, 사용자의 입력을 기다리는 등 쓰레드가 멈춰있는 것)이 있는 경우 멀티쓰레드는 다른쓰레드의 일을
		// 처리하므로 효율적이다(사진참고)
		
		//쓰레드는 반드시 하나의 쓰레드그룹에 속해있어야한다. 아무것도정의하지않으면 main쓰레드그룹의 소속이다.
		//쓰레드 그룹을 생성하는 생성자 ThreadGroup이라는 클래스가있다. 여기서 ThreadGroup(String name)이라는 메서드를 사용한다.
	}
}

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(0);
		}
	}
}

class Thread2 implements Runnable {

	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(1);
		}
	}

}