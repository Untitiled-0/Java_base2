package chapter22;

public class ThreadJoin implements Runnable {

	public static void main(String[] args) {
		
		System.out.println("메인클래스 시작");
		
		ThreadJoin t1 =new ThreadJoin();
		Thread JThread = new Thread(t1);
		JThread.start();
		
		try {
			JThread.join(); // run() 메서드와 Main()메서드가 join
			// run()가 완전히 종료될때까지 기다림 (위 -> 아래)
		} catch (Exception e) {
		
		}
		System.out.println("메인클래스 종료");
	}

	@Override
	public void run() {
		System.out.println("run() 메서드 수행!");
		first();
	}
	
	private void first() {
		System.out.println("first() 메서드 수행!");
		second();

	}
	private void second() {
		System.out.println("second() 메서드 수행!");
		
	}
	
}
