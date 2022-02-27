package gloomyday;

import java.util.*;

public class Practice010 implements Runnable{

	Set<Integer> set = new TreeSet<>();

	public void randomNum() {
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
	}

	public void run() {
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.print("로또번호: ");
		Practice010 p = new Practice010();
		Thread th = new Thread(p);
		p.randomNum();
		th.start();
		Thread.sleep(2500);
		System.out.print("보너스:");
		
		
	}
}
