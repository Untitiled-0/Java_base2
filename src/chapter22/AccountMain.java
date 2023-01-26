package chapter22;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		// 스레드와는 별개로 값을 받아 입금 시키는 코드
//		Scanner scan = new Scanner(System.in);
//		System.out.print("잔액 : ");
//		int input = scan.nextInt();
//		AccountThread at;
//		at = new AccountThread(new Account(input));
//		at.run();

		 Account acc = new Account();
		 Runnable r = new AccountThread(acc);
		 Thread t1 = new Thread(r);
		 t1.start();
		 while(true){
			 Scanner scan = new Scanner(System.in);
			 int n = scan.nextInt();
			 acc.deposit(n);
		 }

	}
}
