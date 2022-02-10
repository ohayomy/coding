package p26thread;

import javax.swing.JOptionPane;

public class IOBlocking {

	public static void main(String[] args) throws Exception {
		Thread3 th = new Thread3();

		th.start();

		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println(input);
		
		
		System.out.println(th.getPriority());
		//쓰레드는 기본적으로 5의 우선순위를 가진다. 1~10중에 10이 가장 우선순위가 높다. 높은 것 위주로 많이 작업될 확률이 높다.(완벽한건 아니다..)
		//getPriority와 setPriority로 적용과 반환가능하다.
		//마우스의 포인터의 쓰레드 우선순위가 매우 높은편이라고한다.(Windows의 경우 32단계의 우선순위가 있다.)
		
	}

}

class Thread3 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(10 - i);
			try {
				sleep(1000); // sleep메서드는 Thread클래스의 메서드이므로, 슬립을 사용하기위해 Runnable인터페이스 말고 Thread를 상속받는방법사용했다.
			} catch (Exception e) {
			}

		}
	}

}
