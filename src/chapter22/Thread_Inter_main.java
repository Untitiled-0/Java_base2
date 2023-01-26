package chapter22;

public class Thread_Inter_main implements Runnable{

	public static void main(String[] args) {
		
		System.out.println("메인 클래스 시작");
		Thread_Inter_main t1 = new Thread_Inter_main();
//		t1.run();
		Thread mThread = new Thread(t1); // 일반 클래스의 객체를 스레드로 변환
		mThread.start();
		System.out.println("메인 클래스 종료");
		
		
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
