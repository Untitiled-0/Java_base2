package chapter22;

public class ThreadEx03_Main{

	public static void main(String[] args) {
		
		ThreadEx03 t1 = new ThreadEx03();
		ThreadEx03_2 t2 = new ThreadEx03_2();
		
		t1.start();
		t2.start();
		// 번걸아가면서 실행됨. 병행처리
		
	}
}
