package chapter09;

public class Child extends Parent {

	@Override //
	// 오버로딩 : 같은 메소드이지만 매개변수를 달리해서 통일성을 준것
	// 오버라이딩 : 같은 메소드이지만 매개변수까지 같지만 내용을 다르게 하고 상속시에만 사용할 수 있습니다.
	public void method2() {
		System.out.println("child method2()");
	}
	public void method3() {
		System.out.println("child method3()");
	}

}
