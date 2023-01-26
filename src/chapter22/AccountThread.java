package chapter22;

import java.util.Random;

public class AccountThread implements Runnable {

	Account acc;

	public AccountThread(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {

		while (true) {

			try {
				System.out.println("잔액 : " + acc.balance);
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 출금액 100 ~ 300원 사이의 난수로 지정
			int money = (new Random().nextInt(3) + 1) * 100;

			acc.withdraw(money);
		}
	}

}
