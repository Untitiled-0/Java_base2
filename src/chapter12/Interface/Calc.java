package chapter12.Interface;

public interface Calc {

	double PI = 3.14; // 대분자는 static
	int ERROR = 0000;

	int add(int n1, int n2);
	int substaract(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다. ");
		myMethod(); // 같은 클래스에서 private method를 부를 수 있는지
	}
	
	
	static int total(int[] arr) {
		int total=0;
		
		for(int i : arr) {
			total+=i;
		}
		myStaticMethod(); // private method 호출테스트
		return total;
	}

	private void myMethod() {
		System.out.println("private 메소드입니다.");
	}

	private static void myStaticMethod() {
		System.out.println("private static 메소드입니다.");
	}

	// 인터페이스 (설계) 뼈대를 만들어 놓은 것

	// 기본 인터페이스가 있다.
	/*
	 * 추상메소드:바디(구현부)가 없다 - 무조건 재정의가 필요 
	 * 
	 * -- 자바 8부터 제공이 됨 
	 * 디폴트메소드 : 기본수행문을 가질 수 있는 메소드이며 재정의를 할 수 있다. 
	 * 정적(Static) 메소드 : 객체 생성과 관계없이 인터페이스 타입(클래스명)으로 사용될 수 있다.
	 * private메소드 : 인터페이스를 구현한 클래스에서 사용가능하고 재정의 할 수 없음.
	 * -> 즉 인터페이스(현재의 클래스)에서 사용할 수 있음
	 * 
	 *
	 * 
	 * 
	 * 
	 */
}
