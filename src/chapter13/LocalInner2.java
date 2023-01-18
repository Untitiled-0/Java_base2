package chapter13;

class Outer {
	// 외부 클래스 멤버 변수

	int outNum = 100;
	static int sNum = 200;

	// Runnable 매개변수와 멤버변수는 final로 정의된다.
	// Runnable Data 영역에 들어가며 익명의 클래스라고 합니다.
	// Runnable에서 사용하는 매개변수나 속성은 final이다. 
	
	Runnable getRunnable(int i) {

		int num = 100; // final이기때문이다. 내부 클래스의 멤버변수

		class MyRunnable implements Runnable {
			int localNum = 10;

			public void run() {
//				num = 200; // final로 정의되기 때문에 안된다. 
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부)");
				System.out.println("outter.sNum=" + Outer.sNum + "(외부data영역)");
			}// run
		}// Runnable
		return new MyRunnable();
	}// method
}// 외부 클래스

public class LocalInner2 {

	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
