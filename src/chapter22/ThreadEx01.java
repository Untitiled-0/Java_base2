package chapter22;

public class ThreadEx01 extends Thread {

	@Override
	public void run() {
		// 프로세스의 독립적인 수해를 위한 영역
		int i=0;
		while(i<10) {
			System.out.println(i+"번째 스레드 실행");
			i++;
		}
		
		
	}

}
