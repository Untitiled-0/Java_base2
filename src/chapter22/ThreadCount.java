package chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable {

	private int n;

	public ThreadCount(int n) {
		this.n = n;
	}

	public static void main(String[] args) {

		/*
		 * 스캐너를 이용하여 키보드에서 숫자를 입력받고 입력받은 숫자가 1씩 감도하다가 0이 되었을때 종료라는 메세지와 함께 스레드를 빠져나오도록
		 * 구현
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력 : ");
		int num = scan.nextInt();
		ThreadCount tc = new ThreadCount(num);
		Thread thread_c = new Thread(tc);

		thread_c.start();
		try {
			thread_c.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료");

	}

	@Override
	public void run() {
		for (int i = n; i >=0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
