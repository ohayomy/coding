package p26thread;

public class Synchronization{
		//멀티쓰레드 프로세스에서는 다른 쓰레드의 작업에 영향을 미칠 수 있으므로,
		//진행중인 작업에 다른 쓰레드의 출입을 막도록 "임계영역(critical section)"을 설정하는 것이 동기화다.
		//임계영역에는 자물쇠(락)을 얻은 단 하나의 쓰레드만 출입가능하다. 그 쓰레드는 작업을 마친 후 락을 반납한다.
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
//				그러나, 100원이 남았을 때, 200원이나 300원을 뺄려다가 허탕을 몇번 쳤는지 등, 실제로 출금했을 때 외의 정보는 알 수 없다.
//				어떻게 보면 제한된 정보를 주는 것.
			}
		} // withdraw
	}

	class RunnableEx13 implements Runnable {
		Account2 acc = new Account2();

		public void run() {
			while(acc.getBalance() > 0) {
				// 100, 200, 300중에 한 값을 임의로 선택해서 출금(withdraw)
				int money = (int)(Math.random() * 3 + 1) * 100;
				
				if(acc.getBalance() < money ) {continue;}
				//이렇게 쓰면 허탕치는 경우를 미리 걸러서 중복된 데이터를 없앨 수 있다.
				//다만, 이미 이 continue까지 통과한 이후에 동작하는 쓰레드가 바뀌어버리면,시간이 지나 다시 자기차례가 왔을 때, 허탕을 치게된다.
				//그런경우도 간혹가다 보인다.
				
				acc.withdraw(money);
				System.out.println("balance:"+acc.getBalance()); //이렇게 출력하면, 쓰레드가 동시에 읽거나 왓다갓다하니까
																//동기화된 withdraw에 출력메서드를 넣는게 낫지 않나?
			}
		} // run()
	}
	
	
	
	
	
	
	//먼저 100원이 여러번나오는 경우가 잦은 이유를 알아보자.
	//두 쓰레드가 메인메서드에서 start()명령을 받고 출발을 합니다. run메서드를 호출시킵니다.
	//run메서드의 while문은 총 4단계로 구성되었습니다.
	//1. acc.getBalance()를 호출해 while문에서 금액이 0보다 큰지 확인한다.
	//2. int money로 100원, 200원, 300원 중 랜덤한 금액을 생성한다.
	//3. acc.withdraw메서드를 실행시킨다.
	//4. acc.getBalance()를 호출해 남은 금액을 출력한다.
	// 이 중 1번,3번,4번에서 Account클래스를 참조한다.(정확히 말하면 acc라는 인스턴스가 클래스를 참조.)
	//금액이 클떄는 300원씩 빼도 상관이 없지만, 남은 금액이 200원이나 100원일 경우, 특히 100원일때는
	// 200원이나 300원이 랜덤으로 생성됐을 경우 뺄수 없어서 출력만 하고 쓰레드가 while문을 다시 실행하므로
	//100원이 출력되는 횟수가 더 잦은것이다.
	//
	// 0원이 두번 출력되는 이유는 두개의 쓰레드가 각자 0원일때 멈추고 종료되기에 두번일 수 밖에 없다.
	//좀 더 정확한 정보를 얻기 위해 각각의 쓰레드에 이름을 붙이고 시작시간과 종료시간을 호출시켜 확인해보았다.(다음파일)
	
	
	
	
	
	
	
	
	
	