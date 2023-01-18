package chapter13;

public class MemberInner {
	int a = 10;
	private int b=100;
	static int c=200;
	// 생성자
	// 메소드
	// 내부 클래스
	class Inner{
		// 필드
		// 생성자
		// 메소
		public void printData() {
			System.out.println("int a : "+a);
			System.out.println("private b : "+b);
			System.out.println("static c : "+c);
		}
	}
	public static void main(String[] args) {
		
		//외부
//		MemberInner outter = new MemberInner();
		
		//내부
//		MemberInner.Inner inner = outter.new Inner();
		// 이벤트처리할때 자주 쓰임
		MemberInner.Inner inner = new MemberInner().new Inner();
		
		inner.printData();
	
	}
}
