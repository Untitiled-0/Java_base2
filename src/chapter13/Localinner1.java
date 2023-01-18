package chapter13;

import chapter13.MemberInner.Inner;

public class Localinner1 {

	int a = 100;

	// innerTest 함수 정의
	public void innerTest(int n) {
		int b = 200;
		final int c = n;

		// innerTest() 함수 내부 지역클래스 작성

		class Inner {

			// local 내부 클래스는 외부 클래스의 멤버변수와 상수들만 접근할 수 있다.
			public void getData() {
				System.out.println("int a : " + a);
				System.out.println("int b : " + b);
				System.out.println("int c : " + c);
			}// getData
		}//Inner
		Inner i = new Inner();
		i.getData();
	}//InnerTest
	// LOCAL 내부 클래스
	// 함수 내부에 있는 클래스라고 해도 함수만 호출하면 결과가 자동으로 나오는 것이 아니라
	// 객체를 만들어서 사용해야한다.

	public static void main(String[] args) {

		Localinner1 outer = new Localinner1();

		outer.innerTest(500);
		
	}
}
