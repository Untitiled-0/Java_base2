package chapter13;

public class StaticInner {
	int a = 10;
	private int b=100;
	static int c=200;
	// 생성자
	// 메소드
	// 내부 클래스
	static class Inner{ // 클래스가 스태틱이 아닐경우 필드에 스태틱을 사용할 수 없다.
		// 스ㅌ틱은 스태틱끼리만 쓸 수 있다. 
		// 필드
		static int d = 1000;
		// 생성자
		// 메소
		public void printData() {
			// a와 b는 static이 아니여서 데이터 영역에서 사용할 수 없음 
			
//			System.out.println("int a : "+a);
//			System.out.println("private b : "+b);
			System.out.println("static c : "+c);
			System.out.println("static d : "+d);
		}
	}
	public static void main(String[] args) {
		//외부
//		MemberInner outter = new MemberInner();
		//내부
//		MemberInner.Inner inner = outter.new Inner();
		// 이벤트처리할때 자주 쓰임
//		StaticInner.Inner inner = new StaticInner().new Inner();
//		inner.printData();
		
		Inner inner = new Inner();
		
		inner.printData();
		
		
		
	
	}
}
