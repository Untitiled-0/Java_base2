package chapter22;

public class ThreadEx02_Main {

	public static void main(String[] args) {
		
		ThreadEx02 t1 = new ThreadEx02();
		
		t1.start(); // start() 메소드를 수행하면 내부에 run()메소드가 수행된다.
	
		try {
			Thread.sleep(2000);
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}
}
