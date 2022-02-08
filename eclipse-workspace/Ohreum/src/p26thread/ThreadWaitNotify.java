package p26thread;

public class ThreadWaitNotify {
	//동기화의 효율을 높이기 위해 도입된 개념이다.
	//락을 하나의 쓰레드가 계속 쥐고있어서 작업 진행에 차질이 빚어질 경우, 락을 잠시 풀고 다른쓰레드의 개입을 허용한다.
	//wait()는 작업을 수행할 수 있는 새 쓰레드에게 락을 넘겨주고 원래쓰레드를 해당 객체의 waiting pool에 대기시킨다.
	//notify()는 waiting pool에서 대기중인 쓰레드 하나를 깨워 락을 반납한다.
	//notifyAll()은 waiting pool에서 대기중인 모든 쓰레드를 깨운다. 모두를 꺠운다고 해도 하나만 사용된다.
	
}

class Account {
	int balance = 1000;
	
	public synchronized void withdraw(int money) {
		while(balance < money) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		balance -= money;
	}
	
	public synchronized void deposit(int money) {
		balance =+ money;
		notify();
	}
	//출금과 입금이 모두 임계영역으로 설정되어있다. 이 때, 출금해야 하는데 잔액이 모자란 경우, 출금하지 못하는 사태가 발생한다.
	//입금이 추가로 들어와야 출금이 가능하므로 입금을 기다려야 하는 상황인데 입출금이 모두 하나의 락으로 걸려있기 때문에 
	// 출금도, 입금도 못하는 예외가 발생한다. 이럴때 출금하려는 쓰레드를 웨이팅 풀에 대기시켜놓고, 락을 입금하려는 쓰레드에게 양도한다.
	// 입금하려는 쓰레드는 작업을 마친 뒤 notify로 이를 알리며 락을 반납한다. 그러면 다시 출금이 가능하다.
	// 이 상황은 입금에는 한도가 없으니 간단하지만 입금에도 한도가 생기면 더 복잡해진다.
	//양쪽 모두에 wait와 notify를 적용해야 한다.
	// 또한 wait와 notify가 어느쪽 메서드인지 구분이 안가는 문제가 발생하므로 생겨난 개념이 Lock과 condition이다.(아직 다루지 않음)
}
