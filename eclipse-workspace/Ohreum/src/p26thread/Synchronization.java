package p26thread;

public class Synchronization{
		//멀티쓰레드 프로세스에서는 다른 쓰레드의 작업에 영향을 미칠 수 있으므로,
		//진행중인 작업에 다른 쓰레드의 출입을 막도록 "임계영역(critical section)"을 설정하는 것이 동기화다.
		// 임계영역에는 자물쇠(락)을 얻은 단 하나의 쓰레드만 출입가능하다. 그 쓰레드는 작업을 마친 후 락을 반납한다.
		//임계영역은 프로세스의 속도를 저하시키므로 최소화시키는 것이 좋다.
		public static void main(String args[]) {
			Runnable r = new RunnableEx13();
			new Thread(r).start();  //ThreadGroup에 의해 참조되므로 gc대상이 아니다.
			new Thread(r).start();	//ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		}
	}

	class Account2 {
		private int balance = 1000; // private으로 해야 동기화가 의미가 있다. 다른쓰레드에서 직접건드려버리면의미가없기때문에...

		public int getBalance() {
			return balance;
		}

		public synchronized void withdraw(int money){ // synchronized으로 메서드를 임계영역으로설정(동기화). 음수가 나오는 것을 방지.
			if(balance >= money) {
				try { Thread.sleep(500);} catch(InterruptedException e) {}
				balance -= money;
//				System.out.println(balance); //이렇게 하면 중복호출을 막을 수 있다.
			}
		} // withdraw
	}

	class RunnableEx13 implements Runnable {
		Account2 acc = new Account2();

		public void run() {
			while(acc.getBalance() > 0) {
				// 100, 200, 300중에 한 값을 임의로 선택해서 출금(withdraw)
				int money = (int)(Math.random() * 3 + 1) * 100;
				acc.withdraw(money);
				System.out.println("balance:"+acc.getBalance()); //이렇게 출력하면, 쓰레드가 동시에 읽거나 왓다갓다하니까
																//동기화된 withdraw에 출력메서드를 넣는게 낫지 않나?
			}
		} // run()
	}