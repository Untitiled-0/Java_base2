package chapter13;

class Outter2{

	Runnable getRunnable(int i) {
		int num =100;
		
		// new 와 동시에 부모 클래스의 run메소드를 상속받으므로 추상 메소드인 run을 반드시 오버라이딩해서 사용해야한다.
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(num);
				System.out.println(i);
			} //run
		}; //return 
	} // runnable
	
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명의 클래스 변수");
			
		}
	};
}//outter2
public class AnonyMousInnerMain {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
	}
}
