package p26thread;

public class SynchronizationNew{
		public static void main(String args[]) {
			Runnable r = new RunnableEx14();
			new Thread(r).start();
			new Thread(r).start();
		}
	}

	class Account3 {
		private int balance = 1000;

		public int getBalance() {
			return balance;
		}

		public synchronized void withdraw(int money){
			if(balance >= money) {
				try { Thread.sleep(500);} catch(InterruptedException e) {}
				balance -= money;
			}
		}
	}

	class RunnableEx14 implements Runnable {
			Account3 acc = new Account3();

		public void run() {
				
			while(acc.getBalance() > 0) {
				long startTime = System.currentTimeMillis();
				System.out.println(startTime);
				
				int money = (int)(Math.random() * 3 + 1) * 100;
				acc.withdraw(money);
				System.out.println("balance:"+acc.getBalance());
				
				long endTime = System.currentTimeMillis();
				System.out.println(endTime - startTime);
			}
		}
	}
	//시간집단은 500언저리값과 1000언저리값 두개로 나뉜다.
	//37줄의 출력을 주석처리시켜도 걸리는 시간엔 거의 차이가 없었다. 즉, 대부분의 시간은 withdraw를 시행하는데 들어갔음을 어림짐작할수 있다.
	//그래서 뒷 쓰레드가 온전히 앞쓰레드가 가진 withdraw의 락을 기다리기 때문에 2배의 시간이 걸렸다고 볼 수 있다.
	//마지막에는 500동안 기다렸는데 앞에놈이 돈을 다빼버려서 withdraw들어가서 아무것도안하고(시간 0 걸림) 나왔기때문에
	//기다린시간만 500이라서 500이 찍힌다.
	//예컨데 마지막 100원을 출금해서 0이 된 상황에서, 1000걸린놈이 실제로 100원을 뺀놈이고, 500걸린놈이 허탕친놈이다.
	//100원이 여러번 찍힐 때 시간이 0으로 나오는 것도 기다린 시간도 없고 실행한 시간도 없기때문.
	
	
	
	
	