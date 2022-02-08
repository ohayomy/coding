package p26thread;

import javax.swing.JOptionPane;

public class ThreadInterrupt {
	//쓰레드의 작업을 중단시키고 싶거나, 중단된 쓰레드를 다시 작동시키고 싶을 떄 사용한다.
	// wait() sleep() join()등등을 방해한다.
	
	public static void main(String[] args) {
		Thread6 th = new Thread6();
		th.start();
		
		System.out.println("isInterrupted():" + th.isInterrupted()); //false 아직 방해받지않았다
		
		JOptionPane.showInputDialog("종료하려면 확인버튼을 눌러주세요");
		th.interrupt();
		System.out.println("isInterrupted():" + th.isInterrupted()); //true 방해받았다
		
		System.out.println("interrupted():" + Thread.interrupted()); //false main은방해받지않았다
		//isInterrupted()는 인스턴스에 사용. interrupted()는 스테틱메서드이므로 Thread로 사용.
		//여기서 Thread는 main쓰레드이므로 방해받지않아서 false이다.
		
	}
	
	
	
}

class Thread6 extends Thread {
	public void run() {
		int i = 10;
		
		while(i != 0 && !isInterrupted()) {
			System.out.println(i--);
//			try {
//				Thread.sleep(1000);
//			} catch(InterruptedException e) {}
			//인터럽트를 하기 위해서는 위의 트라이캐치를 쓰면 안된다.
			for(long x=0; x<2500000000L; x++); //그대신 시간지연을 이걸로 시켰다.
		}
		System.out.println();
		System.out.println();
		System.out.println("isInterrupted():" + this.isInterrupted()); //true
		System.out.println("interrupted():" + Thread.interrupted());	//true
		System.out.println("interrupted():" + Thread.interrupted());	//false
		//isInterrupted()와 달리 interrupted()는 현재쓰레드의 interrupted여부를 알려주고 false로 초기화한다.
		//위와 달리 여기의 Thread는 th이므로 처음엔 true 그다음엔 false가 된다.
		System.out.println("카운트가 종료되었습니다.");
	}
}