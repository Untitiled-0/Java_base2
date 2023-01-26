package chapter22;

public class DaeMonTread_main implements Runnable{
// Runnable의 run()은 Thread의 객체로 반드시 변환하여 사용해야 스레드로 활용가능하다.
	
	
	// 자동저장 안함
	static boolean autoSave = false;
	
	public static void main(String[] args) {
	
		
		// 데몬스레드로 설정 : 메인스레드가 종료되면 함께 종료됨
		DaeMonTread_main dm = new DaeMonTread_main();
		
		Thread t = new Thread(dm);
		
		t.setDaemon(true);
		t.start();
		
		for(int i =1; i<=15; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(i%3==0)   // 3초 뒤에 저장모드로 전환
				autoSave=true;
			
		}
		
	}

	// 3초마다 저장을 무한 반복
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(3000);		
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(autoSave==true) {
				System.out.println("자동저장됨");
			}
		}
		
	}
}
